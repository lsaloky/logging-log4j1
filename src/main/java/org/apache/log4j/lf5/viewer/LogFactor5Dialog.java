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
import java.awt.*;

/**
 * LogFactor5Dialog
 *
 * @author Richard Hurst
 * @author Brad Marlborough
 */

// Contributed by ThoughtWorks Inc.

public abstract class LogFactor5Dialog extends JDialog {
  //--------------------------------------------------------------------------
  //   Constants:
  //--------------------------------------------------------------------------
  protected static final Font DISPLAY_FONT = new Font("Arial", Font.BOLD, 12);
  //--------------------------------------------------------------------------
  //   Protected Variables:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Private Variables:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Constructors:
  //--------------------------------------------------------------------------
  protected LogFactor5Dialog(JFrame jframe, String message, boolean modal) {
    super(jframe, message, modal);
  }

  //--------------------------------------------------------------------------
  //   Public Methods:
  //--------------------------------------------------------------------------
  public void show() {
  }

  //--------------------------------------------------------------------------
  //   Protected Methods:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Private Methods:
  //--------------------------------------------------------------------------
  protected void centerWindow(Window win) {
  }

  protected void wrapStringOnPanel(String message,
      Container container) {
  }

  protected GridBagConstraints getDefaultConstraints() {
    return null;
  }

  protected void minimumSizeDialog(Component component,
      int minWidth,
      int minHeight) {
  }
  //--------------------------------------------------------------------------
  //   Nested Top-Level Classes or Interfaces
  //--------------------------------------------------------------------------
}