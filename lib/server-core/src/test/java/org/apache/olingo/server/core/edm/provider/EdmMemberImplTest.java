/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.olingo.server.core.edm.provider;

import org.apache.olingo.commons.api.edm.provider.EnumMember;
import org.apache.olingo.commons.core.edm.provider.EdmMemberImpl;
import org.apache.olingo.commons.core.edm.provider.EdmProviderImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class EdmMemberImplTest {

  @Test
  public void enumMember() {
    final EnumMember member = new EnumMember().setName("name").setValue("value");
    final EdmMemberImpl memberImpl = new EdmMemberImpl(mock(EdmProviderImpl.class), null, member);

    assertEquals("name", memberImpl.getName());
    assertEquals("value", memberImpl.getValue());
  }

}
