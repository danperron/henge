package com.kenzan.henge.domain.legacy.converter;

import static org.junit.Assert.assertEquals;

import com.google.common.collect.Sets;
import com.kenzan.henge.domain.legacy.LegacyProperty;
import com.kenzan.henge.domain.legacy.LegacyPropertyGroup;
import com.kenzan.henge.domain.model.Property;
import com.kenzan.henge.domain.model.PropertyGroup;
import com.kenzan.henge.domain.model.PropertyScopedValue;
import com.kenzan.henge.domain.utils.ScopeUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.junit.Test;


/**
 *
 *
 * @author wmatsushita
 */
public class PropertyGroupConverterTest {

    @Test
    public void test() {
        
        final String propertyGroupKey = "legacy-property-group-key";
        final String propertyGroupType = "legacy-property-group-type";
        final String propertyGroupVersion = "legacy-property-group-version";
        
        final String propertyName = "legacy-property-test";
        final String propertyDescription = "legacy-property-description";
        final String propertyDefaultValue = "default-value"; 
        final Map<String, String> propertyValues = new HashMap<>();
        propertyValues.put("default", propertyDefaultValue);
        propertyValues.put("env=local", "value-1");
        propertyValues.put("env=dev&stack=sbnet", "value-2");
        
        LegacyProperty legacyProperty = LegacyProperty.builder(propertyName)
            .withDescription(propertyDescription)
            .withValues(propertyValues)
            .build();
        
        LegacyPropertyGroup legacyPropertyGroup = LegacyPropertyGroup.builder(propertyGroupKey, propertyGroupType)
            .withVersion(propertyGroupVersion)
            .withProperties(Sets.newHashSet(legacyProperty))
            .build();
        
        Property expectedProperty = new Property.Builder(propertyName)
            .withDescription(propertyDescription)
            .withDefaultValue(propertyDefaultValue)
            .withScopedValues(
                PropertyScopedValue.builder(ScopeUtils.parseScopeString("env=local", Optional.of("&")), "value-1").build(),
                PropertyScopedValue.builder(ScopeUtils.parseScopeString("env=dev&stack=sbnet", Optional.of("&")), "value-2").build()                
            ).build();
        
        PropertyGroup expectedPropertyGroup = PropertyGroup.builder(propertyGroupKey, propertyGroupVersion)
            .withType(propertyGroupType)
            .withCreatedBy(PropertyGroupConverter.CREATED_BY)
            .withDescription(PropertyGroupConverter.DESCRIPTION)
            .withIsActive(true)
            .withProperties(expectedProperty)
            .build();
        
        Converter<LegacyPropertyGroup, PropertyGroup> converter = new PropertyGroupConverter();
        
        assertEquals(expectedPropertyGroup, converter.convert(legacyPropertyGroup));

    }

}
