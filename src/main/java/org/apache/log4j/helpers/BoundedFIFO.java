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

// Contributors:     Mathias Bogaert
//                   joelr@viair.com

package org.apache.log4j.helpers;

import org.apache.log4j.spi.LoggingEvent;

/**
   <code>BoundedFIFO</code> serves as the bounded first-in-first-out
   buffer heavily used by the {@link org.apache.log4j.AsyncAppender}.
   
   @author Ceki G&uuml;lc&uuml; 
   @since version 0.9.1 */
public class BoundedFIFO {
  
  LoggingEvent[] buf;
  int numElements = 0;
  int first = 0;
  int next = 0;
  int maxSize;

  /**
     Instantiate a new BoundedFIFO with a maximum size passed as argument.
   */
  public
  BoundedFIFO(int maxSize) {
  }
  
  /**
     Get the first element in the buffer. Returns <code>null</code> if
     there are no elements in the buffer.  */
  public
  LoggingEvent get() {
    return null;
  }

  /**
     Place a {@link LoggingEvent} in the buffer. If the buffer is full
     then the event is <b>silently dropped</b>. It is the caller's
     responsability to make sure that the buffer has free space.  */
  public 
  void put(LoggingEvent o) {
  }

  /**
     Get the maximum size of the buffer.
   */
  public 
  int getMaxSize() {
      return maxSize;
  }

  /**
     Return <code>true</code> if the buffer is full, that is, whether
     the number of elements in the buffer equals the buffer size. */
  public 
  boolean isFull() {
    return false;
  }

  /**
     Get the number of elements in the buffer. This number is
     guaranteed to be in the range 0 to <code>maxSize</code>
     (inclusive).
  */
  public
  int length() {
    return 0;
  } 


  int min(int a, int b) {
    return a < b ? a : b;
  }


  /**
     Resize the buffer to a new size. If the new size is smaller than
     the old size events might be lost.
     
     @since 1.1
   */
  synchronized
  public 
  void resize(int newSize) {
    return;
  }

  
  /**
     Returns <code>true</code> if there is just one element in the
     buffer. In other words, if there were no elements before the last
     {@link #put} operation completed.  */
  public
  boolean wasEmpty() {
    return false;
  }

  /**
      Returns <code>true</code> if the number of elements in the
      buffer plus 1 equals the maximum buffer size, returns
      <code>false</code> otherwise. */
  public
  boolean wasFull() {
    return false;
  }

}
