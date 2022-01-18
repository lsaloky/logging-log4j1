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


import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Vector;

import org.apache.log4j.spi.LoggerFactory;
import org.apache.log4j.spi.HierarchyEventListener;
import org.apache.log4j.spi.LoggerRepository;
import org.apache.log4j.spi.RendererSupport;
import org.apache.log4j.Appender;
import org.apache.log4j.or.RendererMap;
import org.apache.log4j.or.ObjectRenderer;
import org.apache.log4j.helpers.LogLog;

/**
   This class is specialized in retrieving loggers by name and also
   maintaining the logger hierarchy.

   <p><em>The casual user does not have to deal with this class
   directly.</em>

   <p>The structure of the logger hierarchy is maintained by the
   {@link #getLogger} method. The hierarchy is such that children link
   to their parent but parents do not have any pointers to their
   children. Moreover, loggers can be instantiated in any order, in
   particular descendant before ancestor.

   <p>In case a descendant is created before a particular ancestor,
   then it creates a provision node for the ancestor and adds itself
   to the provision node. Other descendants of the same ancestor add
   themselves to the previously created provision node.

   @author Ceki G&uuml;lc&uuml;

*/
public class Hierarchy implements LoggerRepository, RendererSupport {

  private LoggerFactory defaultFactory;
  private Vector listeners;

  Hashtable ht;
  Logger root;
  RendererMap rendererMap;

  int thresholdInt;
  Level threshold;

  boolean emittedNoAppenderWarning = false;
  boolean emittedNoResourceBundleWarning = false;

  /**
     Create a new logger hierarchy.

     @param root The root of the new hierarchy.

   */
  public
  Hierarchy(Logger root) {
    ht = new Hashtable();
    listeners = new Vector(1);
    this.root = root;
    // Enable all level levels by default.
    setThreshold(Level.ALL);
    this.root.setHierarchy(this);
    rendererMap = new RendererMap();
    defaultFactory = new DefaultCategoryFactory();
  }

  /**
     Add an object renderer for a specific class.
   */
  public
  void addRenderer(Class classToRender, ObjectRenderer or) {
    rendererMap.put(classToRender, or);
  }

  public
  void addHierarchyEventListener(HierarchyEventListener listener) {
    if(listeners.contains(listener)) {
      LogLog.warn("Ignoring attempt to add an existent listener.");
    } else {
      listeners.addElement(listener);
    }
  }

  /**
     This call will clear all logger definitions from the internal
     hashtable. Invoking this method will irrevocably mess up the
     logger hierarchy.

     <p>You should <em>really</em> know what you are doing before
     invoking this method.

     @since 0.9.0 */
  public
  void clear() {
    //System.out.println("\n\nAbout to clear internal hash table.");
    ht.clear();
  }

  public
  void emitNoAppenderWarning(Category cat) {
    // No appenders in hierarchy, warn user only once.
    if(!this.emittedNoAppenderWarning) {
      LogLog.warn("No appenders could be found for logger (" +
		   cat.getName() + ").");
      LogLog.warn("Please initialize the log4j system properly.");
      this.emittedNoAppenderWarning = true;
    }
  }

  /**
     Check if the named logger exists in the hierarchy. If so return
     its reference, otherwise returns <code>null</code>.

     @param name The name of the logger to search for.

  */
  public
  Logger exists(String name) {
    Object o = ht.get(new CategoryKey(name));
    if(o instanceof Logger) {
      return (Logger) o;
    } else {
      return null;
    }
  }

  /**
     The string form of {@link #setThreshold(Level)}.
  */
  public
  void setThreshold(String levelStr) {
    Level l = (Level) Level.toLevel(levelStr, null);
    if(l != null) {
      setThreshold(l);
    } else {
      LogLog.warn("Could not convert ["+levelStr+"] to Level.");
    }
  }


  /**
     Enable logging for logging requests with level <code>l</code> or
     higher. By default all levels are enabled.

     @param l The minimum level for which logging requests are sent to
     their appenders.  */
  public
  void setThreshold(Level l) {
    if(l != null) {
      thresholdInt = l.level;
      threshold = l;
    }
  }

  public
  void fireAddAppenderEvent(Category logger, Appender appender) {
    if(listeners != null) {
      int size = listeners.size();
      HierarchyEventListener listener;
      for(int i = 0; i < size; i++) {
	listener = (HierarchyEventListener) listeners.elementAt(i);
	listener.addAppenderEvent(logger, appender);
      }
    }
  }

  void fireRemoveAppenderEvent(Category logger, Appender appender) {
    if(listeners != null) {
      int size = listeners.size();
      HierarchyEventListener listener;
      for(int i = 0; i < size; i++) {
	listener = (HierarchyEventListener) listeners.elementAt(i);
	listener.removeAppenderEvent(logger, appender);
      }
    }
  }

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


