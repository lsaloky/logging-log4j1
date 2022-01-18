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
import javax.swing.event.TreeModelEvent;
import javax.swing.tree.TreePath;
import java.awt.event.MouseEvent;

/**
 * CategoryExplorerTree
 *
 * @author Michael J. Sikorsky
 * @author Robert Shaw
 * @author Brent Sprecher
 * @author Brad Marlborough
 */

// Contributed by ThoughtWorks Inc.

public class CategoryExplorerTree extends JTree {
  private static final long serialVersionUID = 8066257446951323576L;
  //--------------------------------------------------------------------------
  //   Constants:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Protected Variables:
  //--------------------------------------------------------------------------
  protected CategoryExplorerModel _model;
  protected boolean _rootAlreadyExpanded = false;

  //--------------------------------------------------------------------------
  //   Private Variables:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Constructors:
  //--------------------------------------------------------------------------

  /**
   * Construct a CategoryExplorerTree with a specific model.
   */
  public CategoryExplorerTree(CategoryExplorerModel model) {
    super(model);
  }

  /**
   * Construct a CategoryExplorerTree and create a default CategoryExplorerModel.
   */
  public CategoryExplorerTree() {
    super();
  }

  //--------------------------------------------------------------------------
  //   Public Methods:
  //--------------------------------------------------------------------------

  public CategoryExplorerModel getExplorerModel() {
    return null;
  }

  public String getToolTipText(MouseEvent e) {
    return "";
  }

  //--------------------------------------------------------------------------
  //   Protected Methods:
  //--------------------------------------------------------------------------

  protected void init() {
  }

  protected void expandRootNode() {
  }

  protected void ensureRootExpansion() {
  }

  //--------------------------------------------------------------------------
  //   Private Methods:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Nested Top-Level Classes or Interfaces:
  //--------------------------------------------------------------------------

}






