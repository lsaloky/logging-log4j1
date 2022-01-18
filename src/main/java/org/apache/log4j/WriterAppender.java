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

package org.apache.log4j;

import java.io.IOException;
import java.io.Writer;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import org.apache.log4j.spi.ErrorHandler;
import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.helpers.QuietWriter;
import org.apache.log4j.helpers.LogLog;

public class WriterAppender extends AppenderSkeleton {

  public WriterAppender() { }

  public WriterAppender(Layout layout, OutputStream os) { }

  public WriterAppender(Layout layout, Writer writer) { }

  public void setImmediateFlush(boolean value) { }

  public boolean getImmediateFlush() { return false; }

  public void activateOptions() { }

  public void append(LoggingEvent event) { }

  protected boolean checkEntryConditions() { return true; }

  public void close() { }

  protected void closeWriter() { }

  protected OutputStreamWriter createWriter(OutputStream os) { return null; }

  public String getEncoding() { return ""; }

  public void setEncoding(String value) { }

  public void setErrorHandler(ErrorHandler eh) { }

  public synchronized void setWriter(Writer writer) { }

  protected void subAppend(LoggingEvent event) { }

  public boolean requiresLayout() { return true; }

  protected void reset() { }

  protected void writeFooter() { }

  protected void writeHeader() { }
  
}
