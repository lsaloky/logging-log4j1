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

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * <p>A LogRecord to be used with the LogMonitorAdapter</p>
 *
 * @author Richard Hurst
 */

// Contributed by ThoughtWorks Inc.

public class AdapterLogRecord extends LogRecord {
  //--------------------------------------------------------------------------
  //   Constants:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Protected Variables:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Private Variables:
  //--------------------------------------------------------------------------
  private static LogLevel severeLevel = null;

  //--------------------------------------------------------------------------
  //   Constructors:
  //--------------------------------------------------------------------------
  public AdapterLogRecord() {
    super();
  }

  //--------------------------------------------------------------------------
  //   Public Methods:
  //--------------------------------------------------------------------------
  public void setCategory(String category) {
  }

  public boolean isSevereLevel() {
    return false;
  }

  public static void setSevereLevel(LogLevel level) {
    severeLevel = level;
  }

  public static LogLevel getSevereLevel() {
    return severeLevel;
  }

  //--------------------------------------------------------------------------
  //   Protected Methods:
  //--------------------------------------------------------------------------
  protected String getLocationInfo(String category) {
    return "";
  }

  protected String stackTraceToString(Throwable t) {
    return "";
  }

  protected String parseLine(String trace, String category) {
    return "";
  }
  //--------------------------------------------------------------------------
  //   Private Methods:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Nested Top-Level Classes or Interfaces
  //--------------------------------------------------------------------------
}

