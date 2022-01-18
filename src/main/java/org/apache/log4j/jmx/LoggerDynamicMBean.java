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

import org.apache.log4j.Logger;
import org.apache.log4j.Appender;
import javax.management.MBeanInfo;
import javax.management.Attribute;

import javax.management.MBeanException;
import javax.management.AttributeNotFoundException;
import javax.management.ReflectionException;
import javax.management.InvalidAttributeValueException;
import javax.management.NotificationListener;
import javax.management.Notification;

public class LoggerDynamicMBean extends AbstractDynamicMBean
                                  implements NotificationListener {

  public LoggerDynamicMBean(Logger logger) {
  }

  public
  void handleNotification(Notification notification, Object handback) {
  }

  private
  void buildDynamicMBeanInfo() {
  }

  protected
  Logger getLogger() {
    return null;
  }


  public
  MBeanInfo getMBeanInfo() {
    return null;
  }

  public
  Object invoke(String operationName, Object params[], String signature[])
    throws MBeanException,
    ReflectionException {
    return null;
  }


  public
  Object getAttribute(String attributeName) throws AttributeNotFoundException,
                                                   MBeanException,
                                                   ReflectionException {

    return null;
  }


  void addAppender(String appenderClass, String appenderName) {
  }


  public
  void setAttribute(Attribute attribute) throws AttributeNotFoundException,
                                                InvalidAttributeValueException,
                                                MBeanException,
                                                ReflectionException {
  }

  void appenderMBeanRegistration() {
  }

  void registerAppenderMBean(Appender appender) {
  }

  public
  void postRegister(java.lang.Boolean registrationDone) {
  }
}
