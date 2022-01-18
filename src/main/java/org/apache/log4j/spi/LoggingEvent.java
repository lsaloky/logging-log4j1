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

package org.apache.log4j.spi;

import org.apache.log4j.*;

import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.helpers.Loader;
import java.lang.reflect.Method;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.Hashtable;
import java.util.Set;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class LoggingEvent implements java.io.Serializable {

  transient public final String fqnOfCategoryClass;
  transient private Category logger;
  transient public Priority level;
  private ThrowableInformation throwableInfo;
  public final long timeStamp;

  // Serialization
  static final long serialVersionUID = -868428216207166145L;
  
  /**
     Instantiate a LoggingEvent from the supplied parameters.

     <p>Except {@link #timeStamp} all the other fields of
     <code>LoggingEvent</code> are filled when actually needed.
     <p>
     @param logger The logger generating this event.
     @param level The level of this event.
     @param message  The message of this event.
     @param throwable The throwable of this event.  */
  public LoggingEvent(String fqnOfCategoryClass, Category logger,
		      Priority level, Object message, Throwable throwable) {
    this.fqnOfCategoryClass = fqnOfCategoryClass;
    this.logger = logger;
    this.level = level;
    if(throwable != null) {
      this.throwableInfo = new ThrowableInformation(throwable);
    }
    timeStamp = System.currentTimeMillis();
  }

  /**
     Instantiate a LoggingEvent from the supplied parameters.

     <p>Except {@link #timeStamp} all the other fields of
     <code>LoggingEvent</code> are filled when actually needed.
     <p>
     @param logger The logger generating this event.
     @param timeStamp the timestamp of this logging event
     @param level The level of this event.
     @param message  The message of this event.
     @param throwable The throwable of this event.  */
  public LoggingEvent(String fqnOfCategoryClass, Category logger,
		      long timeStamp, Priority level, Object message,
		      Throwable throwable) {
    this.fqnOfCategoryClass = fqnOfCategoryClass;
    this.logger = logger;
    this.level = level;
    if(throwable != null) {
      this.throwableInfo = new ThrowableInformation(throwable);
    }
    this.timeStamp = timeStamp;
  }

    /**
       Create new instance.
       @since 1.2.15
       @param fqnOfCategoryClass Fully qualified class name
                 of Logger implementation.
       @param logger The logger generating this event.
       @param timeStamp the timestamp of this logging event
       @param level The level of this event.
       @param message  The message of this event.
       @param threadName thread name
       @param throwable The throwable of this event.
       @param ndc Nested diagnostic context
       @param info Location info
       @param properties MDC properties
     */
    public LoggingEvent(final String fqnOfCategoryClass,
                        final Category logger,
                        final long timeStamp,
                        final Level level,
                        final Object message,
                        final String threadName,
                        final ThrowableInformation throwable,
                        final String ndc,
                        final LocationInfo info,
                        final java.util.Map properties) {
      super();
      this.fqnOfCategoryClass = fqnOfCategoryClass;
      this.logger = logger;
      this.level = level;
      if(throwable != null) {
        this.throwableInfo = throwable;
      }
      this.timeStamp = timeStamp;
    }


  public LocationInfo getLocationInformation() { return null; }

  public Level getLevel() { return (Level) level; }

  public String getLoggerName() { return ""; }

  public Category getLogger() { return logger; }

  public Object getMessage() { return ""; }

  public String getNDC() { return ""; }

  public Object getMDC(String key) { return null; }

  public void getMDCCopy() { }

  public String getRenderedMessage() { return ""; }

  public static long getStartTime() {  return 0; }

  public String getThreadName() { return ""; }

  public ThrowableInformation getThrowableInformation() { return throwableInfo; }

  public String[] getThrowableStrRep() { return null; }

  private void readLevel(ObjectInputStream ois) throws java.io.IOException, ClassNotFoundException { }

  private void readObject(ObjectInputStream ois) throws java.io.IOException, ClassNotFoundException { }

  private void writeObject(ObjectOutputStream oos) throws java.io.IOException { }

  private void writeLevel(ObjectOutputStream oos) throws java.io.IOException { }

  public final void setProperty(final String propName, final String propValue) { }

  public final String getProperty(final String key) { return ""; }

  public final boolean locationInformationExists() { return true; }

  public final long getTimeStamp() { return 0; }

  public Set getPropertyKeySet() { return null; }

  public Map getProperties() { return null; }

  public String getFQNOfLoggerClass() { return fqnOfCategoryClass; }
}
