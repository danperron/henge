package com.kenzan.henge.domain.legacy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.common.collect.Sets;
import com.kenzan.henge.config.TestContextConfig;
import com.kenzan.henge.domain.utils.JsonUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.validation.Validator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Tests for the {@link LegacyPropertyGroup} class.
 *
 * @author wmatsushita
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(TestContextConfig.class)
public class LegacyPropertyGroupTest {
    
    @Autowired
    private Validator domainValidator;

    @Autowired
    private JsonUtils jsonUtils;
    

    private String jsonValue;
    private LegacyPropertyGroup expectedLegacyPropertyGroupFromJsonValue;
    
    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        
        jsonValue = "{"
            + "\"key\":\"enterpriseedgecachemiddle\","
            + "\"type\":\"app\","
            + "\"version\":\"${project.version}\","
            + "\"properties\":[{"
                + "\"name\":\"datastax.enterpriseedgecache.cassandra.default.cluster\","
                + "\"description\":\"Cluster name\","
                + "\"type\":\"String\","
                + "\"values\":{"
                    + "\"default\":\"default\","
                    + "\"env=local\":\"local\","
                    + "\"env=dev\":\"Dev Cluster\","
                    + "\"env=engprod\":\"edgecassandra\""
                + "}"
            + "},{"
                + "\"name\":\"datastax.enterpriseedgecache.cassandra.default.hosts\","
                + "\"description\":\"Cluster hosts\","
                + "\"type\":\"String\","
                + "\"values\":{"
                    + "\"env=local\":\"127.0.0.1\","
                    + "\"env=engprod\":\"172.28.160.50,172.28.162.176,172.28.165.238\","
                    + "\"env=dev\":\"10.2.5.132,10.2.4.132,10.2.5.4\","
                    + "\"default\":\"prefscassandra-pri.${archaius.deployment.region}a.${aesd.archaius.deployment.domain},prefscassandra-pri.${archaius.deployment.region}b.${aesd.archaius.deployment.domain},prefscassandra-pri.${archaius.deployment.region}c.${aesd.archaius.deployment.domain}\""
                + "}"
            + "}]"
        + "}";
        
        Map<String, String> values1 = new HashMap<>();
        values1.put("default", "default");
        values1.put("env=local", "local");
        values1.put("env=dev", "Dev Cluster");
        values1.put("env=engprod", "edgecassandra");
        
        Map<String, String> values2 = new HashMap<>();
        values2.put("env=local", "127.0.0.1");
        values2.put("env=engprod", "172.28.160.50,172.28.162.176,172.28.165.238");
        values2.put("env=dev", "10.2.5.132,10.2.4.132,10.2.5.4");
        values2.put("default", "prefscassandra-pri.${archaius.deployment.region}a.${aesd.archaius.deployment.domain},prefscassandra-pri.${archaius.deployment.region}b.${aesd.archaius.deployment.domain},prefscassandra-pri.${archaius.deployment.region}c.${aesd.archaius.deployment.domain}");
        
        LegacyProperty legacyProperty1 = LegacyProperty.builder("datastax.enterpriseedgecache.cassandra.default.cluster")
            .withDescription("Cluster name")
            .withType("String")
            .withValues(values1)
            .build();
        
        LegacyProperty legacyProperty2 = LegacyProperty.builder("datastax.enterpriseedgecache.cassandra.default.hosts")
            .withDescription("Cluster hosts")
            .withType("String")
            .withValues(values2)
            .build();

        expectedLegacyPropertyGroupFromJsonValue = LegacyPropertyGroup.builder("enterpriseedgecachemiddle","app")
            .withVersion("${project.version}")
            .withProperties(Sets.newHashSet(legacyProperty1, legacyProperty2))
            .build();

    }

    @Test
    public void testBuilder() {
        
        Map<String, String> values = new HashMap<>();
        values.put("env=dev&stack=sbnet", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=stage&stack=sbnet", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=prod&stack=sbnet", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        
        LegacyProperty legacyProperty1 = LegacyProperty.builder("eureka.vipAddress").withDescription("eureka.vipAddress").withType("String").withValues(values).build();
        
        Set<LegacyProperty> legacyProperties = Sets.newHashSet(legacyProperty1);
        LegacyPropertyGroup legacyPropertyGroup1 = LegacyPropertyGroup.builder("key-1", "app").withVersion("1.0.0").withProperties(legacyProperties).build();
        
        assertEquals("key-1", legacyPropertyGroup1.getKey());
        assertEquals("app", legacyPropertyGroup1.getType());
        assertEquals("1.0.0", legacyPropertyGroup1.getVersion());
        assertEquals(legacyProperties, legacyPropertyGroup1.getProperties());
        
    }
    
    @Test
    public void testEqualityAndHashCode() {

        Map<String, String> values = new HashMap<>();
        values.put("env=dev&stack=sbnet", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=stage&stack=sbnet", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=prod&stack=sbnet", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        
        LegacyProperty legacyProperty1 = LegacyProperty.builder("eureka.vipAddress").withDescription("eureka.vipAddress").withType("String").withValues(values).build();        
        
        LegacyPropertyGroup legacyPropertyGroup1 = LegacyPropertyGroup.builder("key-1", "app").withVersion("1.0.0").withProperties(Sets.newHashSet(legacyProperty1)).build();
        
        LegacyPropertyGroup legacyPropertyGroup2 = LegacyPropertyGroup.builder(legacyPropertyGroup1).build(domainValidator);
        
        assertFalse(legacyPropertyGroup1.equals(null));
        assertFalse(legacyPropertyGroup1.equals(new Object()));
        assertFalse(legacyPropertyGroup1 == legacyPropertyGroup2);
        assertEquals(legacyPropertyGroup1, legacyPropertyGroup2);
        
        assertEquals(legacyPropertyGroup1.hashCode(), legacyPropertyGroup2.hashCode());
        
    }
    
    @Test
    public void fromJSON() throws JsonParseException, JsonMappingException, IOException {
        LegacyPropertyGroup legacyPropertyGroup1 = jsonUtils.fromJson(jsonValue, LegacyPropertyGroup.class);

        assertEquals(expectedLegacyPropertyGroupFromJsonValue, legacyPropertyGroup1);
    }
    
    @Test
    public void toJSON() throws IOException {
        LegacyPropertyGroup legacyPropertyGroup1 = jsonUtils.fromJson(jsonValue, LegacyPropertyGroup.class);
        String json = jsonUtils.toJson(legacyPropertyGroup1);
        
        assertEquals(jsonValue, json);
    }
    
    @Configuration
    @ComponentScan("com.kenzan.henge")
    public static class TestConfig {
        
    }

}
