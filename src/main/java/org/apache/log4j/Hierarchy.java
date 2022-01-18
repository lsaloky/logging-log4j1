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

// WARNING This class MUST not have references to the Category or
// WARNING RootCategory classes in its static initiliazation neither
// WARNING directly nor indirectly.

// Contributors:
//                Luke Blanshard <luke@quiq.com>
//                Mario Schomburg - IBM Global Services/Germany
//                Anders Kristensen
//                Igor Poteryaev

package org.apache.log4j;


import java.util.Enumeration;

import org.apache.log4j.spi.LoggerFactory;
import org.apache.log4j.spi.HierarchyEventListener;
import org.apache.log4j.spi.LoggerRepository;
import org.apache.log4j.spi.RendererSupport;
import org.apache.log4j.or.RendererMap;
import org.apache.log4j.or.ObjectRenderer;

public class Hierarchy implements LoggerRepository, RendererSupport {

  public Hierarchy(Logger root) { }

  public void addRenderer(Class classToRender, ObjectRenderer or) { }

  public void addHierarchyEventListener(HierarchyEventListener listener) { }

  public void clear() { }

  public void emitNoAppenderWarning(Category cat) { }

  public Logger exists(String name) { return null; }

  public void setThreshold(String levelStr) { }

  public void setThreshold(Level l) { }

  public void fireAddAppenderEvent(Category logger, Appender appender) { }

  void fireRemoveAppenderEvent(Category logger, Appender appender) { }

  public Level getThreshold() {
    return null;
  }

  public Logger getLogger(String name) {
    return null;
  }

  public Logger getLogger(String name, LoggerFactory factory) { return null; }

  public Enumeration getCurrentLoggers() { return null; }

  public Enumeration getCurrentCategories() {
    return null;
  }
  
  public  RendererMap getRendererMap() { return null; }

  public Logger getRootLogger() {
    return null;
  }
  
  public boolean isDisabled(int level) {
    return false;
  }

  public void overrideAsNeeded(String override) { }

  public void resetConfiguration() { }

  public void setDisableOverride(String override) { }

  public void setRenderer(Class renderedClass, ObjectRenderer renderer) { }

  public void shutdown() { }

  final private void updateParents(Logger cat) { }

  final private void updateChildren(ProvisionNode pn, Logger logger) { }

}
