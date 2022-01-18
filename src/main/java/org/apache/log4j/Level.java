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

// Contributors:  Kitching Simon <Simon.Kitching@orange.ch>
//                Nicholas Wolff

package org.apache.log4j;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class Level extends Priority implements Serializable {

  public static final int TRACE_INT = 5000;

  final static public Level OFF = new Level(OFF_INT, "OFF", 0);

  final static public Level FATAL = new Level(FATAL_INT, "FATAL", 0);

  final static public Level ERROR = new Level(ERROR_INT, "ERROR", 3);

  final static public Level WARN  = new Level(WARN_INT, "WARN",  4);

  final static public Level INFO  = new Level(INFO_INT, "INFO",  6);

  final static public Level DEBUG = new Level(DEBUG_INT, "DEBUG", 7);

  public static final Level TRACE = new Level(TRACE_INT, "TRACE", 7);

  final static public Level ALL = new Level(ALL_INT, "ALL", 7);

  static final long serialVersionUID = 3491141966387921974L;

  protected Level(int level, String levelStr, int syslogEquivalent) {
    super(level, levelStr, syslogEquivalent);
  }

  public static Level toLevel(String sArg) {
    return (Level) toLevel(sArg, Level.DEBUG);
  }

  public static Level toLevel(int val) {
    return (Level) toLevel(val, Level.DEBUG);
  }


  public static Level toLevel(int val, Level defaultLevel) {
    switch(val) {
    case ALL_INT: return ALL;
    case DEBUG_INT: return Level.DEBUG;
    case INFO_INT: return Level.INFO;
    case WARN_INT: return Level.WARN;
    case ERROR_INT: return Level.ERROR;
    case FATAL_INT: return Level.FATAL;
    case OFF_INT: return OFF;
    case TRACE_INT: return Level.TRACE;
    default: return defaultLevel;
    }
  }

  public static Level toLevel(String sArg, Level defaultLevel) {                  
    if(sArg == null)
       return defaultLevel;
    
    String s = sArg.toUpperCase();

    if(s.equals("ALL")) return Level.ALL; 
    if(s.equals("DEBUG")) return Level.DEBUG; 
    if(s.equals("INFO"))  return Level.INFO;
    if(s.equals("WARN"))  return Level.WARN;  
    if(s.equals("ERROR")) return Level.ERROR;
    if(s.equals("FATAL")) return Level.FATAL;
    if(s.equals("OFF")) return Level.OFF;
    if(s.equals("TRACE")) return Level.TRACE;
    if(s.equals("\u0130NFO")) return Level.INFO;
    return defaultLevel;
  }

  private void readObject(final ObjectInputStream s) throws IOException, ClassNotFoundException {  }

  private void writeObject(final ObjectOutputStream s) throws IOException { }

  private Object readResolve() throws ObjectStreamException { return this; }
}
