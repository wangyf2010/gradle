/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.plugin

import org.gradle.integtests.fixtures.AbstractIntegrationSpec

class PluginHandlerScriptIntegTest extends AbstractIntegrationSpec {

    def "build scripts have plugin blocks"() {
        when:
        buildFile << "plugins { apply([:]) }"

        then:
        succeeds "tasks"
    }

    def "settings scripts have plugin blocks"() {
        when:
        settingsFile << "plugins { apply([:]) }"

        then:
        succeeds "tasks"
    }

    def "init scripts have plugin blocks"() {
        def initScript = file("init.gradle")

        when:
        initScript << "plugins { apply([:]) }"

        then:
        args "-I", initScript.absolutePath
        succeeds "tasks"
    }

}