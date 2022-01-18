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

package org.apache.log4j.lf5;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.lf5.viewer.LogBrokerMonitor;
import org.apache.log4j.spi.LoggingEvent;

/**
 * <code>LF5Appender</code> logs events to a swing based logging
 * console. The swing console supports turning categories on and off,
 * multiple detail level views, as well as full text searching and many
 * other capabilties.
 *
 * @author Brent Sprecher
 */

// Contributed by ThoughtWorks Inc.

public class LF5Appender extends AppenderSkeleton {
  //--------------------------------------------------------------------------
  // Constants:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  // Protected Variables:
  //--------------------------------------------------------------------------

  protected LogBrokerMonitor _logMonitor;
  protected static LogBrokerMonitor _defaultLogMonitor;
  protected static AppenderFinalizer _finalizer;

  //--------------------------------------------------------------------------
  // Private Variables:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  // Constructors:
  //--------------------------------------------------------------------------

  /**
   * Constructs a <code>LF5Appender</code> using the default instance of
   * the <code>LogBrokerMonitor</code>. This constructor should <bold>always
   * </bold> be  preferred over the
   * <code>LF5Appender(LogBrokerMonitor monitor)</code>
   * constructor, unless you need to spawn additional log monitoring
   * windows.
   */
  public LF5Appender() {
  }

  /**
   * Constructs a <code>LF5Appender<code> using an instance of
   * a <code>LogBrokerMonitor<code> supplied by the user. This
   * constructor should only be used when you need to spawn
   * additional log monitoring windows.
   *
   * @param monitor An instance of a <code>LogBrokerMonitor<code>
   * created by the user.
   */
  public LF5Appender(LogBrokerMonitor monitor) {
  }

  //--------------------------------------------------------------------------
  // Public Methods:
  //--------------------------------------------------------------------------

  /**
   * Appends a <code>LoggingEvent</code> record to the
   * <code>LF5Appender</code>.
   * @param event The <code>LoggingEvent</code>
   * to be appended.
   */
  public void append(LoggingEvent event) {
  }

  /**
   * This method is an empty implementation of the close() method inherited
   * from the <code>org.apache.log4j.Appender</code> interface.
   */
  public void close() {
  }

  /**
   * Returns a value that indicates whether this appender requires a
   * <code>Layout</code>. This method always returns false.
   * No layout is required for the <code>LF5Appender</code>.
   */
  public boolean requiresLayout() {
    return false;
  }

  public void setCallSystemExitOnClose(boolean callSystemExitOnClose) {
  }

  public LogBrokerMonitor getLogBrokerMonitor() {
    return null;
  }

  public static void main(String[] args) {
  }

  public void setMaxNumberOfRecords(int maxNumberOfRecords) {
    _defaultLogMonitor.setMaxNumberOfLogRecords(maxNumberOfRecords);
  }
  //--------------------------------------------------------------------------
  // Protected Methods:
  //--------------------------------------------------------------------------

  /**
   * @return The default instance of the <code>LogBrokerMonitor</code>.
   */
  protected static LogBrokerMonitor getDefaultInstance() {
    return null;
  }

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
  // Private Methods:
  //--------------------------------------------------------------------------


  //--------------------------------------------------------------------------
  // Nested Top-Level Classes or Interfaces:
  //--------------------------------------------------------------------------

}
