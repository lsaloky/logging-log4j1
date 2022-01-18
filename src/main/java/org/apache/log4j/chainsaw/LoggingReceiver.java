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

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggingEvent;

/**
 * A daemon thread the processes connections from a
 * <code>org.apache.log4j.net.SocketAppender.html</code>.
 *
 * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a>
 */
class LoggingReceiver extends Thread {
    
    /**
     * Creates a new <code>LoggingReceiver</code> instance.
     *
     * @param aModel model to place put received into
     * @param aPort port to listen on
     * @throws IOException if an error occurs
     */
    LoggingReceiver(MyTableModel aModel, int aPort) throws IOException {
    }

    /** Listens for client connections **/
    public void run() {
    }
}
