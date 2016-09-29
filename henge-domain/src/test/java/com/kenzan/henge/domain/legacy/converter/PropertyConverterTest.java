package com.kenzan.henge.domain.legacy.converter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.kenzan.henge.domain.legacy.LegacyProperty;
import com.kenzan.henge.domain.model.Property;
import com.kenzan.henge.domain.model.PropertyScopedValue;
import com.kenzan.henge.domain.model.Scope;
import com.kenzan.henge.domain.utils.ScopeUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;


/**
 *
 *
 * @author wmatsushita
 */
public class PropertyConverterTest {


    @Test
    public void test() {
        
        final String legacyPropertyName = "legacy-property-test";
        final String legacyPropertyDescription = "legacy-property-description";
        final String legacyPropertyDefaultValue = "default-value"; 
        final Map<String, String> legacyPropertyValues = new HashMap<>();
        legacyPropertyValues.put("default", legacyPropertyDefaultValue);
        legacyPropertyValues.put("env=local", "value-1");
        legacyPropertyValues.put("env=dev&stack=sbnet", "value-2");
        
        LegacyProperty legacyProperty = LegacyProperty.builder(legacyPropertyName)
            .withDescription(legacyPropertyDescription)
            .withValues(legacyPropertyValues)
            .build();
        
        Converter<LegacyProperty, Property> converter = new PropertyConverter();
        Property property = converter.convert(legacyProperty);
        
        assertEquals(legacyPropertyName, property.getName());
        assertEquals(legacyPropertyDescription, property.getDescription());
        assertEquals(legacyPropertyDefaultValue, property.getDefaultValue());
        
        Map<Set<Scope>, String> propertyScopedValueMap = property.getPropertyScopedValues() .stream().collect(Collectors.toMap(PropertyScopedValue::getScopeSet, PropertyScopedValue::getValue));
        
        legacyPropertyValues.entrySet().stream().filter(entry -> !entry.getKey().equals("default")).forEach(entry -> {
            Set<Scope> scopeSet = ScopeUtils.parseScopeString(entry.getKey(), Optional.of("&"));
            
            assertTrue(propertyScopedValueMap.containsKey(scopeSet));
            assertEquals(entry.getValue(), propertyScopedValueMap.get(scopeSet)); 
        });
        
    }

}
