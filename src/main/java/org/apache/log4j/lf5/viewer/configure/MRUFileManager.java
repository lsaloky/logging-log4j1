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
package org.apache.log4j.lf5.viewer.configure;

import java.io.*;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;


/**
 * <p>MRUFileManager handles the storage and retrival the most
 * recently opened log files.
 *
 * @author Brad Marlborough
 * @author Richard Hurst
 */

// Contributed by ThoughtWorks Inc.

public class MRUFileManager {
  //--------------------------------------------------------------------------
  //   Constants:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Protected Variables:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Private Variables:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Constructors:
  //--------------------------------------------------------------------------
  public MRUFileManager() {
  }

  public MRUFileManager(int maxSize) {
  }
  //--------------------------------------------------------------------------
  //   Public Methods:
  //--------------------------------------------------------------------------

  /**
   * Saves a list of MRU files out to a file.
   */
  public void save() {
  }

  /**
   * Gets the size of the MRU file list.
   */
  public int size() {
    return 0;
  }

  /**
   * Returns a particular file name stored in a MRU file
   * list based on an index value.
   */
  public Object getFile(int index) {
    return null;
  }

  /**
   * Returns a input stream to the resource at the specified index
   */
  public InputStream getInputStream(int index) throws IOException,
      FileNotFoundException {
    return null;
  }

  /**
   * Adds a file name to the MRU file list.
   */
  public void set(File file) {
  }

  /**
   * Adds a url to the MRU file list.
   */
  public void set(URL url) {
  }

  /**
   * Gets the list of files stored in the MRU file list.
   */
  public String[] getMRUFileList() {
    return null;
  }

  /**
   * Moves the the index to the top of the MRU List
   *
   * @param index The index to be first in the mru list
   */
  public void moveToTop(int index) {
  }

  /**
   * Creates the directory where the MRU file list will be written.
   * The "lf5" directory is created in the Documents and Settings
   * directory on Windows 2000 machines and where ever the user.home
   * variable points on all other platforms.
   */
  public static void createConfigurationDirectory() {
  }
  //--------------------------------------------------------------------------
  //   Protected Methods:
  //--------------------------------------------------------------------------
  /**
   * Gets an input stream for the corresponding file.
   *
   * @param file The file to create the input stream from.
   * @return InputStream
   */
  protected InputStream getInputStream(File file) throws IOException,
      FileNotFoundException {
    return null;
  }

  /**
   * Gets an input stream for the corresponding URL.
   *
   * @param url The url to create the input stream from.
   * @return InputStream
   */
  protected InputStream getInputStream(URL url) throws IOException {
    return null;
  }

  /**
   * Adds an object to the mru.
   */
  protected void setMRU(Object o) {
  }

  /**
   * Loads the MRU file list in from a file and stores it in a LinkedList.
   * If no file exists, a new LinkedList is created.
   */
  protected void load() {
  }

  protected String getFilename() {
    return "";
  }

  /**
   * Ensures that the MRU list will have a MaxSize.
   */
  protected void setMaxSize(int maxSize) {
  }
  //--------------------------------------------------------------------------
  //   Private Methods:
  //--------------------------------------------------------------------------

  //--------------------------------------------------------------------------
  //   Nested Top-Level Classes or Interfaces
  //--------------------------------------------------------------------------
}