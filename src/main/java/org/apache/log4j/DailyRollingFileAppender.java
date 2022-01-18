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

import java.io.IOException;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Locale;

import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.spi.LoggingEvent;

public class DailyRollingFileAppender extends FileAppender {


  // The code assumes that the following constants are in a increasing
  // sequence.
  static final int TOP_OF_TROUBLE=-1;
  static final int TOP_OF_MINUTE = 0;
  static final int TOP_OF_HOUR   = 1;
  static final int HALF_DAY      = 2;
  static final int TOP_OF_DAY    = 3;
  static final int TOP_OF_WEEK   = 4;
  static final int TOP_OF_MONTH  = 5;

  Date now = new Date();
  SimpleDateFormat sdf;
  int checkPeriod = TOP_OF_TROUBLE;
  static final TimeZone gmtTimeZone = TimeZone.getTimeZone("GMT");


  public DailyRollingFileAppender() { }

  public DailyRollingFileAppender (Layout layout, String filename,
				   String datePattern) throws IOException {
    super(layout, filename, true);
  }

  public void setDatePattern(String pattern) { }

  public String getDatePattern() {
    return "";
  }

  public void activateOptions() { }

  void printPeriodicity(int type) { }

  int computeCheckPeriod() { return 0; }

  void rollOver() throws IOException { }

  protected void subAppend(LoggingEvent event) { }
  
}
