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

import java.util.StringTokenizer;
import org.apache.log4j.Level;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * A content handler for document containing Log4J events logged using the
 * XMLLayout class. It will create events and add them to a supplied model.
 *
 * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a>
 * @version 1.0
 */
class XMLFileHandler
    extends DefaultHandler
{
    /**
     * Creates a new <code>XMLFileHandler</code> instance.
     *
     * @param aModel where to add the events
     */
    XMLFileHandler(MyTableModel aModel) {
    }

    /** @see DefaultHandler **/
    public void startDocument()
        throws SAXException
    {
    }

    /** @see DefaultHandler **/
    public void characters(char[] aChars, int aStart, int aLength) {
    }

    /** @see DefaultHandler **/
    public void endElement(String aNamespaceURI,
                           String aLocalName,
                           String aQName)
    {
    }

    /** @see DefaultHandler **/
    public void startElement(String aNamespaceURI,
                             String aLocalName,
                             String aQName,
                             Attributes aAtts)
    {
    }

    /** @return the number of events in the document **/
    int getNumEvents() {
        return 0; 
    }

    ////////////////////////////////////////////////////////////////////////////
    // Private methods
    ////////////////////////////////////////////////////////////////////////////

    /** Add an event to the model **/
    private void addEvent() {
    }

    /** Reset the data for an event **/
    private void resetData() {
    }
}
