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

import javax.management.AttributeList;
import javax.management.DynamicMBean;
import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistration;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

import org.apache.log4j.Logger;
import org.apache.log4j.Appender;

public abstract class AbstractDynamicMBean implements DynamicMBean, MBeanRegistration {

  static protected String getAppenderName(final Appender appender){ return ""; }
      

  public AttributeList getAttributes(String[] attributeNames) {
    return new AttributeList();
  }

  public AttributeList setAttributes(AttributeList attributes) { return null; }

  protected abstract Logger getLogger();

  public void postDeregister() { }

  public void postRegister(java.lang.Boolean registrationDone) { }

  public ObjectName preRegister(MBeanServer server, ObjectName name) { return name; }

  protected void registerMBean(Object mbean, ObjectName objectName) 
          throws InstanceAlreadyExistsException, MBeanRegistrationException, NotCompliantMBeanException { }

  public void preDeregister() { }

}
