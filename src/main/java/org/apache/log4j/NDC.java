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

//      Contributors:      Dan Milstein 
//                         Ray Millard

package org.apache.log4j;

import java.util.Stack;

public class NDC {

  private NDC() {}
  
  private static Stack getCurrentStack() { return null; }

  public static void clear() { }

  public static Stack cloneStack() { return null; }
  
  public static void inherit(Stack stack) { }

  static public String get() { return null; }
  
  public static int getDepth() { return 0; }

  private static void lazyRemove() { }

  public static String pop() { return ""; }
  
  public static String peek() { return ""; }
  
  public static void push(String message) { }

  static public void remove() { }

  static public void setMaxDepth(int maxDepth) { }

}
