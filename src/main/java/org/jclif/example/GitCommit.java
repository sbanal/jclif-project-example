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

import java.io.File;

import org.jclif.annotation.Command;
import org.jclif.annotation.Handler;
import org.jclif.annotation.Option;
import org.jclif.annotation.Parameter;
import org.jclif.type.ParameterType;

/**
 * Emulate fit git commit options
 *
 */
@Command(identifier="commit", description="")
public class GitCommit 
{
	@Option(identifier="v", longIdentifier="verbose", description="how diff in commit message template")
	private Boolean verbose;
	
	@Option(identifier="q", longIdentifier="quite", description="suppress summary after successful commit")
	private Boolean quite;
	
	@Option(identifier="F", longIdentifier="file", type=ParameterType.FILE, description="read message from file")
	private File file;
	
	@Option(identifier="m", longIdentifier="message", type=ParameterType.STRING, description="commit message")
	private String message;
	
	@Parameter(identifier="filepattern", description="file pattern of files to commit")
	private String filePattern;
	
	@Handler
	public void execute() {
		System.out.println(String.format("git commit called [verbose=%s,quite=%s,file=%s,message=%s,filePattern=%s]",
				verbose, quite, file, message, filePattern));
	}
    
	public void setVerbose(Boolean b) {
		this.verbose = b;
	}
    
	public void setQuite(Boolean quite) {
		this.quite = quite;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void setFilePattern(String pattern) {
		this.filePattern =  pattern;
	}	
	
}
