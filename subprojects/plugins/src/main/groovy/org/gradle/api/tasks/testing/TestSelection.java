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
package org.gradle.api.tasks.testing;

import org.gradle.api.Incubating;

import java.util.Set;

/**
 * Allows selecting tests for execution
 *
 * @since 1.10
 */
@Incubating
public interface TestSelection {

    /**
     * Appends criteria for including a particular test(s).
     *
     * @param testClass test class name
     * @param testMethod test method name
     * @return this selection object
     */
    TestSelection includeTest(String testClass, String testMethod);

    /**
     * Criteria for the tests that are included
     */
    Set<TestSelectionSpec> getIncludedTests();

    /**
     * Sets the criteria for including particular test(s).
     *
     * @param includedTests
     */
    void setIncludedTests(Object... includedTests);
}
