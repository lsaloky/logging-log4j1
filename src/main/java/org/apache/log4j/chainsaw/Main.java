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
package org.apache.log4j.chainsaw;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Properties;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * The main application.
 *
 * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a>
 */
public class Main
    extends JFrame
{
    /** name of property for port name **/
    public static final String PORT_PROP_NAME = "chainsaw.port";

    /**
     * Creates a new <code>Main</code> instance.
     */
    private Main() {
    }

    /**
     * Setup recieving messages.
     *
     * @param aModel a <code>MyTableModel</code> value
     */
    private void setupReceiver(MyTableModel aModel) {
    }

    /** initialise log4j **/
    private static void initLog4J() {
    }

    /**
     * The main method.
     *
     * @param aArgs ignored
     */
    public static void main(String[] aArgs) {
    }
}
