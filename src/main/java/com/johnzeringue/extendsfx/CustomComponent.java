/*
 * Copyright 2015 John Zeringue.
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
package com.johnzeringue.extendsfx;

import javafx.fxml.JavaFXBuilderFactory;
import javafx.util.BuilderFactory;

/**
 *
 * @author John Zeringue
 */
public interface CustomComponent {

    static BuilderFactory DEFAULT_BUILDER_FACTORY = new JavaFXBuilderFactory();

    default BuilderFactory getBuilderFactory() {
        return DEFAULT_BUILDER_FACTORY;
    }

}
