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

package org.apache.log4j;

import java.util.Hashtable;

public class MDC {
  
  private MDC() { }

  static public void put(String key, Object o) { }

  static public Object get(String key) { return null; }
  
  static public void remove(String key) { }

  public static Hashtable getContext() { return null; }

  private void put0(String key, Object o) { }
  
  private Object get0(String key) { return null; }

  private void remove0(String key) { }

  private Hashtable getContext0() { return null; }
  
}
