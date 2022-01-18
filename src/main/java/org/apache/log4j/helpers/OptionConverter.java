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

import java.util.Properties;
import java.net.URL;
import org.apache.log4j.Level;
import org.apache.log4j.spi.Configurator;
import org.apache.log4j.spi.LoggerRepository;
import org.apache.log4j.PropertyConfigurator;

// Contributors:   Avy Sharell (sharell@online.fr)
//                 Matthieu Verbert (mve@zurich.ibm.com)
//                 Colin Sampaleanu

/**
   A convenience class to convert property values to specific types.

   @author Ceki G&uuml;lc&uuml;
   @author Simon Kitching;
   @author Anders Kristensen
*/
public class OptionConverter {

  static String DELIM_START = "${";
  static char   DELIM_STOP  = '}';
  static int DELIM_START_LEN = 2;
  static int DELIM_STOP_LEN  = 1;

  /** OptionConverter is a static class. */
  private OptionConverter() {}

  public
  static
  String[] concatanateArrays(String[] l, String[] r) {
    return null;
  }

  public
  static
  String convertSpecialChars(String s) {
    return null;
  }


  /**
     Very similar to <code>System.getProperty</code> except
     that the {@link SecurityException} is hidden.

     @param key The key to search for.
     @param def The default value to return.
     @return the string value of the system property, or the default
     value if there is no property with that key.

     @since 1.1 */
  public
  static
  String getSystemProperty(String key, String def) {
    return null;
  }


  public
  static
  Object instantiateByKey(Properties props, String key, Class superClass,
				Object defaultValue) {
    return null; 
  }

  /**
     If <code>value</code> is "true", then <code>true</code> is
     returned. If <code>value</code> is "false", then
     <code>true</code> is returned. Otherwise, <code>default</code> is
     returned.

     <p>Case of value is unimportant.  */
  public
  static
  boolean toBoolean(String value, boolean dEfault) {
    return dEfault;
  }

  public
  static
  int toInt(String value, int dEfault) {
    return dEfault;
  }

  /**
     Converts a standard or custom priority level to a Level
     object.  <p> If <code>value</code> is of form
     "level#classname", then the specified class' toLevel method
     is called to process the specified level string; if no '#'
     character is present, then the default {@link org.apache.log4j.Level}
     class is used to process the level value.

     <p>As a special case, if the <code>value</code> parameter is
     equal to the string "NULL", then the value <code>null</code> will
     be returned.

     <p> If any error occurs while converting the value to a level,
     the <code>defaultValue</code> parameter, which may be
     <code>null</code>, is returned.

     <p> Case of <code>value</code> is insignificant for the level level, but is
     significant for the class name part, if present.

     @since 1.1 */
  public
  static
  Level toLevel(String value, Level defaultValue) {
	return null;
   }

  public
  static
  long toFileSize(String value, long dEfault) {
    return dEfault;
  }

  /**
     Find the value corresponding to <code>key</code> in
     <code>props</code>. Then perform variable substitution on the
     found value.

 */
  public
  static
  String findAndSubst(String key, Properties props) {
    return null;
  }

  /**
     Instantiate an object given a class name. Check that the
     <code>className</code> is a subclass of
     <code>superClass</code>. If that test fails or the object could
     not be instantiated, then <code>defaultValue</code> is returned.

     @param className The fully qualified class name of the object to instantiate.
     @param superClass The class to which the new object should belong.
     @param defaultValue The object to return in case of non-fulfillment
   */
  public
  static
  Object instantiateByClassName(String className, Class superClass,
				Object defaultValue) {
    return defaultValue;
  }


  /**
     Perform variable substitution in string <code>val</code> from the
     values of keys found in the system propeties.

     <p>The variable substitution delimeters are <b>${</b> and <b>}</b>.

     <p>For example, if the System properties contains "key=value", then
     the call
     <pre>
     String s = OptionConverter.substituteVars("Value of key is ${key}.");
     </pre>

     will set the variable <code>s</code> to "Value of key is value.".

     <p>If no value could be found for the specified key, then the
     <code>props</code> parameter is searched, if the value could not
     be found there, then substitution defaults to the empty string.

     <p>For example, if system propeties contains no value for the key
     "inexistentKey", then the call

     <pre>
     String s = OptionConverter.subsVars("Value of inexistentKey is [${inexistentKey}]");
     </pre>
     will set <code>s</code> to "Value of inexistentKey is []"

     <p>An {@link java.lang.IllegalArgumentException} is thrown if
     <code>val</code> contains a start delimeter "${" which is not
     balanced by a stop delimeter "}". </p>

     <p><b>Author</b> Avy Sharell</a></p>

     @param val The string on which variable substitution is performed.
     @throws IllegalArgumentException if <code>val</code> is malformed.

  */
  public static
  String substVars(String val, Properties props) throws
                        IllegalArgumentException {
    return "";
  }


  /**
     Configure log4j given a URL.

     <p>The url must point to a file or resource which will be interpreted by
     a new instance of a log4j configurator.

     <p>All configurations steps are taken on the
     <code>hierarchy</code> passed as a parameter.

     <p>
     @param url The location of the configuration file or resource.
     @param clazz The classname, of the log4j configurator which will parse
     the file or resource at <code>url</code>. This must be a subclass of
     {@link Configurator}, or null. If this value is null then a default
     configurator of {@link PropertyConfigurator} is used, unless the
     filename pointed to by <code>url</code> ends in '.xml', in which case
     {@link org.apache.log4j.xml.DOMConfigurator} is used.
     @param hierarchy The {@link org.apache.log4j.Hierarchy} to act on.

     @since 1.1.4 */

  static
  public
  void selectAndConfigure(URL url, String clazz, LoggerRepository hierarchy) {
  }
}
