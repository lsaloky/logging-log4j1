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

import org.apache.log4j.lf5.LogRecord;
import org.apache.log4j.lf5.LogRecordFilter;
import org.apache.log4j.lf5.PassingLogRecordFilter;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


/**
 * A TableModel for LogRecords which includes filtering support.
 *
 * @author Richard Wan
 * @author Brent Sprecher
 */

// Contributed by ThoughtWorks Inc.

public class FilteredLogTableModel
    extends AbstractTableModel {
  //--------------------------------------------------------------------------
  //   Constants:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Protected Variables:
  //--------------------------------------------------------------------------

  protected LogRecordFilter _filter = new PassingLogRecordFilter();
  protected List _allRecords = new ArrayList();
  protected List _filteredRecords;
  protected int _maxNumberOfLogRecords = 5000;
  protected String[] _colNames = {"Date",
                                  "Thread",
                                  "Message #",
                                  "Level",
                                  "NDC",
                                  "Category",
                                  "Message",
                                  "Location",
                                  "Thrown"};

  //--------------------------------------------------------------------------
  //   Private Variables:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Constructors:
  //--------------------------------------------------------------------------

  public FilteredLogTableModel() {
    super();
  }

  //--------------------------------------------------------------------------
  //   Public Methods:
  //--------------------------------------------------------------------------

  public void setLogRecordFilter(LogRecordFilter filter) {
  }

  public LogRecordFilter getLogRecordFilter() {
    return null;
  }

  public String getColumnName(int i) {
    return "";
  }

  public int getColumnCount() {
    return 0;
  }

  public int getRowCount() {
    return 0;
  }

  public int getTotalRowCount() {
    return 0;
  }

  public Object getValueAt(int row, int col) {
    return null;
  }

  public void setMaxNumberOfLogRecords(int maxNumRecords) {
  }

  public boolean addLogRecord(LogRecord record) {
    return true;
  }

  /**
   * Forces the LogTableModel to requery its filters to determine
   * which records to display.
   */
  public void refresh() {
  }

  public void fastRefresh() {
  }


  /**
   * Clears all records from the LogTableModel
   */
  public void clear() {
  }

  //--------------------------------------------------------------------------
  //   Protected Methods:
  //--------------------------------------------------------------------------

  protected List getFilteredRecords() {
    return null;
  }

  protected List createFilteredRecordsList() {
    return null;
  }

  protected LogRecord getFilteredRecord(int row) {
    return null;
  }

  protected Object getColumn(int col, LogRecord lr) {
    return null;
  }

  // We don't want the amount of rows to grow without bound,
  // leading to a out-of-memory-exception.  Especially not good
  // in a production environment :)

  // This method & clearLogRecords() are synchronized so we don't
  // delete rows that don't exist.
  protected void trimRecords() {
  }

  protected boolean needsTrimming() {
    return false;
  }

  protected void trimOldestRecords() {
  }

  //--------------------------------------------------------------------------
  //   Private Methods:
  //--------------------------------------------------------------------------
  private int numberOfRecordsToTrim() {
    return 0;
  }

  //--------------------------------------------------------------------------
  //   Nested Top-Level Classes or Interfaces
  //--------------------------------------------------------------------------
}

