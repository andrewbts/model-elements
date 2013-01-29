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

package edu.berkeley.path.model_elements;

public class FreewayCTMReport extends edu.berkeley.path.model_elements_base.FreewayCTMReport {

	/**
	 * Check whether in/out flow information is present for each link. Note
	 * that this simply checks whether the map from links to flow information
	 * exists, and does not check whether it includes a non-null entry for
	 * every link.
	 * @return Whether this report includes in/out flow information
	 */
	public boolean includesFlows() {
		return (getMean().includesFlowMap());
	}

	@Override
	public FreewayCTMState getMean() {
		return (FreewayCTMState)super.getMean();
	}
	
	@Override
	public FreewayCTMState getStdDev() {
		return (FreewayCTMState)super.getStdDev();
	}
	
	 public Long getNetworkLongId() {
		return Long.parseLong(getNetworkId().toString());
	 }
		  
	 public void setNetworkId(Long id) {
	    setNetworkId(id.toString());
	 }

	 /**
	  * Gets the value of the 'time' field.
	  */
	 public org.joda.time.DateTime getJodaTime() {
	    return ((DateTime)getTime()).toJoda();
	 }

	 /**
	  * Sets the value of the 'time' field.
	  * @param value the value to set.
	  */
	 public void setJodaTime(org.joda.time.DateTime value) {
	    setTime(DateTime.fromJoda(value));
	 }
	
}
