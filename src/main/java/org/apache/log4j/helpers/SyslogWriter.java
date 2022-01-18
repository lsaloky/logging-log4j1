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

package org.apache.log4j.helpers;


import java.io.Writer;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.DatagramPacket;
import java.net.UnknownHostException;
import java.net.SocketException;
import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;

/**
   SyslogWriter is a wrapper around the java.net.DatagramSocket class
   so that it behaves like a java.io.Writer.

   @since 0.7.3
*/
public class SyslogWriter extends Writer {

  final int SYSLOG_PORT = 514;
  /**
   *  Host string from last constructed SyslogWriter.
   *  @deprecated
   */
  static String syslogHost;

  /**
   *  Constructs a new instance of SyslogWriter.
   *  @param syslogHost host name, may not be null.  A port
   *  may be specified by following the name or IPv4 literal address with
   *  a colon and a decimal port number.  To specify a port with an IPv6
   *  address, enclose the IPv6 address in square brackets before appending
   *  the colon and decimal port number.
   */
  public
  SyslogWriter(final String syslogHost) {
  }


  public
  void write(char[] buf, int off, int len) throws IOException {
  }
  
  public
  void write(final String string) throws IOException {
  }

  public
  void flush() {}

  public void close() {
  }
}
