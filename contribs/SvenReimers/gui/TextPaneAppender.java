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

package org.apache.log4j.gui;


import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.*;
import java.net.URL;
import java.util.Enumeration;
import java.util.StringTokenizer;
import java.util.Hashtable;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.text.TabSet;
import javax.swing.text.TabStop;

import org.apache.log4j.*;

import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.helpers.Loader;
import org.apache.log4j.helpers.QuietWriter;
import org.apache.log4j.helpers.TracerPrintWriter;
import org.apache.log4j.helpers.OptionConverter;


public class TextPaneAppender extends AppenderSkeleton {
    
  public static Image loadIcon ( String path ) { return null; }
  
  public TextPaneAppender(Layout layout, String name) { }
    
  public TextPaneAppender() { }

  public void close() { }
  
  private void createAttributes() { }

  private void createIcons() { }

  public void append(LoggingEvent event) { }
  
  public JTextPane getTextPane() {
    return null;
  }
  
  private static Color parseColor (String v) { return null; }
  
  private static String colorToString(Color c) { return ""; }

  public void setLayout(Layout layout) { }
  
  public void setName(String name) { }
    
  public void setTextPane(JTextPane textpane) { }
          
  private void setColor(Priority p, String v) { }
  
  private String getColor(Priority p) { return ""; }
  
  public void setLabel(String label) { }
  
  public String getLabel() { return ""; }
  
  public void setColorEmerg(String color) { }
  
  public String getColorEmerg() { return ""; }
  
  public void setColorError(String color) { }
  
  public String getColorError() {
    return "";
  }
  
  public void setColorWarn(String color) { }
  
  public String getColorWarn() { return ""; }
  
  public void setColorInfo(String color) { }
  
  public String getColorInfo() {
    return "";
  }
  
  public void setColorDebug(String color) { }
  
  public String getColorDebug() { return ""; }
  
  public void setColorBackground(String color) { }
  
  public String getColorBackground() { return ""; }
  
  public void setFancy(boolean fancy) { }
  
  public boolean getFancy() {
    return false;
  }
  
  public void setFontSize(int size) { }
  
  public int getFontSize() { return 0; }
  
  public void setFontName(String name) { }
  
  public String getFontName() { return ""; }

  public boolean requiresLayout() {
    return true;
  }
}



