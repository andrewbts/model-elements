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

public class FDMap extends edu.berkeley.path.model_elements_base.FDMap implements FDMapProvider {
	
	public FD getLinkFD(Link link) {
		return (FD)super.getFd().get(link.getId());
	}
	
  /**
   * Set the fd map. Same as setFd(), but works with String keys.
   */
  @SuppressWarnings("unchecked")
  public void setFdMap(Map<String,FD> value) {
    setFd((Map<java.lang.String,edu.berkeley.path.model_elements_base.FD>)(Map<?,?>)value);
  }

  /**
   * Get the fd map. Same as getFd(), but works with String keys.
   * Never returns null (creates the map if it doesn't exist).
   */
  @SuppressWarnings("unchecked")
  public Map<String,FD> getFdMap() {
    if (null == getFd()) {
      setFd(new HashMap<java.lang.String,edu.berkeley.path.model_elements_base.FD>());
    }
    return (Map<String,FD>)(Map<?,?>)getFd();
  }

	/**
	 * An FDMap can act as an FDMapProvider by simply returning itself.
	 */
	@Override
	public FDMap getFDMap(Interval interval) {
		return this;
	}
	
}
