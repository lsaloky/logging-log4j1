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

import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.helpers.OptionConverter;
import org.apache.log4j.helpers.AbsoluteTimeDateFormat;
import org.apache.log4j.Layout;
import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.spi.LocationInfo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// Contributors:   Nelson Minar <(nelson@monkey.org>
//                 Igor E. Poteryaev <jah@mail.ru>
//                 Reinhard Deschler <reinhard.deschler@web.de>

/**
   Most of the work of the {@link org.apache.log4j.PatternLayout} class
   is delegated to the PatternParser class.

   <p>It is this class that parses conversion patterns and creates
   a chained list of {@link OptionConverter OptionConverters}.

   @author <a href=mailto:"cakalijp@Maritz.com">James P. Cakalic</a>
   @author Ceki G&uuml;lc&uuml;
   @author Anders Kristensen

   @since 0.8.2
*/
public class PatternParser {

  static final int FULL_LOCATION_CONVERTER = 1000;
  static final int METHOD_LOCATION_CONVERTER = 1001;
  static final int CLASS_LOCATION_CONVERTER = 1002;
  static final int LINE_LOCATION_CONVERTER = 1003;
  static final int FILE_LOCATION_CONVERTER = 1004;

  static final int RELATIVE_TIME_CONVERTER = 2000;
  static final int THREAD_CONVERTER = 2001;
  static final int LEVEL_CONVERTER = 2002;
  static final int NDC_CONVERTER = 2003;
  static final int MESSAGE_CONVERTER = 2004;

  int state;
  protected StringBuffer currentLiteral = new StringBuffer(32);
  protected int patternLength;
  protected int i;
  PatternConverter head;
  PatternConverter tail;
  protected FormattingInfo formattingInfo = new FormattingInfo();
  protected String pattern;

  public
  PatternParser(String pattern) {
  }

  private
  void  addToList(PatternConverter pc) {
  }

  protected
  String extractOption() {
    return null;
  }


  /**
     The option is expected to be in decimal and positive. In case of
     error, zero is returned.  */
  protected
  int extractPrecisionOption() {
    return 0;
  }

  public
  PatternConverter parse() {
    return null;
  }

  protected
  void finalizeConverter(char c) {
  }

  protected
  void addConverter(PatternConverter pc) {
  }
}

