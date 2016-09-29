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
import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;

import io.swagger.annotations.ApiModel;

/**
 * @author kylebober
 */
@JsonDeserialize(builder=LegacyPropertyGroup.Builder.class, as=LegacyPropertyGroup.class)
@JsonPropertyOrder({"key", "type", "version", "properties"})
@ApiModel(description = "A legacy-property-group contains a key, type, version and a set of legacy-properties.")
public class LegacyPropertyGroup {

    private final String key;
    private final String type;
    private final String version;
    private final Set<LegacyProperty> properties;
    
    private LegacyPropertyGroup(final Builder builder) {
        
        this.key = builder.key;
        this.type = builder.type;
        this.version = builder.version;
        this.properties = builder.properties;
    }
    
    /**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @return the legacyProperties
	 */
	public Set<LegacyProperty> getProperties() {
		return properties;
	}

	@Override
	public boolean equals(final Object obj) {
		
		if (null == obj || !(obj instanceof LegacyPropertyGroup)) {
            return false;
        }

		LegacyPropertyGroup that = (LegacyPropertyGroup) obj;
        return Objects.equal(this.key, that.key)
        		&& Objects.equal(this.type, that.type)
        		&& Objects.equal(this.version, that.version)
        		&& Objects.equal(this.properties, that.properties);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(
                this.key, 
                this.type,
                this.version,
                this.properties);
	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
                .add("key", this.key)
                .add("type", this.type)
                .add("version", this.version)
                .add("legacyProperties", this.properties)
                .toString();
	}
	
	public static Builder builder(final String key, final String type) {

        return new Builder(key, type);
    }
    
    public static Builder builder(final LegacyPropertyGroup original) {

        return new Builder(original);
    }
	
	@JsonPOJOBuilder(buildMethodName="build", withPrefix="with")
	public static final class Builder {
	    
	    private String key;
	    private String type;
	    private String version;
	    private Set<LegacyProperty> properties;

	    private Builder(final LegacyPropertyGroup original) {
	        
	        this.key = original.key;
	        this.type = original.type;
	        this.version = original.version;
	        this.properties = Sets.newHashSet(original.properties);
	    }
	    
	    @JsonCreator
	    private Builder(@JsonProperty("key") final String key, @JsonProperty("type") final String type) {
	        
	        this.key = key;
	        this.type = type;
	    }
	    
	    public Builder withVersion(@JsonProperty("version") final String version) {
	        
	        this.version = version;
	        return this;
	    }
	    
	    public Builder withProperties(@JsonProperty("properties") final Set<LegacyProperty> properties) {
	        
	        this.properties = properties;
	        return this;
	    }
	    
	    public LegacyPropertyGroup build() {
	        
	        return new LegacyPropertyGroup(this);
	    }
	    
        public LegacyPropertyGroup build(final Validator validator) {
            
            final LegacyPropertyGroup object = build();
            
            final Set<ConstraintViolation<LegacyPropertyGroup>> violations = validator.validate(object);

            if (!violations.isEmpty()) {
                throw new ConstraintViolationException(
                    new HashSet<ConstraintViolation<?>>(violations));
            }
            
            return object;
        }
	    
	}
}
