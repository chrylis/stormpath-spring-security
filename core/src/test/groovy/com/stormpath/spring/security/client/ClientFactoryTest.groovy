/*
 * Copyright 2013 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.stormpath.spring.security.client

import com.stormpath.sdk.client.ClientBuilder
import org.junit.Before
import org.junit.Test

import static org.easymock.EasyMock.createMock
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertNotNull

class ClientFactoryTest {

    ClientFactory clientFactory

    @Before
    void setUp() {
        clientFactory = new ClientFactory()
    }

    @Test
    public void testGetClientBuilder() {
        assertNotNull clientFactory.getClientBuilder()
    }

    @Test
    public void testSetClientBuilder() {
        def builder = createMock(ClientBuilder)
        clientFactory.setClientBuilder(builder)
        assertEquals builder, clientFactory.getClientBuilder()
    }
}

