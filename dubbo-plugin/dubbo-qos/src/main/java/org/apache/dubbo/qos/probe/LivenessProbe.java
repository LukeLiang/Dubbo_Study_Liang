/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.qos.probe;

import org.apache.dubbo.common.extension.ExtensionScope;
import org.apache.dubbo.common.extension.SPI;

/**
 * A probe to indicate whether program is alive
 * </p>
 * If one or more spi return false, 'live' command in dubbo-qos
 * will return false. This can be extend with custom program and developers
 * can implement this to customize life cycle.
 *
 * @since 3.0
 */
@SPI(scope = ExtensionScope.FRAMEWORK)
public interface LivenessProbe {
    /**
     * Check if program is alive
     *
     * @return {@link boolean} result of probe
     */
    boolean check();
}
