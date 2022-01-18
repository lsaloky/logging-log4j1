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

import org.apache.log4j.lf5.LogLevel;
import org.apache.log4j.lf5.LogRecord;
import org.apache.log4j.lf5.LogRecordFilter;
import org.apache.log4j.lf5.util.DateFormatManager;
import org.apache.log4j.lf5.util.LogFileParser;
import org.apache.log4j.lf5.util.StreamUtils;
import org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree;
import org.apache.log4j.lf5.viewer.categoryexplorer.CategoryPath;
import org.apache.log4j.lf5.viewer.configure.ConfigurationManager;
import org.apache.log4j.lf5.viewer.configure.MRUFileManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.List;

/**
 * LogBrokerMonitor
 *.
 * @author Michael J. Sikorsky
 * @author Robert Shaw
 * @author Brad Marlborough
 * @author Richard Wan
 * @author Brent Sprecher
 * @author Richard Hurst
 */

// Contributed by ThoughtWorks Inc.

public class LogBrokerMonitor {
  //--------------------------------------------------------------------------
  //   Constants:
  //--------------------------------------------------------------------------

  public static final String DETAILED_VIEW = "Detailed";
//    public static final String STANDARD_VIEW = "Standard";
//    public static final String COMPACT_VIEW = "Compact";
  //--------------------------------------------------------------------------
  //   Protected Variables:
  //--------------------------------------------------------------------------
  protected JFrame _logMonitorFrame;
  protected int _logMonitorFrameWidth = 550;
  protected int _logMonitorFrameHeight = 500;
  protected LogTable _table;
  protected CategoryExplorerTree _categoryExplorerTree;
  protected String _searchText;
  protected String _NDCTextFilter = "";
  protected LogLevel _leastSevereDisplayedLogLevel = LogLevel.DEBUG;

  protected JScrollPane _logTableScrollPane;
  protected JLabel _statusLabel;
  protected Object _lock = new Object();
  protected JComboBox _fontSizeCombo;

  protected int _fontSize = 10;
  protected String _fontName = "Dialog";
  protected String _currentView = DETAILED_VIEW;

  protected boolean _loadSystemFonts = false;
  protected boolean _trackTableScrollPane = true;
  protected Dimension _lastTableViewportSize;
  protected boolean _callSystemExitOnClose = false;
  protected List _displayedLogBrokerProperties = new Vector();

  protected Map _logLevelMenuItems = new HashMap();
  protected Map _logTableColumnMenuItems = new HashMap();

  protected List _levels = null;
  protected List _columns = null;
  protected boolean _isDisposed = false;

  protected ConfigurationManager _configurationManager = null;
  protected MRUFileManager _mruFileManager = null;
  protected File _fileLocation = null;

  //--------------------------------------------------------------------------
  //   Private Variables:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Constructors:
  //--------------------------------------------------------------------------

  /**
   * Construct a LogBrokerMonitor.
   */
  public LogBrokerMonitor(List logLevels) {
  }

  //--------------------------------------------------------------------------
  //   Public Methods:
  //--------------------------------------------------------------------------

  /**
   * Show the frame for the LogBrokerMonitor. Dispatched to the
   * swing thread.
   */
  public void show(final int delay) {
  }

  public void show() {
    show(0);
  }

  /**
   * Dispose of the frame for the LogBrokerMonitor.
   */
  public void dispose() {
  }

  /**
   * Hide the frame for the LogBrokerMonitor.
   */
  public void hide() {
  }

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

  /**
   * Get the value of whether or not System.exit() will be called
   * when the LogBrokerMonitor is closed.
   */
  public boolean getCallSystemExitOnClose() {
    return false;
  }

  /**
   * Set the value of whether or not System.exit() will be called
   * when the LogBrokerMonitor is closed.
   */
  public void setCallSystemExitOnClose(boolean callSystemExitOnClose) {
  }

  /**
   * Add a log record message to be displayed in the LogTable.
   * This method is thread-safe as it posts requests to the SwingThread
   * rather than processing directly.
   */
  public void addMessage(final LogRecord lr) {
  }

  public void setMaxNumberOfLogRecords(int maxNumberOfLogRecords) {
  }

  public JFrame getBaseFrame() {
    return _logMonitorFrame;
  }

  public void setTitle(String title) {
  }

  public void setFrameSize(int width, int height) {
  }

  public void setFontSize(int fontSize) {
  }

  public void addDisplayedProperty(Object messageLine) {
  }

  public Map getLogLevelMenuItems() {
    return null;
  }

  public Map getLogTableColumnMenuItems() {
    return null;
  }

  public JCheckBoxMenuItem getTableColumnMenuItem(LogTableColumn column) {
    return null;
  }

  public CategoryExplorerTree getCategoryExplorerTree() {
    return null;
  }

  // Added in version 1.2 - gets the value of the NDC text filter
  // This value is set back to null each time the Monitor is initialized.
  public String getNDCTextFilter() {
    return null;
  }

  // Added in version 1.2 - sets the NDC Filter based on
  // a String passed in by the user.  This value is persisted
  // in the XML Configuration file.
  public void setNDCLogRecordFilter(String textFilter) {
  }
  //--------------------------------------------------------------------------
  //   Protected Methods:
  //--------------------------------------------------------------------------

  protected void setSearchText(String text) {
    _searchText = text;
  }

  protected void setNDCTextFilter(String text) {
  }

  protected void sortByNDC() {
  }

  protected void findSearchText() {
  }

  protected int getFirstSelectedRow() {
    return 0;
  }

  protected void selectRow(int foundRow) {
  }

  protected int findRecord(
      int startRow,
      String searchText,
      List records
      ) {
    return -1;
  }

  protected boolean matches(LogRecord record, String text) {
    return false;
  }

  protected void refresh(JTextArea textArea) {
  }

  protected void refreshDetailTextArea() {
  }

  protected void clearDetailTextArea() {
  }

  protected int changeFontSizeCombo(JComboBox box, int requestedSize) {
    return -1;
  }

  protected void setFontSizeSilently(int fontSize) {
  }

  protected void setFontSize(Component component, int fontSize) {
  }

  protected void updateFrameSize() {
  }

  protected void pause(int millis) {
  }

  protected void initComponents() {
  }

  protected LogRecordFilter createLogRecordFilter() {
    return null;
  }

  // Added in version 1.2 - Creates a new filter that sorts records based on
  // an NDC string passed in by the user.
  protected LogRecordFilter createNDCLogRecordFilter(String text) {
    return null;
  }


  protected void updateStatusLabel() {
  }

  protected String getRecordsDisplayedMessage() {
    return "";
  }

  protected void addTableModelProperties() {
  }

  protected String getStatusText(int displayedRows, int totalRows) {
    return "";
  }

  protected void makeLogTableListenToCategoryExplorer() {
  }

  protected JPanel createStatusArea() {
    return null;
  }

  protected JTextArea createDetailTextArea() {
    return null;
  }

  protected JMenuBar createMenuBar() {
    return null;
  }

  protected JMenu createLogLevelMenu() {
    return null;
  }

  protected JMenuItem createAllLogLevelsMenuItem() {
    return null;
  }

  protected JMenuItem createNoLogLevelsMenuItem() {
    return null;
  }

  protected JMenu createLogLevelColorMenu() {
    return null;
  }

  protected JMenuItem createResetLogLevelColorMenuItem() {
    return null;
  }

  protected void selectAllLogLevels(boolean selected) {
  }

  protected JCheckBoxMenuItem getMenuItem(LogLevel level) {
    return null;
  }

  protected JMenuItem createSubMenuItem(LogLevel level) {
    return null;
  }

  protected void showLogLevelColorChangeDialog(JMenuItem result, LogLevel level) {
  }

  protected JCheckBoxMenuItem createMenuItem(LogLevel level) {
    return null;
  }

  // view menu
  protected JMenu createViewMenu() {
    return null;
  }

  protected JCheckBoxMenuItem getLogTableColumnMenuItem(LogTableColumn column) {
    return null;
  }

  protected JCheckBoxMenuItem createLogTableColumnMenuItem(LogTableColumn column) {
    return null;
  }

  protected List updateView() {
    return null;
  }

  protected JMenuItem createAllLogTableColumnsMenuItem() {
    return null;
  }

  protected JMenuItem createNoLogTableColumnsMenuItem() {
    return null;
  }

  protected void selectAllLogTableColumns(boolean selected) {
  }

  protected JMenu createFileMenu() {
    return null;
  }

  /**
   * Menu item added to allow log files to be opened with
   * the LF5 GUI.
   */
  protected JMenuItem createOpenMI() {
    return null;
  }

  /**
   * Menu item added to allow log files loaded from a URL
   * to be opened by the LF5 GUI.
   */
  protected JMenuItem createOpenURLMI() {
    return null;
  }

  protected JMenuItem createCloseMI() {
    return null;
  }

  /**
   * Creates a Most Recently Used file list to be
   * displayed in the File menu
   */
  protected void createMRUFileListMI(JMenu menu) {
  }

  protected JMenuItem createExitMI() {
    return null;
  }

  protected JMenu createConfigureMenu() {
    return null;
  }

  protected JMenuItem createConfigureSave() {
    return null;
  }

  protected JMenuItem createConfigureReset() {
    return null;
  }

  protected JMenuItem createConfigureMaxRecords() {
    return null;
  }


  protected void saveConfiguration() {
  }

  protected void resetConfiguration() {
  }

  protected void setMaxRecordConfiguration() {
  }


  protected JMenu createHelpMenu() {
    return null;
  }

  protected JMenuItem createHelpProperties() {
    return null;
  }

  protected void showPropertiesDialog(String title) {
  }

  protected JMenu createEditMenu() {
    return null;
  }

  protected JMenuItem createEditFindNextMI() {
    return null;
  }

  protected JMenuItem createEditFindMI() {
    return null;
  }

  // Added version 1.2 - Allows users to Sort Log Records by an
  // NDC text filter. A new LogRecordFilter was created to
  // sort the records.
  protected JMenuItem createEditSortNDCMI() {
    return null;
  }

  // Added in version 1.2 - Resets the LogRecordFilter back to default
  // filter.
  protected JMenuItem createEditRestoreAllNDCMI() {
    return null;
  }

  protected JToolBar createToolBar() {
    return null;
  }

  protected void setView(String viewString, LogTable table) {
  }

  protected JComboBox createLogLevelCombo() {
    return null;
  }

  protected void setLeastSevereDisplayedLogLevel(LogLevel level) {
  }

  /**
   * Ensures that the Table's ScrollPane Viewport will "track" with updates
   * to the Table.  When the vertical scroll bar is at its bottom anchor
   * and tracking is enabled then viewport will stay at the bottom most
   * point of the component.  The purpose of this feature is to allow
   * a developer to watch the table as messages arrive and not have to
   * scroll after each new message arrives.  When the vertical scroll bar
   * is at any other location, then no tracking will happen.
   * @deprecated tracking is now done automatically.
   */
  protected void trackTableScrollPane() {
  }

  protected void centerFrame(JFrame frame) {
  }

  /**
   * Uses a JFileChooser to select a file to opened with the
   * LF5 GUI.
   */
  protected void requestOpen() {
  }

  /**
   * Uses a Dialog box to accept a URL to a file to be opened
   * with the LF5 GUI.
   */
  protected void requestOpenURL() {
  }

  /**
   * Removes old file list and creates a new file list
   * with the updated MRU list.
   */
  protected void updateMRUList() {
  }

  protected void requestClose() {
  }

  /**
   * Opens a file in the MRU list.
   */
  protected void requestOpenMRU(ActionEvent e) {
  }

  protected void requestExit() {
  }

  protected void closeAfterConfirm() {
  }

  protected Iterator getLogLevels() {
    return null;
  }

  protected Iterator getLogTableColumns() {
    return null;
  }

  /**
   * Loads and parses a log file.
   */
  protected boolean loadLogFile(File file) {
    return false;
  }

  /**
   * Loads a parses a log file running on a server.
   */
  protected boolean loadLogFile(URL url) {
    return false;
  }
  //--------------------------------------------------------------------------
  //   Private Methods:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Nested Top-Level Classes or Interfaces:
  //--------------------------------------------------------------------------
}


