package com.kenzan.henge.domain.legacy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.kenzan.henge.config.TestContextConfig;
import com.kenzan.henge.domain.utils.JsonUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Tests for the {@link LegacyProperty} class.
 *
 * @author wmatsushita
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(TestContextConfig.class)
public class LegacyPropertyTest {
    
    

    @Autowired
    private JsonUtils jsonUtils;
    
    private String jsonValue;
    private LegacyProperty expectedLegacyPropertyTestFromJsonValue;
    
    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        
        jsonValue = "{"
            + "\"name\":\"eureka.vipAddress\","
            + "\"description\":\"eureka.vipAddress\","
            + "\"type\":\"String\","
            + "\"values\":{"
                + "\"env=dev&stack=sbnet\":\"enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}\","
                + "\"env=stage&stack=sbnet\":\"enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}\","
                + "\"env=prod&stack=sbnet\":\"enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}\","
                + "\"env=engprod&stack=sbnet\":\"enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}\","
                + "\"env=prod&stack=drwn\":\"enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}\","
                + "\"env=stage&stack=drwn\":\"enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}\","
                + "\"env=prod&stack=spec\":\"enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}\","
                + "\"env=stage&stack=spec\":\"enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}\","
                + "\"env=engprod&subenv=engproduat\":\"enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}\","
                + "\"env=engprod&subenv=engproddevnew\":\"enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}\","
                + "\"env=engprod&subenv=engprodprod\":\"enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}\","
                + "\"env=dev&stack=ctva\":\"enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}\","
                + "\"env=dev&stack=devci\":\"enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}\","
                + "\"env=stage&stack=ctva\":\"enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}\","
                + "\"env=prod&stack=ctva\":\"enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}\","
                + "\"env=engprod&stack=ctva\":\"enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}\","
                + "\"default\":\"enterpriseedgecachemiddle\""
             + "}}";
        
        Map<String, String> values = new HashMap<>();
        values.put("env=dev&stack=sbnet", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=stage&stack=sbnet", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=prod&stack=sbnet", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=engprod&stack=sbnet", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=prod&stack=drwn", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=stage&stack=drwn", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=prod&stack=spec", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=stage&stack=spec", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=engprod&subenv=engproduat", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=engprod&subenv=engproddevnew", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=engprod&subenv=engprodprod", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=dev&stack=ctva", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=dev&stack=devci", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=stage&stack=ctva", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=prod&stack=ctva", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=engprod&stack=ctva", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("default", "enterpriseedgecachemiddle");
        
        expectedLegacyPropertyTestFromJsonValue = LegacyProperty.builder("eureka.vipAddress")
            .withDescription("eureka.vipAddress")
            .withType("String")
            .withValues(values)
            .build();

    }

    @Test
    public void testBuilder() {
        
        Map<String, String> values = new HashMap<>();
        values.put("env=dev&stack=sbnet", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=stage&stack=sbnet", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=prod&stack=sbnet", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        
        LegacyProperty legacyProperty1 = LegacyProperty.builder("eureka.vipAddress").withDescription("eureka.vipAddress").withType("String").withValues(values).build();
        
        assertEquals("eureka.vipAddress", legacyProperty1.getName());
        assertEquals("eureka.vipAddress", legacyProperty1.getDescription());
        assertEquals("String", legacyProperty1.getType());
        assertEquals(values, legacyProperty1.getValues());
        
    }
    
    @Test
    public void testEqualityAndHashCode() {

        Map<String, String> values = new HashMap<>();
        values.put("env=dev&stack=sbnet", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=stage&stack=sbnet", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        values.put("env=prod&stack=sbnet", "enterpriseedgecachemiddle.${archaius.deployment.stack}.${aesd.archaius.deployment.devphase}.${archaius.deployment.environment}");
        
        LegacyProperty legacyProperty1 = LegacyProperty.builder("eureka.vipAddress").withDescription("eureka.vipAddress").withType("String").withValues(values).build();        
        
        LegacyProperty legacyProperty2 = LegacyProperty.builder(legacyProperty1).build();
        
        assertFalse(legacyProperty1 == legacyProperty2);
        assertEquals(legacyProperty1, legacyProperty2);
        
        assertEquals(legacyProperty1.hashCode(), legacyProperty2.hashCode());
        
    }
    
    @Test
    public void fromJSON() throws JsonParseException, JsonMappingException, IOException {
        
        LegacyProperty legacyProperty1 = jsonUtils.fromJson(jsonValue, LegacyProperty.class);
        assertEquals(expectedLegacyPropertyTestFromJsonValue, legacyProperty1);
        
    }
    
    @Test
    public void toJSON() throws IOException {
        LegacyProperty legacyProperty1 = jsonUtils.fromJson(jsonValue, LegacyProperty.class);
        String json = jsonUtils.toJson(legacyProperty1);
        
        assertEquals(jsonValue, json);
    }
    
    @Configuration
    @ComponentScan("com.kenzan.henge")    
    public static class TestConfig {
        
    }

}
