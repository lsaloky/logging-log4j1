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

// Contributors: Christopher Williams
//               Mathias Bogaert

package org.apache.log4j;

import org.apache.log4j.helpers.DateLayout;
import org.apache.log4j.spi.LoggingEvent;

public class TTCCLayout extends DateLayout {

  public TTCCLayout() { }
  
  public TTCCLayout(String dateFormatType) { }

  public void setThreadPrinting(boolean threadPrinting) { }

  public boolean getThreadPrinting() { return false; }

  public void setCategoryPrefixing(boolean categoryPrefixing) { }

  public boolean getCategoryPrefixing() { return false; }

  public void setContextPrinting(boolean contextPrinting) { }

  public boolean getContextPrinting() { return false; }

  public String format(LoggingEvent event) { return ""; }
  
  public boolean ignoresThrowable() { return true; }
  
}
