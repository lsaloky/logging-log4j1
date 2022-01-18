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

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;

/**
 * Provides methods to accomplish common yet non-trivial tasks
 * with Swing. Obvious implementations of these methods have been
 * tried and failed.
 *
 * @author Richard Wan
 */

// Contributed by ThoughtWorks Inc.

public class LF5SwingUtils {
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

  //--------------------------------------------------------------------------
  //   Public Methods:
  //--------------------------------------------------------------------------

  /**
   * Selects a the specified row in the specified JTable and scrolls
   * the specified JScrollpane to the newly selected row. More importantly,
   * the call to repaint() delayed long enough to have the table
   * properly paint the newly selected row which may be offscre
   * @param table should belong to the specified JScrollPane
   */
  public static void selectRow(int row, JTable table, JScrollPane pane) {
  }

  /**
   * Makes the specified Adjustable track if the view area expands and
   * the specified Adjustable is located near the of the view.
   */
  public static void makeScrollBarTrack(Adjustable scrollBar) {
  }

  /**
   * Makes the vertical scroll bar of the specified JScrollPane
   * track if the view expands (e.g. if rows are added to an underlying
   * table).
   */
  public static void makeVerticalScrollBarTrack(JScrollPane pane) {
  }

  //--------------------------------------------------------------------------
  //   Protected Methods:
  //--------------------------------------------------------------------------
  protected static boolean contains(int row, TableModel model) {
    return false;
  }

  protected static void selectRow(int row, ListSelectionModel model) {
  }

  protected static void moveAdjustable(int location, Adjustable scrollBar) {
  }

  /**
   * Work around for JTable/viewport bug.
   * @link http://developer.java.sun.com/developer/bugParade/bugs/4205145.html
   */
  protected static void repaintLater(final JComponent component) {
  }
  //--------------------------------------------------------------------------
  //   Private Methods:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Nested Top-Level Classes or Interfaces
  //--------------------------------------------------------------------------
}

