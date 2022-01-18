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
import org.apache.log4j.spi.TriggeringEventEvaluator;
import org.apache.log4j.xml.UnrecognizedElementHandler;
import org.w3c.dom.Element;

import java.util.Properties;

public class SMTPAppender extends AppenderSkeleton implements UnrecognizedElementHandler {

  public SMTPAppender() { }

  public SMTPAppender(TriggeringEventEvaluator evaluator) { }

  public void activateOptions() { }
  
  public void append(LoggingEvent event) { }

  protected boolean checkEntryConditions() { return true; }

  public void close() { }

  public String getTo() {
    return "";
  }

  public boolean requiresLayout() {
    return true;
  }

  protected void sendBuffer() { }

  public String getEvaluatorClass() {
    return "";
  }

  public String getFrom() {
    return "";
  }

  public String getSubject() { return ""; }

  public void setFrom(String from) { }

  public void setSubject(String subject) { }

  public void setBufferSize(int bufferSize) { }

  public void setSMTPHost(String smtpHost) { }

  public String getSMTPHost() {
    return "";
  }

  public void setTo(String to) { }

  public int getBufferSize() { return 0; }

  public void setEvaluatorClass(String value) { }

  public void setLocationInfo(boolean locationInfo) { }

  public boolean getLocationInfo() { return false; }
  
  public void setCc(final String addresses) { }

  public String getCc() { return ""; }

  public void setBcc(final String addresses) { }

  public String getBcc() {
     return "";
    }
    
  public void setSMTPPassword(final String password) { }
 
  public void setSMTPUsername(final String username) { }

  public void setSMTPDebug(final boolean debug) { }
  
  public String getSMTPPassword() { return ""; }

  public String getSMTPUsername() {
    return "";
  }

  public boolean getSMTPDebug() {
    return false;
  }

  public final void setEvaluator(final TriggeringEventEvaluator trigger) { }

  public final TriggeringEventEvaluator getEvaluator() {
      return null;
  }

  public boolean parseUnrecognizedElement(final Element element, final Properties props) throws Exception { 
    return false;
  }
}