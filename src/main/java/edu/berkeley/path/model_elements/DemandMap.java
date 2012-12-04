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

public class DemandMap extends edu.berkeley.path.model_elements_base.DemandMap {
	
	public double getTotalDemand(Link originLink) {
		Map<CharSequence, Double> vehicleTypeDemands = getFlow().get(originLink.getId());
		double total = 0d;
		for (Double demand : vehicleTypeDemands.values())
			total += demand;
		return total;
	}
	
  /**
   * Set the flow map. Same as setFlow(), but works with String keys.
   */
  @SuppressWarnings("unchecked")
  public void setFlowMap(Map<String,Map<String,Double>> value) {
    setFlow((Map<java.lang.CharSequence,Map<java.lang.CharSequence,Double>>)(Map<?,?>)value);
  }

  /**
   * Get the flow map. Same as getFlow(), but works with String keys.
   * Never returns null (creates the map if it doesn't exist).
   */
  @SuppressWarnings("unchecked")
  public Map<String,Map<String,Double>> getFlowMap() {
    if (null == getFlow()) {
      setFlow(new HashMap<java.lang.CharSequence,Map<java.lang.CharSequence,Double>>());
    }
    return (Map<String,Map<String,Double>>)(Map<?,?>)getFlow();
  }
}
