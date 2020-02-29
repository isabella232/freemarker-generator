/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.freemarker.generator.base.util;

import java.util.Locale;

import static org.apache.freemarker.generator.base.util.StringUtils.isEmpty;

public class LocaleUtils {

    public static Locale parseLocale(String value) {
        // "JVM default" is a special value defined by FreeMarker
        if (isEmpty(value) || value.equalsIgnoreCase("JVM default") || value.equalsIgnoreCase("default")) {
            return Locale.getDefault();
        }

        final String[] parts = value.split("_");
        return parts.length == 1 ? new Locale(parts[0]) : new Locale(parts[0], parts[1]);
    }
}
