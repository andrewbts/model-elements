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
import org.joda.time.Interval;
import java.util.Map.Entry;

public class DemandSet extends edu.berkeley.path.model_elements_base.DemandSet implements DemandMapProvider {
  
	@Override
	public DemandMap getDemandMap(Interval interval) {
		return slice(interval);
	}
	
	/**
   * Slice off an interval of time and return the matching items as a DemandMap.
   * If, for a given link and vtype, the time interval contains more than one demand,
   * ignore all but the last. (This method does not change the DemandSet.)
   * If the interval is disjoint from the profile interval, then use the
   * first item (if the interval is earlier) or the last item (if later).
   * If the interval does not exactly match the time coordinates of the data,
   * round to the nearest time point.
   **/
  public DemandMap slice(Interval interval) {
    DemandMap demandMap = new DemandMap();
    
    for (Entry<String, DemandProfile> entryForLink : getProfileMap().entrySet()) {
      String linkId = entryForLink.getKey();
      DemandProfile profile = entryForLink.getValue();
      Double dt = profile.getSampleRate(); // defaults?
      Double t0 = profile.getStartTime(); // defaults?
      List<Double> someTimeSeries = profile.getFlowMap().values().iterator().next();
      Integer nSamples = someTimeSeries.size();
        // assume all vtypes have same size time series!
      
      if (nSamples == 0) {
        demandMap.getFlowMap().put(linkId, null);
        continue;
      }
      
      Integer index = ProfileUtil.getIndex(interval, t0, dt, nSamples);
      
      for (Entry<String,List<Double>> entryForVtype: profile.getFlowMap().entrySet()) {
        String vtype = entryForVtype.getKey();
        List<Double> timeSeries = entryForVtype.getValue();
        
        Double flowAtTime = timeSeries.get(index);
        // if null?
        
        Double knob = profile.getKnob();
        if (knob != null) {
          flowAtTime *= knob; // Ok?
          // what about stddev add/mult?
        }
        
        Map<String, Double>demandMapAtLink = demandMap.getFlowMap().get(linkId);
        if (demandMapAtLink == null) {
          demandMapAtLink = new HashMap<String, Double>();
          demandMap.getFlowMap().put(linkId, demandMapAtLink);
        }
        demandMapAtLink.put(vtype, flowAtTime);
      }
    }
  
    return demandMap;
  }
  
  /**
   * Get the profile at the specified node.
   * Creates the map if it doesn't exist, returns null if the profile doesn't exist.
   */
  public DemandProfile getDemandProfileAt(Node node) {
    if (null == getProfile()) {
      setProfile(new HashMap<CharSequence,edu.berkeley.path.model_elements_base.DemandProfile>());
    }
    
    return (DemandProfile)getProfile().get(node.getId());
  }
  
  /**
   * Set the profile map. Same as setProfiles(), but works with a map of String to DemandProfile.
   */
  @SuppressWarnings("unchecked")
  public void setProfileMap(Map<String,DemandProfile> value) {
    setProfile((Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.DemandProfile>)(Map<?,?>)value);
  }

  /**
   * Get the profile map. Same as getProfiles(), but works with a map of DemandProfile.
   * Never returns null (creates the map if it doesn't exist).
   */
  @SuppressWarnings("unchecked")
  public Map<String,DemandProfile> getProfileMap() {
    if (null == getProfile()) {
      setProfile(new HashMap<java.lang.CharSequence,edu.berkeley.path.model_elements_base.DemandProfile>());
    }
    return (Map<String,DemandProfile>)(Map<?,?>)getProfile();
  }
  
  public Long getLongId() {
    return Long.parseLong(getId().toString());
  }
  
  public void setId(Long id) {
    setId(id.toString());
  }
  
  public Long getLongProjectId() {
    return Long.parseLong(getProjectId().toString());
  }

}
