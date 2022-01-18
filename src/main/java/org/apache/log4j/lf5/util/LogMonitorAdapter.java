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
package org.apache.log4j.lf5.util;

import org.apache.log4j.lf5.LogLevel;
import org.apache.log4j.lf5.LogRecord;
import org.apache.log4j.lf5.viewer.LogBrokerMonitor;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

/**
 * <p>LogMonitorAdapter facilitates the usage of the LogMonitor</p>
 *
 * @author Richard Hurst
 */

// Contributed by ThoughtWorks Inc.

public class LogMonitorAdapter {
  //--------------------------------------------------------------------------
  //   Constants:
  //--------------------------------------------------------------------------
  public static final int LOG4J_LOG_LEVELS = 0;
  public static final int JDK14_LOG_LEVELS = 1;
  //--------------------------------------------------------------------------
  //   Protected Variables:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Private Variables:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Constructors:
  //--------------------------------------------------------------------------
  private LogMonitorAdapter(List userDefinedLevels) {
    super();
  }
  //--------------------------------------------------------------------------
  //   Public Methods:
  //--------------------------------------------------------------------------
  /**
   * <p>Creates an instance of LogMonitorAdapter using the
   * log levels inticated by the parameter. Log4J and JDK1.4 both have default
   * LogLevels which are set but these levels can be overriden.<p>
   *
   * @param loglevels An integer representing either Log4J or JDK1.4 logging levels
   * @return LogMonitorAdapter
   */
  public static LogMonitorAdapter newInstance(int loglevels) {
    return new LogMonitorAdapter(null);
  }

  /**
   * <p>Creates an instance of LogMonitorAdapter using the specified LogLevels.
   * The first LogLevel in the array is used as the default LogLevel unless
   * changed using the setDefaultLevel method.<p>
   *
   * @param userDefined An array of user defined LogLevel objects.
   * @return LogMonitorAdapter
   */
  public static LogMonitorAdapter newInstance(LogLevel[] userDefined) {
    return new LogMonitorAdapter(null);
  }

  /**
   * <p>Creates an instance of LogMonitorAdapter using the specified LogLevels.
   * The first LogLevel in the List is used as the default LogLevel unless
   * changed using the setDefaultLevel method.<p>
   *
   * @param userDefinedLevels A list of user defined LogLevel objects.
   * @return LogMonitorAdapter
   */
  public static LogMonitorAdapter newInstance(List userDefinedLevels) {
    return new LogMonitorAdapter(null);
  }

  /**
   * <p>Adds a LogRecord to the LogMonitor.<p>
   *
   * @param record The LogRecord object to be logged in the logging monitor.
   */
  public void addMessage(LogRecord record) {
  }

  /**
   * <p>Set the maximum number of records to be displayed in the monitor<p>
   *
   * @param maxNumberOfRecords
   */
  public void setMaxNumberOfRecords(int maxNumberOfRecords) {
  }

  /**
   * <p>Set the default log level to be used when logging messages without
   * specifying a LogLevel.<p>
   *
   * @param level
   */
  public void setDefaultLevel(LogLevel level) {
  }

  /**
   * <p>Gets the default LogLevel for the Adapter.<p>
   *
   * @return LogLevel
   */
  public LogLevel getDefaultLevel() {
    return null;
  }

  /**
   * <p>Sets the Severe LogLevel.</p>
   *
   * @param level
   */
  public void setSevereLevel(LogLevel level) {
  }

  /**
   * <p>Gets the current Severe LogLevel <p>
   *
   * @return LogLevel
   */
  public LogLevel getSevereLevel() {
    return null;
  }

  /**
   * <p>Log a complete message to the Monitor.<p>
   *
   * @param category The category to be used
   * @param level The log level to apply to the message
   * @param message The message
   * @param t The throwable content of the message
   * @param NDC The NDC really only applies to Log4J and the parameter can
   *            usually be ignored.
   */
  public void log(String category, LogLevel level, String message,
      Throwable t, String NDC) {
  }

  /**
   * <p>Log a message to the Monitor and use the default LogLevel.<p>
   *
   * @param category The category to be used
   * @param message The message
   */
  public void log(String category, String message) {
  }

  /**
   * <p>Log a message to the Monitor.<p>
   *
   * @param category The category to be used
   * @param level The log level to apply to the message
   * @param message The message
   * @param NDC
   */
  public void log(String category, LogLevel level, String message, String NDC) {
  }

  /**
   * <p>Log a message to the Monitor.<p>
   *
   * @param category The category to be used
   * @param level The log level to apply to the message
   * @param message The message
   * @param t The throwable content of the message
   */
  public void log(String category, LogLevel level, String message,
      Throwable t) {
  }

  /**
   * <p>Log a message to the Monitor.<p>
   *
   * @param category The category to be used
   * @param level The log level to apply to the message
   * @param message The message
   */
  public void log(String category, LogLevel level, String message) {
  }

  //--------------------------------------------------------------------------
  //   Protected Methods:
  //--------------------------------------------------------------------------
  /**
   * @return the screen width from Toolkit.getScreenSize()
   * if possible, otherwise returns 800
   * @see java.awt.Toolkit
   */
  protected static int getScreenWidth() {
    return 0;
  }

  /**
   * @return the screen height from Toolkit.getScreenSize()
   * if possible, otherwise returns 600
   * @see java.awt.Toolkit
   */
  protected static int getScreenHeight() {
    return 0;
  }

  protected static int getDefaultMonitorWidth() {
    return 0;
  }

  protected static int getDefaultMonitorHeight() {
    return 0;
  }
  //--------------------------------------------------------------------------
  //   Private Methods:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Nested Top-Level Classes or Interfaces
  //--------------------------------------------------------------------------
}

