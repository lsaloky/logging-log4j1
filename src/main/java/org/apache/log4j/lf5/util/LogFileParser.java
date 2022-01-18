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

import org.apache.log4j.lf5.Log4JLogRecord;
import org.apache.log4j.lf5.LogLevel;
import org.apache.log4j.lf5.LogLevelFormatException;
import org.apache.log4j.lf5.LogRecord;
import org.apache.log4j.lf5.viewer.LogBrokerMonitor;
import org.apache.log4j.lf5.viewer.LogFactor5ErrorDialog;
import org.apache.log4j.lf5.viewer.LogFactor5LoadingDialog;

import javax.swing.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Provides utility methods for input and output streams.
 *
 * @author Brad Marlborough
 * @author Richard Hurst
 */

// Contributed by ThoughtWorks Inc.

public class LogFileParser implements Runnable {
  //--------------------------------------------------------------------------
  //   Constants:
  //--------------------------------------------------------------------------
  public static final String RECORD_DELIMITER = "";
  public static final String ATTRIBUTE_DELIMITER = "";
  public static final String DATE_DELIMITER = ATTRIBUTE_DELIMITER + "";
  public static final String THREAD_DELIMITER = ATTRIBUTE_DELIMITER + "";
  public static final String CATEGORY_DELIMITER = ATTRIBUTE_DELIMITER + "";
  public static final String LOCATION_DELIMITER = ATTRIBUTE_DELIMITER + "";
  public static final String MESSAGE_DELIMITER = ATTRIBUTE_DELIMITER + "";
  public static final String PRIORITY_DELIMITER = ATTRIBUTE_DELIMITER + "";
  public static final String NDC_DELIMITER = ATTRIBUTE_DELIMITER + "";

  //--------------------------------------------------------------------------
  //   Protected Variables:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Private Variables:
  //--------------------------------------------------------------------------
  LogFactor5LoadingDialog _loadDialog;

  //--------------------------------------------------------------------------
  //   Constructors:
  //--------------------------------------------------------------------------
  public LogFileParser(File file) throws IOException,
      FileNotFoundException {
  }

  public LogFileParser(InputStream stream) throws IOException {
  }
  //--------------------------------------------------------------------------
  //   Public Methods:
  //--------------------------------------------------------------------------

  /**
   * Starts a new thread to parse the log file and create a LogRecord.
   * See run().
   * @param monitor LogBrokerMonitor
   */
  public void parse(LogBrokerMonitor monitor) throws RuntimeException {
  }

  /**
   * Parses the file and creates new log records and adds the record
   * to the monitor.
   */
  public void run() {
  }

  //--------------------------------------------------------------------------
  //   Protected Methods:
  //--------------------------------------------------------------------------
  protected void displayError(String message) {
  }

  //--------------------------------------------------------------------------
  //   Private Methods:
  //--------------------------------------------------------------------------
  private void destroyDialog() {
  }

  /**
   * Loads a log file from a web server into the LogFactor5 GUI.
   */
  private String loadLogFile(InputStream stream) throws IOException {
    return null;
  }

  private String parseAttribute(String name, String record) {
    return null;
  }

  private long parseDate(String record) {
    return 0;
  }

  private LogLevel parsePriority(String record) {
    return null;
  }

  private String parseThread(String record) {
    return "";
  }

  private String parseCategory(String record) {
    return "";
  }

  private String parseLocation(String record) {
    return "";
  }

  private String parseMessage(String record) {
    return "";
  }

  private String parseNDC(String record) {
    return "";
  }

  private String parseThrowable(String record) {
    return "";
  }

  private LogRecord createLogRecord(String record) {
    return null;
  }


  private String getAttribute(int index, String record) {
    return "";
  }
  //--------------------------------------------------------------------------
  //   Nested Top-Level Classes or Interfaces
  //--------------------------------------------------------------------------

}
