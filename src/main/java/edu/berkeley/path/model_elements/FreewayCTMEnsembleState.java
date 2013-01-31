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

import java.util.*;

public class FreewayCTMEnsembleState extends edu.berkeley.path.model_elements_base.FreewayCTMEnsembleState {
	
	public FreewayCTMEnsembleState() {};
	
	/**
	 * Create model_elements_base part of this from model_elements input.
	 * @param ensembleState List of CTM states
	 * @param quality TBD
	 */	
	public FreewayCTMEnsembleState(List<FreewayCTMState> ensembleState, DateTime t, Map<String, Double> quality) {
		
		super();
		
		@SuppressWarnings("unchecked")
		List<edu.berkeley.path.model_elements_base.FreewayCTMState> ensemble = 
			(List<edu.berkeley.path.model_elements_base.FreewayCTMState>)(List<?>)ensembleState;
		
		super.setEnsembleState(ensemble);		
		super.setT(t);
		super.setQuality(quality); // TODO: what is the meaning of this field?		
	}

	/**
	 * Create ensemble state of size n by replicating the specified initial state n times.
	 */
	public FreewayCTMEnsembleState(FreewayCTMState initialState, Integer n, DateTime timeBegin, Map<String, Double> quality) {
		this(new ArrayList<FreewayCTMState>(n), timeBegin, quality);
		List<FreewayCTMState> ensemble = getStates();
		for (int i = 0; i < n; ++i)
			ensemble.add(initialState);		
	}

	@SuppressWarnings("unchecked")
	public List<FreewayCTMState> getStates() {
		return (List<FreewayCTMState>)(List<?>)super.getEnsembleState();
	}
	
	@SuppressWarnings("unchecked")
	public void setStates(List<FreewayCTMState> value) {
		setEnsembleState((List<edu.berkeley.path.model_elements_base.FreewayCTMState>)(List<?>)value);
	}

	@Override
	public DateTime getT() {
		return (DateTime) super.getT();
	}
	
	/**
     * Gets the value of the 'time' field.
	 * Remove this method after we rename the field from 't' to 'time'.
	 */
	public DateTime getTime() {
	   return getT();
	}

	/**
	 * Sets the value of the 'time' field.
	 * Remove this method after we rename the field from 't' to 'time'.
	 * @param value the value to set.
	 */
	public void setTime(DateTime value) {
	   setT(value);
	}
		
}
