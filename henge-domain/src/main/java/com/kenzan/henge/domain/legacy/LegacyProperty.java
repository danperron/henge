/**
 * Copyright (C) ${project.inceptionYear} Kenzan - Kyle S. Bober (kbober@kenzan.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kenzan.henge.domain.legacy;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.Maps;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;

import io.swagger.annotations.ApiModel;

/**
 * @author kylebober
 * @author wmatsushita
 */
@JsonDeserialize(builder = LegacyProperty.Builder.class, as=LegacyProperty.class)
@JsonPropertyOrder({"name", "description", "type", "values"})
@ApiModel(description = "A legacy-property containing a name, description, type and  and scoped property values.")
public class LegacyProperty {

    private final String name;
    private final String description;
    private final String type;
    private final Map<String, String> values;
    
    private LegacyProperty(final Builder builder) {
        
        this.name = builder.name;
        this.description = builder.description;
        this.type = builder.type;
        this.values = builder.values;
    }
    
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the values
	 */
	public Map<String, String> getValues() {
		return values;
	}
    
	@Override
	public boolean equals(final Object obj) {
		
		if (null == obj || !(obj instanceof LegacyProperty)) {
            return false;
        }

		LegacyProperty that = (LegacyProperty) obj;
        return Objects.equal(this.name, that.name)
        		&& Objects.equal(this.description, that.description)
        		&& Objects.equal(this.type, that.type)
        		&& Objects.equal(this.values, that.values);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(
                this.name, 
                this.description,
                this.type,
                this.values);
	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
                .add("name", this.name)
                .add("description", this.description)
                .add("type", this.type)
                .add("legacyScopedPropertyValues", this.values)
                .toString();
	}
	
	public static Builder builder(final String name) {

        return new Builder(name);
    }
	
	public static Builder builder(final LegacyProperty original) {

        return new Builder(original);
    }
	
    @JsonPOJOBuilder(buildMethodName = "build", withPrefix = "with")
    public static final class Builder {
        
        private String name;
        private String description;
        private String type;
        private Map<String, String> values;
        
        private Builder(final LegacyProperty original) {
            
            this.name = original.getName();
            this.description = original.getDescription();
            this.type = original.getType();
            this.values = Maps.newHashMap(original.getValues());
        }
        
        /* Required fields make up the constructor parameters */
        @JsonCreator
        private Builder(@JsonProperty("name") final String name) {
            
            this.name = name;
        }
        
        public Builder withDescription(@JsonProperty("description") final String description) {
            
            this.description = description;
            return this;
        }
        
        public Builder withType(@JsonProperty("type") final String type) {
            
            this.type = type;
            return this;
        }
        
        public Builder withValues(@JsonProperty("values") final Map<String, String> values) {
            
            this.values = values;
            return this;
        }
        
        
        public LegacyProperty build() {
            
            return new LegacyProperty(this);
        }
        
        public LegacyProperty build(final Validator validator) {
            
            final LegacyProperty object = build();
            
            final Set<ConstraintViolation<LegacyProperty>> violations = validator.validate(object);

            if (!violations.isEmpty()) {
                throw new ConstraintViolationException(
                    new HashSet<ConstraintViolation<?>>(violations));
            }
            
            return object;
        }
        
    }   
	
}
