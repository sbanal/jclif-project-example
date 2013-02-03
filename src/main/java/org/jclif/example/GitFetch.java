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
import org.jclif.annotation.Option;
import org.jclif.annotation.Parameter;
import org.jclif.type.ParameterType;

/**
 * Emulate fit getch options
 *
 */
@Command(identifier="fetch", description="")
public class GitFetch 
{
	@Option(identifier="v", longIdentifier="verbose", description="be more verbose")
	private Boolean verbose;
	
	@Option(identifier="q", longIdentifier="quite", description="be more quite")
	private Boolean quite;
	
	@Option(identifier="t", longIdentifier="Tags", description="fetch all tags and associated objects")
	private Boolean tags;
	
	@Parameter(identifier="group", type=ParameterType.STRING, required=true)
	private String group;
	
	@Parameter(identifier="repository", type=ParameterType.STRING)
	private String repository;
	
	@Handler
	public void execute() {
		System.out.println(String.format("git pull called [verbose=%s,quite=%s,tags=%s,repo=%s,group=%s]",
				verbose, quite, tags, repository, group));
	}

	public void setVerbose(Boolean b) {
		this.verbose = b;
	}
    
	public void setQuite(Boolean quite) {
		this.quite = quite;
	}

	public void setTags(Boolean tags) {
		this.tags = tags;
	}
	
	public void setRepository(String repository) {
		this.repository = repository;
	}
	
	public void setGroup(String group) {
		this.group =  group;
	}	
	
}
