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

import javax.swing.*;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Enumeration;

/**
 * CategoryNodeEditor
 *
 * @author Michael J. Sikorsky
 * @author Robert Shaw
 */

// Contributed by ThoughtWorks Inc.

public class CategoryNodeEditor extends CategoryAbstractCellEditor {
  //--------------------------------------------------------------------------
  //   Constants:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Protected Variables:
  //--------------------------------------------------------------------------
  protected CategoryNodeEditorRenderer _renderer;
  protected CategoryNode _lastEditedNode;
  protected JCheckBox _checkBox;
  protected CategoryExplorerModel _categoryModel;
  protected JTree _tree;

  //--------------------------------------------------------------------------
  //   Private Variables:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Constructors:
  //--------------------------------------------------------------------------

  public CategoryNodeEditor(CategoryExplorerModel model) {
  }

  //--------------------------------------------------------------------------
  //   Public Methods:
  //--------------------------------------------------------------------------

  public Component getTreeCellEditorComponent(JTree tree, Object value,
      boolean selected, boolean expanded,
      boolean leaf, int row) {
    return null;
  }

  public Object getCellEditorValue() {
    return null;
  }
  //--------------------------------------------------------------------------
  //   Protected Methods:
  //--------------------------------------------------------------------------

  protected JMenuItem createPropertiesMenuItem(final CategoryNode node) {
    return null;
  }

  protected void showPropertiesDialog(CategoryNode node) {
  }

  protected Object getDisplayedProperties(CategoryNode node) {
    return null;
  }

  protected void showPopup(CategoryNode node, int x, int y) {
  }

  protected JMenuItem createSelectDescendantsMenuItem(final CategoryNode node) {
    return null;
  }

  protected JMenuItem createUnselectDescendantsMenuItem(final CategoryNode node) {
    return null;
  }

  protected JMenuItem createExpandMenuItem(final CategoryNode node) {
    return null;
  }

  protected JMenuItem createCollapseMenuItem(final CategoryNode node) {
    return null;
  }

  /**
   * This featured was moved from the LogBrokerMonitor class
   * to the CategoryNodeExplorer so that the Category tree
   * could be pruned from the Category Explorer popup menu.
   * This menu option only appears when a user right clicks on
   * the Category parent node.
   *
   * See removeUnusedNodes()
   */
  protected JMenuItem createRemoveMenuItem() {
    return null;
  }

  protected void expandDescendants(CategoryNode node) {
  }

  protected void collapseDescendants(CategoryNode node) {
  }

  /**
   * Removes any inactive nodes from the Category tree.
   */
  protected int removeUnusedNodes() {
    return 0;
  }

  protected void expand(CategoryNode node) {
  }

  protected TreePath getTreePath(CategoryNode node) {
    return null;
  }

  protected void collapse(CategoryNode node) {
  } 

  //-----------------------------------------------------------------------
  //   Private Methods:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Nested Top-Level Classes or Interfaces:
  //--------------------------------------------------------------------------

}
