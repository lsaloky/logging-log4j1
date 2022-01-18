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

public class NewVsSetLen {

  static String s;

  static int BIGBUF_LEN = 1048576;
  static int SBUF_LEN = 256;
  static int RUN_LENGTH = BIGBUF_LEN/4;

  static char[] sbuf = new char[SBUF_LEN];
  static char[] bigbuf = new char[BIGBUF_LEN];

  static
  public 
  void main(String[] args) {    
 
  }

  static
  double newBuffer(int size, int second) {    
    return 0;    
  }

  static
  double setLen(int size, int second) {
    return 0;    
  }  
}
