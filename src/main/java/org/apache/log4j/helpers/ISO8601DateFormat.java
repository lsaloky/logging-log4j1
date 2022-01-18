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

package org.apache.log4j.helpers;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.Date;
import java.text.FieldPosition;
import java.text.ParsePosition;

// Contributors: Arndt Schoenewald <arndt@ibm23093i821.mc.schoenewald.de>

/**
   Formats a {@link Date} in the format "yyyy-MM-dd HH:mm:ss,SSS" for example
   "1999-11-27 15:49:37,459".

   <p>Refer to the <a
   href=http://www.cl.cam.ac.uk/~mgk25/iso-time.html>summary of the
   International Standard Date and Time Notation</a> for more
   information on this format.

   @author Ceki G&uuml;lc&uuml;
   @author Andrew Vajoczki

   @since 0.7.5
*/
public class ISO8601DateFormat extends AbsoluteTimeDateFormat {
  private static final long serialVersionUID = -759840745298755296L;

  public
  ISO8601DateFormat() {
  }

  public
  ISO8601DateFormat(TimeZone timeZone) {
    super(timeZone);
  }

  /**
     Appends a date in the format "YYYY-mm-dd HH:mm:ss,SSS"
     to <code>sbuf</code>. For example: "1999-11-27 15:49:37,459".

     @param sbuf the <code>StringBuffer</code> to write to
  */
  public
  StringBuffer format(Date date, StringBuffer sbuf,
		      FieldPosition fieldPosition) {

    return null;
  }

  /**
    This method does not do anything but return <code>null</code>.
   */
  public
  Date parse(java.lang.String s, ParsePosition pos) {
    return null;
  }
}

