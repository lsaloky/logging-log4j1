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

package org.apache.log4j.performance;

/**
   Measures the time required to make a System.currentTimeMillis() and
   Thread.currentThread().getName() calls.

   <p>On an 233Mhz NT machine (JDK 1.1.7B) the
   System.currentTimeMillis() call takes under half a microsecond to
   complete whereas the Thread.currentThread().getName() call takes
   about 4 micro-seconds.

*/
public class SystemTime {

  static int RUN_LENGTH = 1000000;

  static
  public 
  void main(String[] args) {    
  }

  static
  double systemCurrentTimeLoop() {
    return 0;    
  }

  static
  double currentThreadNameloop() {
    return 0;    
  }  
}
