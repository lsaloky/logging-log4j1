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
import java.text.MessageFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.apache.log4j.Logger;

/**
 * A panel for showing a stack trace.
 *
 * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a>
 */
class DetailPanel
    extends JPanel
    implements ListSelectionListener
{
    /**
     * Creates a new <code>DetailPanel</code> instance.
     *
     * @param aTable the table to listen for selections on
     * @param aModel the model backing the table
     */
    DetailPanel(JTable aTable, final MyTableModel aModel) {
    }

    /** @see ListSelectionListener **/
    public void valueChanged(ListSelectionEvent aEvent) {
    }

    ////////////////////////////////////////////////////////////////////////////
    // Private methods
    ////////////////////////////////////////////////////////////////////////////

    /**
     * Returns a string representation of a throwable.
     *
     * @param aEvent contains the throwable information
     * @return a <code>String</code> value
     */
    private static String getThrowableStrRep(EventDetails aEvent) {
        return null;
    }

    /**
     * Escape &lt;, &gt; &amp; and &quot; as their entities. It is very
     * dumb about &amp; handling.
     * @param aStr the String to escape.
     * @return the escaped String
     */
    private String escape(String aStr) {
        return null;
    }
}
