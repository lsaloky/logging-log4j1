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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * LogFactor5InputDialog
 *
 * Creates a popup input dialog box so that users can enter
 * a URL to open a log file from.
 *
 * @author Richard Hurst
 * @author Brad Marlborough
 */

// Contributed by ThoughtWorks Inc.

public class LogFactor5InputDialog extends LogFactor5Dialog {
  //--------------------------------------------------------------------------
  //   Constants:
  //--------------------------------------------------------------------------
  public static final int SIZE = 30;
  //--------------------------------------------------------------------------
  //   Protected Variables:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Private Variables:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Constructors:
  //--------------------------------------------------------------------------

  /**
   * Configures an input dialog box using a defualt size for the text field.
   * param jframe the frame where the dialog will be loaded from.
   * param title the title of the dialog box.
   * param label the label to be put in the dialog box.
   */
  public LogFactor5InputDialog(JFrame jframe, String title, String label) {
    this(jframe, title, label, SIZE);
  }

  /**
   * Configures an input dialog box.
   * param jframe the frame where the dialog will be loaded from.
   * param title the title of the dialog box.
   * param label the label to be put in the dialog box.
   * param size the size of the text field.
   */
  public LogFactor5InputDialog(JFrame jframe, String title, String label,
      int size) {
    super(jframe, title, true);
  }

  //--------------------------------------------------------------------------
  //   Public Methods:
  //--------------------------------------------------------------------------
  public String getText() {
    return "";
  }

  //--------------------------------------------------------------------------
  //   Protected Methods:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Private Methods:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Nested Top-Level Classes or Interfaces
  //--------------------------------------------------------------------------
}