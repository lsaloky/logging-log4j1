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

package org.apache.log4j.jmx;

import org.apache.log4j.Appender;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.NOPLogger;
import org.apache.log4j.spi.NOPLoggerRepository;

import javax.management.Attribute;
import javax.management.AttributeNotFoundException;
import javax.management.InvalidAttributeValueException;
import javax.management.MBeanException;
import javax.management.MBeanInfo;
import javax.management.Notification;
import javax.management.NotificationListener;
import javax.management.ReflectionException;

public class LoggerDynamicMBean extends AbstractDynamicMBean implements NotificationListener {

  public LoggerDynamicMBean(Logger logger) { }

  public void handleNotification(Notification notification, Object handback) { }

  private void buildDynamicMBeanInfo() { }

  // dummy logger
  protected Logger getLogger() {
    return new NOPLogger(new NOPLoggerRepository(), "");
  }

  public MBeanInfo getMBeanInfo() {
    return new MBeanInfo( "", "", null, null, null, null);
  }

  public  Object invoke(String operationName, Object params[], String signature[]) throws MBeanException, ReflectionException {
    return null;
  }

  public Object getAttribute(String attributeName) throws AttributeNotFoundException, MBeanException, ReflectionException {
    return null;  
  }

  public void setAttribute(Attribute attribute) throws AttributeNotFoundException,
                                                InvalidAttributeValueException,
                                                MBeanException,
                                                ReflectionException {
  }

  void appenderMBeanRegistration() { }

  void registerAppenderMBean(Appender appender) { }

  public void postRegister(java.lang.Boolean registrationDone) { }
  
}
