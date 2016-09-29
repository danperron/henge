package com.kenzan.henge.domain.legacy.converter;

import com.kenzan.henge.domain.legacy.LegacyProperty;
import com.kenzan.henge.domain.legacy.LegacyPropertyGroup;
import com.kenzan.henge.domain.model.Property;
import com.kenzan.henge.domain.model.PropertyGroup;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * Model converter from {@link LegacyPropertyGroup} to {@link PropertyGroup}.
 *
 * @author wmatsushita
 */
public class PropertyGroupConverter implements Converter<LegacyPropertyGroup, PropertyGroup> {
    
    public static final String CREATED_BY = "PropertyGroupConverter";
    public static final String DESCRIPTION = "Converted automaticaly from LegacyPropertyGroup (config.json)";
    
    private Converter<LegacyProperty, Property> propertyConverter = new PropertyConverter();

    @Override
    public PropertyGroup convert(LegacyPropertyGroup model) {
        
        PropertyGroup.Builder builder = PropertyGroup.builder(model.getKey(), model.getVersion())
            .withType(model.getType())
            .withIsActive(true)
            .withCreatedDate(LocalDateTime.now())
            .withCreatedBy(CREATED_BY)
            .withDescription(DESCRIPTION);
            
        Set<Property> properties = model.getProperties().stream().map(
            propertyConverter::convert
        ).collect(Collectors.toSet());
                        
        builder.withProperties(properties.toArray(new Property[0]));
        
        return builder.build();
        
    }
    
}
