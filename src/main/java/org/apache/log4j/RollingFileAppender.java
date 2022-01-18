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
import org.apache.log4j.spi.LoggingEvent;

public class RollingFileAppender extends FileAppender {

  public RollingFileAppender() {
    super();
  }

  public RollingFileAppender(Layout layout, String filename, boolean append) throws IOException {
    super(layout, filename, append);
  }
  public RollingFileAppender(Layout layout, String filename) throws IOException {
    super(layout, filename);
  }
  public int getMaxBackupIndex() {
    return 0;
  }

  public long getMaximumFileSize() {
    return 0;
  }

  public void rollOver() { }

  public void setFile(String fileName, boolean append, boolean bufferedIO, int bufferSize) throws IOException { }

  public void setMaxBackupIndex(int maxBackups) { }

  public void setMaximumFileSize(long maxFileSize) { }

  public void setMaxFileSize(String value) { }

  protected void setQWForFiles(Writer writer) { }

  protected void subAppend(LoggingEvent event) { }
}
