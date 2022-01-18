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

public abstract class Filter implements OptionHandler {

  public Filter next;

  public static final int DENY    = -1;
  
  public static final int NEUTRAL = 0;

  public static final int ACCEPT  = 1;

  public void activateOptions() { }

  abstract public int decide(LoggingEvent event);

  public void setNext(Filter next) { }
 
  public Filter getNext() { return null; }

}
