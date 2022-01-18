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


// Contibutors: "Luke Blanshard" <Luke@quiq.com>
//              "Mark DONSZELMANN" <Mark.Donszelmann@cern.ch>
//               Anders Kristensen <akristensen@dynamicsoft.com>

package org.apache.log4j;

import org.apache.log4j.spi.Configurator;
import org.apache.log4j.spi.LoggerRepository;
import org.apache.log4j.varia.NullAppender;

import java.util.Properties;

public class PropertyConfigurator implements Configurator {

  public void doConfigure(String configFileName, LoggerRepository hierarchy) { }

  static public void configure(String configFilename) { }

  public static void configure(java.net.URL configURL) { }

  static public void configure(Properties properties) { }

  static public void configureAndWatch(String configFilename) { }

  static public void configureAndWatch(String configFilename, long delay) { }

  public void doConfigure(Properties properties, LoggerRepository hierarchy) { }

  public void doConfigure(java.net.URL configURL, LoggerRepository hierarchy) { }

  protected void configureLoggerFactory(Properties props) { }

  void configureRootCategory(Properties props, LoggerRepository hierarchy) { }

  protected void parseCatsAndRenderers(Properties props, LoggerRepository hierarchy) { }

  void parseAdditivityForLogger(Properties props, Logger cat, String loggerName) { }

  void parseCategory(Properties props, Logger logger, String optionKey, String loggerName, String value) { }

  // dummy log appender
  Appender parseAppender(Properties props, String appenderName) { return new NullAppender(); }

  void  registryPut(Appender appender) { }

  // dummy log appender
  Appender registryGet(String name) { return new NullAppender(); }
}
