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

package org.apache.log4j.net;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.Layout;
import org.apache.log4j.spi.LoggingEvent;

public class SyslogAppender extends AppenderSkeleton {

  public SyslogAppender() { }

  public SyslogAppender(Layout layout, int syslogFacility) { }

  public SyslogAppender(Layout layout, String syslogHost, int syslogFacility) { }

  public void close() { }

  private void initSyslogFacilityStr() { }
  
  public static String getFacilityString(int syslogFacility) { return ""; }

  public static int getFacility(String facilityName) { return 0; }

  private void splitPacket(final String header, final String packet) { }

  public void append(LoggingEvent event) { }

  public void activateOptions() { }

  public boolean requiresLayout() {
    return true;
  }

  public void setSyslogHost(final String syslogHost) { }

  public String getSyslogHost() { return ""; }

  public void setFacility(String facilityName) { }

  public String getFacility() { return ""; }
  
  public void setFacilityPrinting(boolean on) { }
  
  public boolean getFacilityPrinting() { return false; }

  public final boolean getHeader() { return false; }

  public final void setHeader(final boolean val) { }

  private String getLocalHostname() { return ""; }

  private String getPacketHeader(final long timeStamp) { return ""; }

  private void sendLayoutMessage(final String msg) { }
}
