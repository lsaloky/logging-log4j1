/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache license, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the license for the specific language governing permissions and
 * limitations under the license.
 */
package org.apache.logging.log4j.core.net;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.AbstractServer;
import org.apache.logging.log4j.core.LogEvent;

import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.naming.Context;
import javax.naming.NameNotFoundException;
import javax.naming.NamingException;

/**
 *
 */
public abstract class AbstractJMSReceiver extends AbstractServer implements javax.jms.MessageListener {


    protected Logger logger = LogManager.getLogger(this.getClass().getName());

    public void onMessage(javax.jms.Message message) {

        try {
            if (message instanceof ObjectMessage) {
                ObjectMessage objectMessage = (ObjectMessage) message;
                log((LogEvent) objectMessage.getObject());
            } else {
                logger.warn("Received message is of type " + message.getJMSType()
                    + ", was expecting ObjectMessage.");
            }
        } catch (JMSException jmse) {
            logger.error("Exception thrown while processing incoming message.",
                jmse);
        }
    }


    protected Object lookup(Context ctx, String name) throws NamingException {
        try {
            return ctx.lookup(name);
        } catch (NameNotFoundException e) {
            logger.error("Could not find name [" + name + "].");
            throw e;
        }
    }

}