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
package org.apache.log4j.lf5.viewer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LogTableColumn
 *
 * @author Michael J. Sikorsky
 * @author Brad Marlborough
 */

// Contributed by ThoughtWorks Inc.

public class LogTableColumn implements java.io.Serializable {
  private static final long serialVersionUID = -4275827753626456547L;

  // log4j table columns.
  public final static LogTableColumn DATE = new LogTableColumn("Date");
  public final static LogTableColumn THREAD = new LogTableColumn("Thread");
  public final static LogTableColumn MESSAGE_NUM = new LogTableColumn("Message #");
  public final static LogTableColumn LEVEL = new LogTableColumn("Level");
  public final static LogTableColumn NDC = new LogTableColumn("NDC");
  public final static LogTableColumn CATEGORY = new LogTableColumn("Category");
  public final static LogTableColumn MESSAGE = new LogTableColumn("Message");
  public final static LogTableColumn LOCATION = new LogTableColumn("Location");
  public final static LogTableColumn THROWN = new LogTableColumn("Thrown");


  //--------------------------------------------------------------------------
  //   Protected Variables:
  //--------------------------------------------------------------------------
  protected String _label;

  //--------------------------------------------------------------------------
  //   Private Variables:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Constructors:
  //--------------------------------------------------------------------------
  static {
  }


  public LogTableColumn(String label) {
  }

  //--------------------------------------------------------------------------
  //   Public Methods:
  //--------------------------------------------------------------------------

  /**
   * Return the Label of the LogLevel.
   */
  public String getLabel() {
    return "";
  }

  /**
   * Convert a column label into a LogTableColumn object.
   *
   * @param column The label of a level to be converted into a LogTableColumn.
   * @return LogTableColumn The LogTableColumn with a label equal to column.
   * @throws LogTableColumnFormatException Is thrown when the column can not be
   *         converted into a LogTableColumn.
   */
  public static LogTableColumn valueOf(String column)
      throws LogTableColumnFormatException {
    return null;
  }

  /**
   * @return A <code>List</code> of <code>LogTableColumn/code> objects that map
   * to log4j <code>Column</code> objects.
   */
  public static List getLogTableColumns() {
    return null;
  }

  public static LogTableColumn[] getLogTableColumnArray() {
    return null;
  }

  //--------------------------------------------------------------------------
  //   Protected Methods:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Private Methods:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Nested Top-Level Classes or Interfaces:
  //--------------------------------------------------------------------------

}






