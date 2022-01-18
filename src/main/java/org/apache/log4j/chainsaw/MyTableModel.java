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

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.table.AbstractTableModel;
import org.apache.log4j.Priority;
import org.apache.log4j.Logger;

/**
 * Represents a list of <code>EventDetails</code> objects that are sorted on
 * logging time. Methods are provided to filter the events that are visible.
 *
 * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a>
 */
class MyTableModel
    extends AbstractTableModel
{

    /**
     * Creates a new <code>MyTableModel</code> instance.
     *
     */
    MyTableModel() {
    }


    ////////////////////////////////////////////////////////////////////////////
    // Table Methods
    ////////////////////////////////////////////////////////////////////////////

    /** @see javax.swing.table.TableModel **/
    public int getRowCount() {
        return 0;
    }

    /** @see javax.swing.table.TableModel **/
    public int getColumnCount() {
        return 0;
    }

    /** @see javax.swing.table.TableModel **/
    public String getColumnName(int aCol) {
        return "";
    }

    /** @see javax.swing.table.TableModel **/
    public Class getColumnClass(int aCol) {
        return Object.class;
    }

    /** @see javax.swing.table.TableModel **/
    public Object getValueAt(int aRow, int aCol) {
        return null;
    }

    ////////////////////////////////////////////////////////////////////////////
    // Public Methods
    ////////////////////////////////////////////////////////////////////////////

    /**
     * Sets the priority to filter events on. Only events of equal or higher
     * property are now displayed.
     *
     * @param aPriority the priority to filter on
     */
    public void setPriorityFilter(Priority aPriority) {
    }

    /**
     * Set the filter for the thread field.
     *
     * @param aStr the string to match
     */
    public void setThreadFilter(String aStr) {
    }

    /**
     * Set the filter for the message field.
     *
     * @param aStr the string to match
     */
    public void setMessageFilter(String aStr) {
    }

    /**
     * Set the filter for the NDC field.
     *
     * @param aStr the string to match
     */
    public void setNDCFilter(String aStr) {
    }

    /**
     * Set the filter for the category field.
     *
     * @param aStr the string to match
     */
    public void setCategoryFilter(String aStr) {
    }

    /**
     * Add an event to the list.
     *
     * @param aEvent a <code>EventDetails</code> value
     */
    public void addEvent(EventDetails aEvent) {
    }

    /**
     * Clear the list of all events.
     */
    public void clear() {
    }

    /** Toggle whether collecting events **/
    public void toggle() {
    }

    /** @return whether currently paused collecting events **/
    public boolean isPaused() {
        return false;
    }

    /**
     * Get the throwable information at a specified row in the filtered events.
     *
     * @param aRow the row index of the event
     * @return the throwable information
     */
    public EventDetails getEventDetails(int aRow) {
        return null;
    }

    ////////////////////////////////////////////////////////////////////////////
    // Private methods
    ////////////////////////////////////////////////////////////////////////////

    /**
     * Update the filtered events data structure.
     * @param aInsertedToFront indicates whether events were added to front of
     *        the events. If true, then the current first event must still exist
     *        in the list after the filter is applied.
     */
    private void updateFilteredEvents(boolean aInsertedToFront) {
    }

    /**
     * Returns whether an event matches the filters.
     *
     * @param aEvent the event to check for a match
     * @return whether the event matches
     */
    private boolean matchFilter(EventDetails aEvent) {
        return false;
    }
}
