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

import org.apache.log4j.Priority;

import javax.swing.table.AbstractTableModel;

class MyTableModel
    extends AbstractTableModel
{
    MyTableModel() { }
    
    public int getRowCount() {
        return 0;
    }

    public int getColumnCount() {
        return 0;
    }

    public String getColumnName(int aCol) {
        return "";
    }

    public Class getColumnClass(int aCol) {
        return Object.class;
    }

    public Object getValueAt(int aRow, int aCol) {
        return null;
    }

    public void setPriorityFilter(Priority aPriority) { }

    public void setThreadFilter(String aStr) { }

    public void setMessageFilter(String aStr) {  }

    public void setNDCFilter(String aStr) { }

    public void setCategoryFilter(String aStr) { }
    
    public void addEvent(EventDetails aEvent) {  }

    public void clear() { }
    
    public void toggle() { }

    public boolean isPaused() {
        return false;
    }

    public EventDetails getEventDetails(int aRow) {
        return null;
    }

    private void updateFilteredEvents(boolean aInsertedToFront) { }

    private boolean matchFilter(EventDetails aEvent) {
        return false;
    }
}
