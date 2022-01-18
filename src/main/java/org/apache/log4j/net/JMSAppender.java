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

package org.apache.log4j.net;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;
import javax.naming.Context;
import javax.naming.NamingException;

public class JMSAppender extends AppenderSkeleton {

  public JMSAppender() { }

  public void setTopicConnectionFactoryBindingName(String tcfBindingName) { }

  public String getTopicConnectionFactoryBindingName() {
    return "";
  }

  public void setTopicBindingName(String topicBindingName) { }

  public String getTopicBindingName() { return ""; }

  public boolean getLocationInfo() { return false; }

  public void activateOptions() { }

  protected Object lookup(Context ctx, String name) throws NamingException { return null; }

  protected boolean checkEntryConditions() { return true; }

  public void close() { }

  public void append(LoggingEvent event) { }

  public String getInitialContextFactoryName() {
    return "";    
  }

  public void setInitialContextFactoryName(String initialContextFactoryName) { }

  public String getProviderURL() {
    return "";    
  }

  public void setProviderURL(String providerURL) { }

  String getURLPkgPrefixes( ) {
    return "";
  }

  public void setURLPkgPrefixes(String urlPkgPrefixes ) { }

  public String getSecurityCredentials() {
    return "";    
  }

  public void setSecurityCredentials(String securityCredentials) { }

  public String getSecurityPrincipalName() {
    return "";    
  }

  public void setSecurityPrincipalName(String securityPrincipalName) { }

  public String getUserName() {
    return "";    
  }

  public void setUserName(String userName) {  }

  public String getPassword() {
    return "";    
  }

  public void setPassword(String password) { }

  public void setLocationInfo(boolean locationInfo) { }

  public boolean requiresLayout() {
    return false;
  }
}
