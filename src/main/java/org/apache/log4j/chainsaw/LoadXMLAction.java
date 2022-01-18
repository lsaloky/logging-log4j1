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

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.apache.log4j.Logger;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/**
 * Encapsulates the action to load an XML file.
 *
 * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a>
 * @version 1.0
 */
class LoadXMLAction
    extends AbstractAction
{
    /**
     * Creates a new <code>LoadXMLAction</code> instance.
     *
     * @param aParent the parent frame
     * @param aModel the model to add events to
     * @exception SAXException if an error occurs
     * @throws ParserConfigurationException if an error occurs
     */
    LoadXMLAction(JFrame aParent, MyTableModel aModel)
        throws SAXException, ParserConfigurationException
    {
    }

    /**
     * Prompts the user for a file to load events from.
     * @param aIgnore an <code>ActionEvent</code> value
     */
    public void actionPerformed(ActionEvent aIgnore) {
    }

    /**
     * Loads the contents of file into the model
     *
     * @param aFile the file to extract events from
     * @return the number of events loaded
     * @throws SAXException if an error occurs
     * @throws IOException if an error occurs
     */
    private int loadFile(String aFile)
        throws SAXException, IOException
    {
        return 0;
    }
}
