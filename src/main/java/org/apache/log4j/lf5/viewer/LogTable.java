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

import org.apache.log4j.lf5.util.DateFormatManager;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * LogTable.
 *
 * @author Michael J. Sikorsky
 * @author Robert Shaw
 * @author Brad Marlborough
 * @author Brent Sprecher
 */

// Contributed by ThoughtWorks Inc.

public class LogTable extends JTable {
  private static final long serialVersionUID = 4867085140195148458L;
  //--------------------------------------------------------------------------
  //   Constants:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Protected Variables:
  //--------------------------------------------------------------------------
  protected int _rowHeight = 30;
  protected JTextArea _detailTextArea;

  // For the columns:
  protected int _numCols = 9;
  protected TableColumn[] _tableColumns = new TableColumn[_numCols];
  protected int[] _colWidths = {40, 40, 40, 70, 70, 360, 440, 200, 60};
  protected LogTableColumn[] _colNames = LogTableColumn.getLogTableColumnArray();
  protected int _colDate = 0;
  protected int _colThread = 1;
  protected int _colMessageNum = 2;
  protected int _colLevel = 3;
  protected int _colNDC = 4;
  protected int _colCategory = 5;
  protected int _colMessage = 6;
  protected int _colLocation = 7;
  protected int _colThrown = 8;

  protected DateFormatManager _dateFormatManager = null;

  //--------------------------------------------------------------------------
  //   Private Variables:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Constructors:
  //--------------------------------------------------------------------------

  public LogTable(JTextArea detailTextArea) {
    super();
  }

  //--------------------------------------------------------------------------
  //   Public Methods:
  //--------------------------------------------------------------------------

  /**
   * Get the DateFormatManager for formatting dates.
   */
  public DateFormatManager getDateFormatManager() {
    return null;
  }

  /**
   * Set the date format manager for formatting dates.
   */
  public void setDateFormatManager(DateFormatManager dfm) {
  }

  public void clearLogRecords() {
  }

  public FilteredLogTableModel getFilteredLogTableModel() {
    return null;
  }

  public void setDetailedView() {
  }

  public void setView(List columns) {
  }

  public void setFont(Font font) {
  }


  //--------------------------------------------------------------------------
  //   Protected Methods:
  //--------------------------------------------------------------------------

  protected void init() {
  }

  // assign a column number to a column name
  protected Vector getColumnNameAndNumber() {
    return null;
  }

  //--------------------------------------------------------------------------
  //   Private Methods:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Nested Top-Level Classes or Interfaces:
  //--------------------------------------------------------------------------

}






