/*
 * Copyright (c) 2018 Feedzai
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.feedzai.openml.scikit;

import com.feedzai.openml.provider.descriptor.MLAlgorithmDescriptor;
import com.feedzai.openml.provider.descriptor.MachineLearningAlgorithmType;
import com.feedzai.openml.util.algorithm.MLAlgorithmEnum;
import com.google.common.collect.ImmutableSet;

/**
 * Enumeration of algorithms supported by Scikit-learn provider.
 *
 * @author Luis Reis (luis.reis@feedzai.com)
 * @since 0.1.0
 */
public enum ScikitAlgorithm implements MLAlgorithmEnum {

    /**
     * Default Classification algorithm used for all Scikit-learn models.
     */
    DEFAULT_CLASSIFICATION(MLAlgorithmEnum.createDescriptor(
            "Classification Algorithm",
            ImmutableSet.of(),
            MachineLearningAlgorithmType.MULTI_CLASSIFICATION,
            "http://scikit-learn.org/stable/documentation.html"
    ));

    /**
     * {@link MLAlgorithmDescriptor} for this algorithm.
     */
    public final MLAlgorithmDescriptor descriptor;

    /**
     * Constructor.
     *
     * @param descriptor {@link MLAlgorithmDescriptor} for this algorithm.
     */
    ScikitAlgorithm(final MLAlgorithmDescriptor descriptor) {
        this.descriptor = descriptor;
    }

    @Override
    public MLAlgorithmDescriptor getAlgorithmDescriptor() {
        return this.descriptor;
    }
}
