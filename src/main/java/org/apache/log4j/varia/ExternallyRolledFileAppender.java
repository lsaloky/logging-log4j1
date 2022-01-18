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

package org.apache.log4j.varia;

import org.apache.log4j.RollingFileAppender;
import org.apache.log4j.helpers.LogLog;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
   This appender listens on a socket on the port specified by the
   <b>Port</b> property for a "RollOver" message. When such a message
   is received, the underlying log file is rolled over and an
   acknowledgment message is sent back to the process initiating the
   roll over.

   <p>This method of triggering roll over has the advantage of being
   operating system independent, fast and reliable.

   <p>A simple application {@link Roller} is provided to initiate the
   roll over.

   <p>Note that the initiator is not authenticated. Anyone can trigger
   a rollover. In production environments, it is recommended that you
   add some form of protection to prevent undesired rollovers.


   @author Ceki G&uuml;lc&uuml;
   @since version 0.9.0 */
public class ExternallyRolledFileAppender extends RollingFileAppender {

  /**
     The string constant sent to initiate a roll over.   Current value of
     this string constant is <b>RollOver</b>.
  */
  static final public String ROLL_OVER = "RollOver";

  /**
     The string constant sent to acknowledge a roll over.   Current value of
      this string constant is <b>OK</b>.
  */
  static final public String OK = "OK";

  int port = 0;

  /**
     The default constructor does nothing but calls its super-class
     constructor.  */
  public
  ExternallyRolledFileAppender() {
  }

  /**
     The <b>Port</b> [roperty is used for setting the port for
     listening to external roll over messages.
  */
  public
  void setPort(int port) { }

  /**
     Returns value of the <b>Port</b> option.
   */
  public
  int getPort() {
    return 0;
  }

  /**
     Start listening on the port specified by a preceding call to
     {@link #setPort}.  */
  public
  void activateOptions() { }
}
