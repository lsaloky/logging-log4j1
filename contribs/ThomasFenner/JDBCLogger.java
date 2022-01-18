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

public class JDBCLogger
{
	public void append(String _msg) throws Exception { }

	public void appendSQL(String _msg) throws Exception { }

	public void configureTable(String _table) throws Exception { }

	public void setConnection(Connection _con) throws Exception	{ }

	public void setLogType(String _name, int _logtype, Object _value) throws Exception { }

	public boolean ready() { return true; }

	public boolean isConfigured(){ return true;}

	public boolean isConnected() { return true; }

    public String getErrorMsg() { return ""; }
}
