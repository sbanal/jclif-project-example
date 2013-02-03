/** 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jclif.example;

import org.jclif.annotation.Command;
import org.jclif.annotation.Handler;
import org.jclif.annotation.Parameter;

/**
 * Emulate fit git commit options
 *
 */
@Command(identifier="commit", description="")
public class GitCommit 
{
	@Parameter(identifier="v", longIdentifier="verbose")
	public Boolean verbose;
	
	@Parameter(identifier="a", longIdentifier="append")
	public Boolean append;
	
	@Parameter(identifier="f", longIdentifier="force")
	public Boolean force;
	
	@Parameter(identifier="m", longIdentifier="multiple")
	public Boolean multiple;
	
	@Handler
	public void execute() {
		System.out.println(String.format("git commit called [verbose=%s,append=%s,foce=%s,multiple=%s]",
				verbose, append, force, multiple));
	}
    
}
