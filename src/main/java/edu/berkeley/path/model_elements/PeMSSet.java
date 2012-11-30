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

public class PeMSSet extends edu.berkeley.path.model_elements_base.PeMSSet {
  /**
   * Set the list of pems maps. Same as setPemsMap(), but works with a list of PeMSMap.
   */
  public void setPemsMapList(List<PeMSMap> value) {
    setPemsMap((List<edu.berkeley.path.model_elements_base.PeMSMap>)(List<?>)value);
  }
  
  /**
   * Get the list of pems maps. Same as getPemsMap(), but returns a list of PeMSMap.
   * Never returns null (creates the list if it doesn't exist).
   */
  public List<PeMSMap> getPemsMapList() {
    if (null == getPemsMap()) {
      setPemsMap(new ArrayList<edu.berkeley.path.model_elements_base.PeMSMap>());
    }
    return (List<PeMSMap>)(List<?>)getPemsMap();
  }
}
