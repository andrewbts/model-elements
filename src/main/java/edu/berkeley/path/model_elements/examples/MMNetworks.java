/**
 * Copyright (c) 2012 The Regents of the University of California.
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 */

package edu.berkeley.path.model_elements.examples;

import java.io.IOException;

import edu.berkeley.path.model_elements.*;

/**
 * Utilities to import converted Mobile Millenium networks from .json format
 * @author amoylan
 */
public class MMNetworks {
	
	private static String examplesDirectory = "examples/mm-networks";

	private static String getNidDirectory(int nid) {
		return examplesDirectory + Integer.toString(nid);
	}
	
	public static Network getNetwork(int nid) throws IOException {
		return JsonHandler.readNetworkFromDirectory(getNidDirectory(nid));
	}
	
	public static FDMap getFDMap(int nid) throws IOException {
		return JsonHandler.readFDMapFromDirectory(getNidDirectory(nid));
	}
	
	public static DemandMap getDemandMap(int nid) throws IOException {
		return JsonHandler.readDemandMapFromDirectory(getNidDirectory(nid));
	}
	
	public static SplitRatioMap getSplitRatioMap(int nid) throws IOException {
		return JsonHandler.readSplitRatioMapFromDirectory(getNidDirectory(nid));
	}
	
	public static FreewayContextConfig getFreewayContextConfig(int nid) throws IOException {
		return JsonHandler.readFreewayContextConfigFromDirectory(getNidDirectory(nid));
	}
	
}
