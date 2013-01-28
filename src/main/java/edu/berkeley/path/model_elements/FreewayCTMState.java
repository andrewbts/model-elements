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
import java.util.Map.Entry;

public class FreewayCTMState extends edu.berkeley.path.model_elements_base.FreewayCTMState {
	
	public FreewayCTMState() {}
	
	@SuppressWarnings("unchecked")
	public FreewayCTMState(
			Map<CharSequence, FreewayLinkState> linkStateMap, 
			Map<CharSequence, Double> originStateMap, 
			Map<CharSequence, FreewayLinkFlowState> linkFlowStateMap) {
		super(
				(Map<CharSequence, edu.berkeley.path.model_elements_base.FreewayLinkState>)(Map<?, ?>) linkStateMap, 
				originStateMap,
				(Map<CharSequence, edu.berkeley.path.model_elements_base.FreewayLinkFlowState>)(Map<?, ?>) linkFlowStateMap
				);
	}

	/**
	 * Create and return a map from links to link states. The map is created from the
	 * internal map from string link ids to link states.
	 * @param network Network to which this state pertains
	 * @return Map from links to link states
	 */
	public Map<Link, FreewayLinkState> createLinkStateMap(Network network) {
		Map<CharSequence, edu.berkeley.path.model_elements_base.FreewayLinkState> charMap = super.getLinkState();
		Map<Link, FreewayLinkState> map = new HashMap<Link, FreewayLinkState>(charMap.size());
		for (Entry<CharSequence, edu.berkeley.path.model_elements_base.FreewayLinkState> e : charMap.entrySet()) {
			map.put(network.getLinkById(e.getKey().toString()), (FreewayLinkState)e.getValue());
		}
		return map;
	}
	
	/**
	 * Create and return a map from links to link flow states. The map is created from the
	 * internal map from string link ids to link flow states (if it exists).
	 * @param network Network to which this state pertains
	 * @return Map from links to link flow states
	 */
	public Map<Link, FreewayLinkFlowState> createLinkFlowStateMap(Network network) {
		Map<CharSequence, edu.berkeley.path.model_elements_base.FreewayLinkFlowState> charMap = super.getLinkFlowState();
		if (charMap == null)
			return null;
		
		Map<Link, FreewayLinkFlowState> map = new HashMap<Link, FreewayLinkFlowState>(charMap.size());
		for (Entry<CharSequence, edu.berkeley.path.model_elements_base.FreewayLinkFlowState> e : charMap.entrySet()) {
			map.put(network.getLinkById(e.getKey().toString()), (FreewayLinkFlowState)e.getValue());		
		}
		
		return map;
	}
				
	@SuppressWarnings("unchecked")
	public Map<CharSequence, FreewayLinkFlowState> getLinkFlowStateMap() {
		return (Map<CharSequence, FreewayLinkFlowState>) (Map<?, ?>) super.getLinkFlowState();
	}

	@SuppressWarnings("unchecked")
	public void setLinkFlowStateMap(Map<CharSequence, FreewayLinkFlowState> map) {
		super.setLinkFlowState((Map<CharSequence, edu.berkeley.path.model_elements_base.FreewayLinkFlowState>) (Map<?, ?>)map);
	}

	/**
	 * Get current link state for a single specified link
	 * @param link Link whose state to get, shoudl not be an origin link
	 * @return Current link state
	 */
	public FreewayLinkState getCurrentLinkState(Link link) {
		if (link.isOrigin())
			throw new IllegalArgumentException("Specified link was an origin link not a normal link.");
		return (FreewayLinkState)super.getLinkState().get(link.getId());
	}
	
	/**
	 * Get current link flow state for a single specified link or origin link.
	 * @param link Link or origin link whose flow state to get
	 * @return Current link flow state
	 * @throws UnsupportedOperationException if this CTM state doesn't include flow data
	 */
	public FreewayLinkFlowState getCurrentLinkFlowState(Link link) {
		if (!includesFlowMap()) throw new UnsupportedOperationException("CTM state does not include link flow data.");
		return (FreewayLinkFlowState)super.getLinkFlowState().get(link.getId());
	}
	
	/**
	 * Get current queue length for a single specified origin link
	 * @param link Link to get queue length, should be an origin link
	 * @return Current queue length in units of vehicles
	 */
	public double getOriginLinkQueueLength(Link link) {
		if (!link.isOrigin())
			throw new IllegalArgumentException("Specified link was not an origin link.");
		return super.getQueueLength().get(link.getId()).doubleValue();		
	}	
	
  /**
   * Gets the linkState map.
   **/
  @SuppressWarnings("unchecked")
  public Map<CharSequence,FreewayLinkState> getLinkStateMap() {
    return (Map<CharSequence,FreewayLinkState>)(Map<?,?>)getLinkState();
  }
  
  /**
   * Sets the linkState map.
   **/
  @SuppressWarnings("unchecked")
  public void setLinkStateMap(Map<CharSequence,FreewayLinkState> map) {
		setLinkState((Map<CharSequence,edu.berkeley.path.model_elements_base.FreewayLinkState>)(Map<?,?>)map);
  }


	/**
	 * Gets the queueLength map.
	 **/
	public Map<CharSequence,Double> getQueueLengthMap() {
	  return queueLength;
	}

	/**
	 * @return Whether this CTM state includes a flow map
	 */
	public boolean includesFlowMap() {
		return super.getLinkFlowState() != null;
	}
	
}
