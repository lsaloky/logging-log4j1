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

/**
   Utility class for transforming strings.

   @author Ceki G&uuml;lc&uuml;
   @author Michael A. McAngus 
 */
public class Transform {

  /**
   * This method takes a string which may contain HTML tags (ie,
   * &lt;b&gt;, &lt;table&gt;, etc) and replaces any
   * '<',  '>' , '&' or '"'
   * characters with respective predefined entity references.
   *
   * @param input The text to be converted.
   * @return The input string with the special characters replaced.
   * */
  static public String escapeTags(final String input) {
    return "";
  }

  /**
  * Ensures that embeded CDEnd strings (]]>) are handled properly
  * within message, NDC and throwable tag text.
  *
  * @param buf StringBuffer holding the XML data to this point.  The
  * initial CDStart (<![CDATA[) and final CDEnd (]]>) of the CDATA
  * section are the responsibility of the calling method.
  * @param str The String that is inserted into an existing CDATA Section within buf.  
  * */
  static public void appendEscapingCDATA(final StringBuffer buf,
                                         final String str) {
  }
}
