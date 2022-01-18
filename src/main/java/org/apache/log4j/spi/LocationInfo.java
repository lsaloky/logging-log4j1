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

// Contributors: Mathias Rupprecht <mmathias.rupprecht@fja.com>

package org.apache.log4j.spi;

import java.io.StringWriter;
import java.io.PrintWriter;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.Layout;

/**
   The internal representation of caller location information.

   @since 0.8.3
*/
public class LocationInfo implements java.io.Serializable {

  /**
     Caller's line number.
  */
  transient String lineNumber;
  /**
     Caller's file name.
  */
  transient String fileName;
  /**
     Caller's fully qualified class name.
  */
  transient String className;
  /**
     Caller's method name.
  */
  transient String methodName;
  /**
     All available caller information, in the format
     <code>fully.qualified.classname.of.caller.methodName(Filename.java:line)</code>
    */
  public String fullInfo;

  /**
     When location information is not available the constant
     <code>NA</code> is returned. Current value of this string
     constant is <b>?</b>.  */
  public final static String NA = "?";

  static final long serialVersionUID = -1325822038990805636L;

    /**
     * NA_LOCATION_INFO is provided for compatibility with log4j 1.3.
     * @since 1.2.15
     */
    public static final LocationInfo NA_LOCATION_INFO =
            new LocationInfo(NA, NA, NA, NA);



  // Check if we are running in IBM's visual age.
  static boolean inVisualAge = false;

  /**
     Instantiate location information based on a Throwable. We
     expect the Throwable <code>t</code>, to be in the format

       <pre>
        java.lang.Throwable
        ...
          at org.apache.log4j.PatternLayout.format(PatternLayout.java:413)
          at org.apache.log4j.FileAppender.doAppend(FileAppender.java:183)
        at org.apache.log4j.Category.callAppenders(Category.java:131)
        at org.apache.log4j.Category.log(Category.java:512)
        at callers.fully.qualified.className.methodName(FileName.java:74)
	...
       </pre>

       <p>However, we can also deal with JIT compilers that "lose" the
       location information, especially between the parentheses.

    */
    public LocationInfo(Throwable t, String fqnOfCallingClass) { }

    /**
     *   Appends a location fragment to a buffer to build the 
     *     full location info.
     *    @param buf StringBuffer to receive content.
     *    @param fragment fragment of location (class, method, file, line),
     *        if null the value of NA will be appended.
     *    @since 1.2.15
     */
    private static final void appendFragment(final StringBuffer buf, final String fragment) { }

    /**
     * Create new instance.
     * @param file source file name
     * @param classname class name
     * @param method method
     * @param line source line number
     *
     * @since 1.2.15
     */
    public LocationInfo(final String file, final String classname, final String method, final String line) { }

    /**
       Return the fully qualified class name of the caller making the
       logging request.
    */
    public String getClassName() { return ""; }

    /**
       Return the file name of the caller.

       <p>This information is not always available.
    */
    public String getFileName() { return ""; }

    /**
       Returns the line number of the caller.

       <p>This information is not always available.
    */
    public String getLineNumber() { return ""; }

    /**
       Returns the method name of the caller.
    */
    public String getMethodName() { return ""; }
}
