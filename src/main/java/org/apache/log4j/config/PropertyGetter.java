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

package org.apache.log4j.config;

import java.beans.*;
import java.lang.reflect.*;
import org.apache.log4j.Priority;
import org.apache.log4j.helpers.LogLog;


/**
   Used for inferring configuration information for a log4j's component.

   @author  Anders Kristensen
 */
public class PropertyGetter {
  protected static final Object[] NULL_ARG = new Object[] {};
  protected Object obj;
  protected PropertyDescriptor[] props;

  public interface PropertyCallback {
    void foundProperty(Object obj, String prefix, String name, Object value);
  }

  /**
    Create a new PropertyGetter for the specified Object. This is done
    in prepartion for invoking {@link
    #getProperties(PropertyGetter.PropertyCallback, String)} one or
    more times.

    @param obj the object for which to set properties */
  public
  PropertyGetter(Object obj) throws IntrospectionException {
  }

  public
  static
  void getProperties(Object obj, PropertyCallback callback, String prefix) {
  }

  public
  void getProperties(PropertyCallback callback, String prefix) {
  }

  protected
  boolean isHandledType(Class type) {
    return false;
  }
}
