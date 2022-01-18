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

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
   A simple application to send roll over messages to a potentially
   remote {@link ExternallyRolledFileAppender}. 

   <p>It takes two arguments, the <code>host_name</code> and
   <code>port_number</code> where the
   <code>ExternallyRolledFileAppender</code> is listening.
   

   @author Ceki G&uuml;lc&uuml;
   @since version 0.9.0 */
public class Roller {

  static Logger cat = Logger.getLogger(Roller.class);
  static String host;
  static int port;

  Roller() { }

  public static void main(String argv[]) { }

  static void usage(String msg) { }

  static void init(String hostArg, String portArg) { }

  static void roll() { }
  
}
