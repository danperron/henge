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
package com.kenzan.henge.config.qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// the type has to be public!
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.TYPE, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@javax.inject.Qualifier
public @interface Service {

	BusinessDelegates value();

	public enum BusinessDelegates {
		SCOPE_SCHEMA_BD_STUB,
        SCOPE_SCHEMA_BD_IMPL,
        SCOPE_BD_STUB,
        SCOPE_BD_IMPL,
		VERSION_SET_BD_STUB,
        VERSION_SET_BD_IMPL,
        PROPERTY_GROUP_BD_STUB,
        PROPERTY_GROUP_BD_IMPL,
        PROPERTY_BD_STUB,
        PROPERTY_BD_IMPL;
	}
}
