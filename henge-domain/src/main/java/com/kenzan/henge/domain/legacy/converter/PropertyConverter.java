package com.kenzan.henge.domain.legacy.converter;

import com.kenzan.henge.domain.legacy.LegacyProperty;
import com.kenzan.henge.domain.model.Property;
import com.kenzan.henge.domain.model.PropertyScopedValue;
import com.kenzan.henge.domain.utils.ScopeUtils;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Model converter from {@link LegacyProperty} to {@link Property}.
 *
 * @author wmatsushita
 */
public class PropertyConverter implements Converter<LegacyProperty, Property> {

    private static final String CONFIG_JSON_DEFAULT_VALUE_VAR_NAME = "default";
    private static final String CONFIG_JSON_KEY_DELIMITER = "&";

    @Override
    public Property convert(LegacyProperty model) {

        Property.Builder builder = new Property.Builder(model.getName()).withDescription(model.getDescription());
        Map<String, String> values = model.getValues();
        if (values.containsKey(CONFIG_JSON_DEFAULT_VALUE_VAR_NAME) && values.get(CONFIG_JSON_DEFAULT_VALUE_VAR_NAME) != null) {
            builder.withDefaultValue(values.get(CONFIG_JSON_DEFAULT_VALUE_VAR_NAME));
        }
        Set<PropertyScopedValue> scopedValues =
            values.entrySet().stream()
                .filter(entry -> !entry.getKey().equals(CONFIG_JSON_DEFAULT_VALUE_VAR_NAME))
                .map(entry -> PropertyScopedValue.builder(ScopeUtils.parseScopeString(entry.getKey(), Optional.of(CONFIG_JSON_KEY_DELIMITER)), entry.getValue()).build())
                .collect(Collectors.toSet());
        
        return builder.withScopedValues(scopedValues.toArray(new PropertyScopedValue[0])).build();
    }
    
    

}
