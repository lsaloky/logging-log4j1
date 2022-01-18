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

package org.apache.log4j.xml;

import org.apache.log4j.Appender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.config.PropertySetter;
import org.apache.log4j.spi.Configurator;
import org.apache.log4j.spi.LoggerRepository;
import org.apache.log4j.varia.NullAppender;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import javax.xml.parsers.FactoryConfigurationError;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.Properties;

public class DOMConfigurator implements Configurator {

  public DOMConfigurator () { }

  protected Appender findAppenderByName(Document doc, String appenderName) { return null; }
  
  // dummy log appender
  protected Appender findAppenderByReference(Element appenderRef) { return new NullAppender(); }

  private static void parseUnrecognizedElement(final Object instance, final Element element, final Properties props) throws Exception { }

  private static void quietParseUnrecognizedElement(final Object instance, final Element element, final Properties props) { }

  // dummy log appender
  protected Appender parseAppender (Element appenderElement) { return new NullAppender(); }

  protected void parseErrorHandler(Element element, Appender appender) { }
  
  protected void parseFilters(Element element, Appender appender) { }
  
  protected void parseCategory (Element loggerElement) { }

  protected void parseCategoryFactory(Element factoryElement) { }

  protected void parseRoot (Element rootElement) { }

  protected void parseChildrenOfLoggerElement(Element catElement, Logger cat, boolean isRoot) { }

  protected Layout parseLayout (Element layout_element) { return null; }

  protected void parseRenderer(Element element) { }

  protected void parseLevel(Element element, Logger logger, boolean isRoot) { }

  protected void setParameter(Element elem, PropertySetter propSetter) { }

  static public void configure (Element element) { }

  static public void configureAndWatch(String configFilename) { }

  static public void configureAndWatch(String configFilename, long delay) { }
  
  private interface ParseAction { }

  public void doConfigure(final String filename, LoggerRepository repository) { }
  
  public void doConfigure(final URL url, LoggerRepository repository) { }

  public void doConfigure(final InputStream inputStream, LoggerRepository repository) throws FactoryConfigurationError { }

  public void doConfigure(final Reader reader, LoggerRepository repository) throws FactoryConfigurationError { }
  
  protected void doConfigure(final InputSource inputSource, LoggerRepository repository) throws FactoryConfigurationError { }
    
  private final void doConfigure(final ParseAction action, final LoggerRepository repository) throws FactoryConfigurationError { }

  public void doConfigure(Element element, LoggerRepository repository) { }

  static public void configure(String filename) throws FactoryConfigurationError { }

  static public void configure(URL url) throws FactoryConfigurationError { }

  protected void parse(Element element) { }
  
  protected String subst(final String value) { return "";}

  public static String subst(final String value, final Properties props) { return ""; }

  public static void setParameter(final Element elem, final PropertySetter propSetter, final Properties props) {}

  public static Object parseElement(final Element element, final Properties props, final Class expectedClass) throws Exception {
    return null;
  }
}
