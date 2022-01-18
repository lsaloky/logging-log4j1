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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Date format manager.
 * Utility class to help manage consistent date formatting and parsing.
 * It may be advantageous to have multiple DateFormatManagers per
 * application.  For example, one for handling the output (formatting) of
 * dates, and another one for handling the input (parsing) of dates.
 *
 * @author Robert Shaw
 * @author Michael J. Sikorsky
 */

// Contributed by ThoughtWorks Inc.
public class DateFormatManager {
  //--------------------------------------------------------------------------
  //   Constants:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Protected Variables:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Private Variables:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Constructors:
  //--------------------------------------------------------------------------
  public DateFormatManager() {
    super();
  }

  public DateFormatManager(TimeZone timeZone) {
    super();
  }

  public DateFormatManager(Locale locale) {
    super();
  }

  public DateFormatManager(String pattern) {
    super();
  }

  public DateFormatManager(TimeZone timeZone, Locale locale) {
    super();
  }

  public DateFormatManager(TimeZone timeZone, String pattern) {
    super();
  }

  public DateFormatManager(Locale locale, String pattern) {
    super();
  }

  public DateFormatManager(TimeZone timeZone, Locale locale, String pattern) {
    super();
  }

  //--------------------------------------------------------------------------
  //   Public Methods:
  //--------------------------------------------------------------------------

  public TimeZone getTimeZone() {
    return null;
  }

  public void setTimeZone(TimeZone timeZone) {
  }

  public Locale getLocale() {
    return null;
  }

  public void setLocale(Locale locale) {
  }

  public String getPattern() {
    return "";
  }

  /**
   * Set the pattern. i.e. "EEEEE, MMMMM d, yyyy hh:mm aaa"
   */
  public void setPattern(String pattern) {
  }


  /**
   * This method has been deprecated in favour of getPattern().
   * @deprecated Use getPattern().
   */
  public String getOutputFormat() {
    return "";
  }

  /**
   * This method has been deprecated in favour of setPattern().
   * @deprecated Use setPattern().
   */
  public void setOutputFormat(String pattern) {
  }

  public DateFormat getDateFormatInstance() {
    return null;
  }

  public void setDateFormatInstance(DateFormat dateFormat) {
  }

  public String format(Date date) {
    return "";
  }

  public String format(Date date, String pattern) {
    return "";
  }

  /**
   * @throws java.text.ParseException
   */
  public Date parse(String date) throws ParseException {
    return null;
  }

  /**
   * @throws java.text.ParseException
   */
  public Date parse(String date, String pattern) throws ParseException {
    return null;
  }

  //--------------------------------------------------------------------------
  //   Protected Methods:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Private Methods:
  //--------------------------------------------------------------------------
  private void configure() {
  }

  //--------------------------------------------------------------------------
  //   Nested Top-Level Classes or Interfaces:
  //--------------------------------------------------------------------------

}
