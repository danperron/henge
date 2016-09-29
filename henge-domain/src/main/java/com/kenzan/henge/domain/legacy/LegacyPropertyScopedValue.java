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

import java.util.HashSet;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;

import io.swagger.annotations.ApiModel;

@JsonDeserialize(builder = LegacyPropertyScopedValue.Builder.class, as=LegacyPropertyScopedValue.class)
@JsonPropertyOrder({"key", "value"})
@ApiModel(description = "A legacy scoped property value containing a key/value pair.")
public class LegacyPropertyScopedValue {	
	
	private final String key;	
	private final String value;
	
	private LegacyPropertyScopedValue(final Builder builder) {
	    
	    this.key = builder.key;
	    this.value = builder.value;
	}
	
	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	@Override
	public boolean equals(final Object obj) {
		if (null == obj || !(obj instanceof LegacyPropertyScopedValue)) {
            return false;
        }

		LegacyPropertyScopedValue that = (LegacyPropertyScopedValue) obj;
        return Objects.equal(this.key, that.key)
        		&& Objects.equal(this.value, that.value);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(
                this.key, 
                this.value);
	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
                .add("key", this.key)
                .add("value", this.value)
                .toString();
	}
	
	public static Builder builder(final String key, final String value) {

        return new Builder(key, value);
    }
	
    @JsonPOJOBuilder(buildMethodName = "build", withPrefix = "with")
    public static final class Builder {
        
        private String key;
        private String value;
        
        /* Required fields make up the constructor parameters */
        @JsonCreator
        private Builder(@JsonProperty("key") final String key, @JsonProperty("value") final String value) {
            
            this.key = key;
            this.value = value;
        }
        
        public LegacyPropertyScopedValue build() {
            
            return new LegacyPropertyScopedValue(this);
        }
        
        public LegacyPropertyScopedValue build(final Validator validator) {
            
            final LegacyPropertyScopedValue object = build();
            
            final Set<ConstraintViolation<LegacyPropertyScopedValue>> violations = validator.validate(object);

            if (!violations.isEmpty()) {
                throw new ConstraintViolationException(
                    new HashSet<ConstraintViolation<?>>(violations));
            }
            
            return object;
        }
        
    }   
		
}
