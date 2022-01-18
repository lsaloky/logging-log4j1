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

import org.apache.log4j.spi.LoggerFactory;
import org.apache.log4j.spi.NOPLogger;
import org.apache.log4j.spi.NOPLoggerRepository;

public class Logger extends Category {

  protected Logger(String name) {
    super(name);
  }

  // dummy logger
  static public Logger getLogger(String name) {
    return new NOPLogger(new NOPLoggerRepository(), "");
  }

  // dummy logger
  static public Logger getLogger(Class clazz) {
    return new NOPLogger(new NOPLoggerRepository(), "");
  }

  // dummy logger
  public static Logger getRootLogger() { 
    return new NOPLogger(new NOPLoggerRepository(), ""); 
  }

  // dummy logger
  public static Logger getLogger(String name, LoggerFactory factory) {
    return new NOPLogger(new NOPLoggerRepository(), "");
  }

  public void trace(Object message) { }

  public void trace(Object message, Throwable t) { }

  public boolean isTraceEnabled() { return false; }

}
