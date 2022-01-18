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

package org.apache.log4j.helpers;

import java.net.URL;
import java.lang.IllegalAccessException;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;


/**
   Load resources (or images) from various sources.
 
  @author Ceki G&uuml;lc&uuml;
 */

public class Loader  { 

  static final String TSTR = "Caught Exception while in Loader.getResource. This may be innocuous.";

  // We conservatively assume that we are running under Java 1.x
  static private boolean java1 = true;
  
  static private boolean ignoreTCL = false;
  
  
  /**
   *  Get a resource by delegating to getResource(String).
   *  @param resource resource name
   *  @param clazz class, ignored.
   *  @return URL to resource or null.
   *  @deprecated as of 1.2.
   */
  public static URL getResource(String resource, Class clazz) {
      return getResource(resource);
  }

  /**
     This method will search for <code>resource</code> in different
     places. The search order is as follows:

     <ol>

     <p><li>Search for <code>resource</code> using the thread context
     class loader under Java2. If that fails, search for
     <code>resource</code> using the class loader that loaded this
     class (<code>Loader</code>). Under JDK 1.1, only the the class
     loader that loaded this class (<code>Loader</code>) is used.

     <p><li>Try one last time with
     <code>ClassLoader.getSystemResource(resource)</code>, that is is
     using the system class loader in JDK 1.2 and virtual machine's
     built-in class loader in JDK 1.1.

     </ol>
  */
  static public URL getResource(String resource) {
    return null;
  } 
  
  /**
     Are we running under JDK 1.x?        
  */
  public
  static
  boolean isJava1() {
    return java1;
  }
  
  
  /**
   * If running under JDK 1.2 load the specified class using the
   *  <code>Thread</code> <code>contextClassLoader</code> if that
   *  fails try Class.forname. Under JDK 1.1 only Class.forName is
   *  used.
   *
   */
  static public Class loadClass (String clazz) throws ClassNotFoundException {
    return Class.forName(clazz);
  } 
}
