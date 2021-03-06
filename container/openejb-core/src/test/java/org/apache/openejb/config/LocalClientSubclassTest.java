/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.openejb.config;

import org.apache.openejb.core.LocalInitialContextFactory;

import javax.naming.InitialContext;
import java.util.Properties;

/**
 * @version $Rev$ $Date$
 */
public class LocalClientSubclassTest extends LocalClientTest {

    @Override
    public void test() throws Exception {
        final Properties properties = new Properties();
        properties.setProperty(javax.naming.Context.INITIAL_CONTEXT_FACTORY, LocalInitialContextFactory.class.getName());
        final InitialContext context = new InitialContext(properties);
        context.bind("inject", this);

        assertRefs();

    }
}
