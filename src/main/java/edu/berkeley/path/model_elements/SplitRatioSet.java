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

public class SplitRatioSet extends edu.berkeley.path.model_elements_base.SplitRatioSet {
  /**
   * Get the profile at the specified node.
   * Creates the map if it doesn't exist, returns null if the profile doesn't exist.
   */
  public SplitRatioProfile getSplitRatioProfileAt(Node node) {
    if (null == getProfile()) {
      setProfile(new HashMap<CharSequence,edu.berkeley.path.model_elements_base.SplitRatioProfile>());
    }
    
    return (SplitRatioProfile)getProfile().get(node.getId());
  }

  // TODO find a better way to expose Map<> access.
  
  /**
   * Set the profile map. Same as setProfiles(), but works with a map of String to SplitRatioProfile.
   */
  public void setProfileMap(Map<String,SplitRatioProfile> value) {
    setProfile((Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.SplitRatioProfile>)(Map<?,?>)value);
  }

  /**
   * Get the profile map. Same as getProfiles(), but works with a map of SplitRatioProfile.
   * Never returns null (creates the map if it doesn't exist).
   */
  public Map<String,SplitRatioProfile> getProfileMap() {
    if (null == getProfile()) {
      setProfile(new HashMap<java.lang.CharSequence,edu.berkeley.path.model_elements_base.SplitRatioProfile>());
    }
    return (Map<String,SplitRatioProfile>)(Map<?,?>)getProfile();
  }
}
