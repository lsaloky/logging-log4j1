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

// Contributors: Dan MacDonald <dan@redknee.com>

package org.apache.log4j.net;

import java.net.InetAddress;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

public class SocketAppender extends AppenderSkeleton {

  public SocketAppender() { }

  public SocketAppender(InetAddress address, int port) { }

  public SocketAppender(String host, int port) { }

  public void activateOptions() { }

  public void close() { }

  public void cleanUp() { }

  void connect(InetAddress address, int port) { }

  public void append(LoggingEvent event) { }

  void fireConnector() { }

  static InetAddress getAddressByName(String host) { return null; }

  public boolean requiresLayout() { return false; }

  public void setRemoteHost(String host) { }

  public String getRemoteHost() { return ""; }

  public void setPort(int port) { }

  public int getPort() { return 0; }

  public void setLocationInfo(boolean locationInfo) { }
  
  public boolean getLocationInfo() {  return false; }

  public void setApplication(String lapp) { }
  
  public String getApplication() { return ""; }

  public void setReconnectionDelay(int delay) {}

  public int getReconnectionDelay() { return 0; }
}
