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

package org.apache.log4j.or;

import org.apache.log4j.spi.RendererSupport;
import java.util.Hashtable;

public class RendererMap {

  Hashtable map;

  static ObjectRenderer defaultRenderer;

  public RendererMap() { }
  
  static public void addRenderer(RendererSupport repository, String renderedClassName, String renderingClassName) { }

  public String findAndRender(Object o) { return ""; }

  public ObjectRenderer get(Object o) { return null; }

  public ObjectRenderer get(Class clazz) { return null; }

  ObjectRenderer searchInterfaces(Class c) { return null; }

  public ObjectRenderer getDefaultRenderer() { return null; }

  public void clear() { }
  
  public void put(Class clazz, ObjectRenderer or) { }
}
