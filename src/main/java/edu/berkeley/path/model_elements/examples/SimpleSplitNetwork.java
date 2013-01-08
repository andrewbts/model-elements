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

import edu.berkeley.path.model_elements.*;

/**
 * A simple network with one non-trivial junction: a one-in two-out split.
 * An identical network is replicated in the reference Mathematica implementation,
 * so that the two implementations can be tested against each other.
 * @author amoylan
 */
public class SimpleSplitNetwork {
	
	private static Network network;
	private static FDMap fdMap;
	private static DemandMap demandMap;
	private static SplitRatioMap splitRatioMap;
	private static FreewayContextConfig config;
	
	private static boolean initialized = false;
	

	/**
	 * Construct all components of network 
	 */
	private static void initialize() {
		
		network = null;
		fdMap = null;
		demandMap = null;
		splitRatioMap = null;
		config = null;
		
		// TODO
		
		initialized = true;
		
	}

	public static Network getNetwork() {
		if (!initialized) initialize();
		return network;
	}	
	
	public static FDMap getFDMap() {
		if (!initialized) initialize();
		return fdMap;
	}
	
	public static DemandMap getDemandMap() {
		if (!initialized) initialize();
		return demandMap;
	}
	
	public static SplitRatioMap getSplitRatioMap() {
		if (!initialized) initialize();
		return splitRatioMap;
	}
	
	public static FreewayContextConfig getFreewayContextConfig() {
		if (!initialized) initialize();
		return config;
	}
		
}
