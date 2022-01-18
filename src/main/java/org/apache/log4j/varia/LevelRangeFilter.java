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

package org.apache.log4j.varia;

import org.apache.log4j.Level;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;

/**
   This is a very simple filter based on level matching, which can be
   used to reject messages with priorities outside a certain range.
   
   <p>The filter admits three options <b>LevelMin</b>, <b>LevelMax</b>
   and <b>AcceptOnMatch</b>.

   <p>If the level of the {@link LoggingEvent} is not between Min and Max
   (inclusive), then {@link Filter#DENY} is returned.
   
   <p> If the Logging event level is within the specified range, then if
   <b>AcceptOnMatch</b> is true, {@link Filter#ACCEPT} is returned, and if
   <b>AcceptOnMatch</b> is false, {@link Filter#NEUTRAL} is returned.
   
   <p>If <code>LevelMin</code>w is not defined, then there is no
   minimum acceptable level (ie a level is never rejected for
   being too "low"/unimportant).  If <code>LevelMax</code> is not
   defined, then there is no maximum acceptable level (ie a
   level is never rejected for beeing too "high"/important).

   <p>Refer to the {@link
   org.apache.log4j.AppenderSkeleton#setThreshold setThreshold} method
   available to <code>all</code> appenders extending {@link
   org.apache.log4j.AppenderSkeleton} for a more convenient way to
   filter out events by level.

   @author Simon Kitching
   @author based on code by Ceki G&uuml;lc&uuml; 
*/
public class LevelRangeFilter extends Filter {

  /**
     Do we return ACCEPT when a match occurs. Default is
     <code>false</code>, so that later filters get run by default  */
  boolean acceptOnMatch = false;

  Level levelMin;
  Level levelMax;

 
  /**
     Return the decision of this filter.
   */
  public
  int decide(LoggingEvent event) { return 0; }

 /**
     Get the value of the <code>LevelMax</code> option.  */
  public
  Level getLevelMax() { return null; }


  /**
     Get the value of the <code>LevelMin</code> option.  */
  public
  Level getLevelMin() {
    return null;
  }

  /**
     Get the value of the <code>AcceptOnMatch</code> option.
   */
  public
  boolean getAcceptOnMatch() {
    return false;
  }

  /**
     Set the <code>LevelMax</code> option.
   */
  public
  void setLevelMax(Level levelMax) { }

  /**
     Set the <code>LevelMin</code> option.
   */
  public
  void setLevelMin(Level levelMin) { }

  /**
     Set the <code>AcceptOnMatch</code> option.
   */  
  public 
  void setAcceptOnMatch(boolean acceptOnMatch) { }
}

