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

//import java.lang.reflect.Constructor;
import java.util.Iterator;
import javax.management.DynamicMBean;
import javax.management.AttributeList;
import javax.management.Attribute;
import javax.management.RuntimeOperationsException;
import javax.management.MBeanRegistration;
import javax.management.MBeanServer;
import javax.management.ObjectName;

import org.apache.log4j.Logger;

public abstract class AbstractDynamicMBean implements DynamicMBean,
                                                      MBeanRegistration {

  String dClassName;
  MBeanServer server;

  /**
   * Enables the to get the values of several attributes of the Dynamic MBean.
   */
  public
  AttributeList getAttributes(String[] attributeNames) {
    return(null);
  }

  /**
   * Sets the values of several attributes of the Dynamic MBean, and returns the
   * list of attributes that have been set.
   */
  public AttributeList setAttributes(AttributeList attributes) {
    return null;
  }

  protected
  abstract
  Logger getLogger();

  public
  void postDeregister() {
  }

  public
  void postRegister(java.lang.Boolean registrationDone) {
  }

  public
  void preDeregister() {
  }

  public
  ObjectName preRegister(MBeanServer server, ObjectName name) {
    return null;
  }
}
