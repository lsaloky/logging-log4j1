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
package org.apache.log4j.spi;

import java.io.PrintWriter;
import java.util.Vector;

/**
  * VectorWriter is an obsolete class provided only for
  *  binary compatibility with earlier versions of log4j and should not be used.
  *
  * @deprecated
  */
class VectorWriter extends PrintWriter {

  VectorWriter() { super(new NullWriter()); }

  public void print(Object o) { }

  public void print(char[] chars) { }

  public void print(String s) { }

  public void println(Object o) { }

  public void println(char[] chars) { }

  public void println(String s) { }

  public void write(char[] chars) { }

  public void write(char[] chars, int off, int len) { }

  public void write(String s, int off, int len) { }

  public void write(String s) { }

  public String[] toStringArray() { return null; }

}

