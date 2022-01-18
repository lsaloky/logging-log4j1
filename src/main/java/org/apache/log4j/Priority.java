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

package org.apache.log4j;

public class Priority {

  transient int level;
  transient String levelStr;

  public final static int OFF_INT = Integer.MAX_VALUE;
  public final static int FATAL_INT = 50000;
  public final static int ERROR_INT = 40000;
  public final static int WARN_INT  = 30000;
  public final static int INFO_INT  = 20000;
  public final static int DEBUG_INT = 10000;
  public final static int ALL_INT = Integer.MIN_VALUE;

  final static public Priority FATAL = new Level(FATAL_INT, "FATAL", 0);
  final static public Priority ERROR = new Level(ERROR_INT, "ERROR", 3);
  final static public Priority WARN  = new Level(WARN_INT, "WARN",  4);
  final static public Priority INFO  = new Level(INFO_INT, "INFO",  6);
  final static public Priority DEBUG = new Level(DEBUG_INT, "DEBUG", 7);
  protected Priority() {
    level = DEBUG_INT;
    levelStr = "DEBUG";
  }

  protected
  Priority(int level, String levelStr, int syslogEquivalent) {
    this.level = level;
    this.levelStr = levelStr;
  }

  public
  boolean equals(Object o) {
    if(o instanceof Priority) {
      Priority r = (Priority) o;
      return (this.level == r.level);
    } else {
      return false;
    }
  }

  public final int getSyslogEquivalent() { return 0; }

  public boolean isGreaterOrEqual(Priority r) {
    return level >= r.level;
  }

  public static Priority[] getAllPossiblePriorities() {
    return new Priority[] {Priority.FATAL, Priority.ERROR, Level.WARN, 
			   Priority.INFO, Priority.DEBUG};
  }

  final public String toString() {
    return levelStr;
  }

  public final int toInt() {
    return level;
  }

  public static Priority toPriority(String sArg) {
    return Level.toLevel(sArg);
  }
  
  public static Priority toPriority(int val) {
    return toPriority(val, Priority.DEBUG);
  }
  
  public static Priority toPriority(int val, Priority defaultPriority) {
    return Level.toLevel(val, (Level) defaultPriority);
  }
  public static Priority toPriority(String sArg, Priority defaultPriority) {                  
    return Level.toLevel(sArg, (Level) defaultPriority);
  }
}
