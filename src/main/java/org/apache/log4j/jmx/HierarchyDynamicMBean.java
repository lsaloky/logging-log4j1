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


import org.apache.log4j.*;

import org.apache.log4j.spi.HierarchyEventListener;
import org.apache.log4j.spi.NOPLogger;
import org.apache.log4j.spi.NOPLoggerRepository;

import javax.management.MBeanNotificationInfo;

import javax.management.ObjectName;
import javax.management.MBeanInfo;
import javax.management.Attribute;

import javax.management.MBeanException;
import javax.management.AttributeNotFoundException;
import javax.management.ReflectionException;
import javax.management.InvalidAttributeValueException;
import javax.management.NotificationBroadcaster;
import javax.management.NotificationListener;
import javax.management.NotificationFilter;
import javax.management.ListenerNotFoundException;

public class HierarchyDynamicMBean extends AbstractDynamicMBean
                                   implements HierarchyEventListener,
                                              NotificationBroadcaster {

  static final String ADD_APPENDER = "addAppender.";
  static final String THRESHOLD = "threshold";

  public HierarchyDynamicMBean() {
  }

  private
  void buildDynamicMBeanInfo() {
  }


  public
  ObjectName addLoggerMBean(String name) {
    return null;
  }

  ObjectName addLoggerMBean(Logger logger) {
    return null;
  }

  public
  void addNotificationListener(NotificationListener listener,
			       NotificationFilter filter,
			       java.lang.Object handback) {
  }

  // dummy logger
  protected Logger getLogger() {
    return new NOPLogger(new NOPLoggerRepository(), "");
  }

  public
  MBeanInfo getMBeanInfo() {
    return null;
  }

  public
  MBeanNotificationInfo[] getNotificationInfo(){
    return null;
  }

  public
  Object invoke(String operationName,
		Object params[],
		String signature[]) throws MBeanException,
                                           ReflectionException {

    return null;
  }

  public
  Object getAttribute(String attributeName) throws AttributeNotFoundException,
                                                    MBeanException,
                                                    ReflectionException {
    return null;
  }


  public
  void addAppenderEvent(Category logger, Appender appender) {
  }

 public
  void removeAppenderEvent(Category cat, Appender appender) {
  }

  public
  void postRegister(java.lang.Boolean registrationDone) {
  }

  public
  void removeNotificationListener(NotificationListener listener)
                                         throws ListenerNotFoundException {
  }

  public
  void setAttribute(Attribute attribute) throws AttributeNotFoundException,
                                                InvalidAttributeValueException,
                                                MBeanException,
                                                ReflectionException {

  }
}
