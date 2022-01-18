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

/*
 * Copyright (C) The Apache Software Foundation. All rights reserved.
*/

package com.klopotek.utils.log;

import java.sql.*;
import java.util.*;
import org.apache.log4j.*;
import org.apache.log4j.helpers.*;
import org.apache.log4j.spi.*;

public class JDBCAppender extends AppenderSkeleton
{
	public void finalize() { }

	public String[] getOptionStrings() { return null; }

	public void setOption(String _option, String _value) { }

	public boolean requiresLayout()
	{
		return true;
	}

	public void close()	{ }

	public boolean setLogType(String _name, int _logtype, Object _value) { return true;	}

	public void append(LoggingEvent event) { }

    public void flush_buffer() { }

	public boolean ready() { return true; }

	protected void connect() throws Exception { }

	protected boolean configure() { }

}
