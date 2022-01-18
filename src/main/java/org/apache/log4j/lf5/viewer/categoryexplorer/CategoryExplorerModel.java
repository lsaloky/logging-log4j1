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
package org.apache.log4j.lf5.viewer.categoryexplorer;

import org.apache.log4j.lf5.LogRecord;

import javax.swing.*;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

/**
 * CategoryExplorerModel
 *
 * @author Michael J. Sikorsky
 * @author Robert Shaw
 * @author Brent Sprecher
 * @author Richard Hurst
 */

// Contributed by ThoughtWorks Inc.

public class CategoryExplorerModel extends DefaultTreeModel {
  private static final long serialVersionUID = -3413887384316015901L;

  //--------------------------------------------------------------------------
  //   Constants:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Protected Variables:
  //--------------------------------------------------------------------------

  protected boolean _renderFatal = true;
  protected ActionListener _listener = null;
  protected ActionEvent _event = null;

  //--------------------------------------------------------------------------
  //   Private Variables:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Constructors:
  //--------------------------------------------------------------------------

  public CategoryExplorerModel(CategoryNode node) {
    super(node);
  }
  //--------------------------------------------------------------------------
  //   Public Methods:
  //--------------------------------------------------------------------------

  public void addLogRecord(LogRecord lr) {
  }

  public CategoryNode getRootCategoryNode() {
    return null;
  }

  public CategoryNode getCategoryNode(String category) {
    return null;
  }

  /**
   * returns null if no CategoryNode exists.
   */
  public CategoryNode getCategoryNode(CategoryPath path) {
    return null;
  }

  /**
   * @return true if all the nodes in the specified CategoryPath are
   * selected.
   */
  public boolean isCategoryPathActive(CategoryPath path) {
    return false;
  }


  /**
   * <p>Method altered by Richard Hurst such that it returns the CategoryNode
   * corresponding to the CategoryPath</p>
   *
   * @param path category path.
   * @return CategoryNode
   */
  public CategoryNode addCategory(CategoryPath path) {
    return null;
  }

  public void update(CategoryNode node, boolean selected) {
  }

  public void setDescendantSelection(CategoryNode node, boolean selected) {
  }

  public void setParentSelection(CategoryNode node, boolean selected) {
  }


  public void addActionListener(ActionListener l) {
  }

  public void removeActionListener(ActionListener l) {
  }

  public void resetAllNodeCounts() {
  }

  /**
   * <p>Returns the CategoryPath to the specified CategoryNode</p>
   *
   * @param node The target CategoryNode
   * @return CategoryPath
   */
  public TreePath getTreePathToRoot(CategoryNode node) {
    return null;
  }

  //--------------------------------------------------------------------------
  //   Protected Methods:
  //--------------------------------------------------------------------------
  protected void notifyActionListeners() {
  }

  /**
   * Fires a nodechanged event on the SwingThread.
   */
  protected void refresh(final CategoryNode node) {
  }

  //--------------------------------------------------------------------------
  //   Private Methods:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Nested Top-Level Classes or Interfaces:
  //--------------------------------------------------------------------------

}






