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

public class DensityMap extends edu.berkeley.path.model_elements_base.DensityMap {
  public Double getVehiclesPerMeterOnLink(Link link) {
    if (this.vehiclesPerMeter == null) {
      this.vehiclesPerMeter = new HashMap<CharSequence,Double>();
    }

    return this.vehiclesPerMeter.get(link.getId());
  }
  
  public Double getVehiclesPerMeterOnLink(Long id) {
    if (this.vehiclesPerMeter == null) {
      this.vehiclesPerMeter = new HashMap<CharSequence,Double>();
    }

    return this.vehiclesPerMeter.get(id.toString());
  }

  public Double getVehiclesPerMeterOnLink(CharSequence id) {
    if (this.vehiclesPerMeter == null) {
      this.vehiclesPerMeter = new HashMap<CharSequence,Double>();
    }

    return this.vehiclesPerMeter.get(id);
  }

  public void setVehiclesPerMeterOnLink(Link link, Double val) {
    if (vehiclesPerMeter == null) {
      this.vehiclesPerMeter = new HashMap<CharSequence,Double>();
    }

    vehiclesPerMeter.put(link.getId(), val);
  }
  
  public void setVehiclesPerMeterOnLink(Long id, Double val) {
    if (vehiclesPerMeter == null) {
      this.vehiclesPerMeter = new HashMap<CharSequence,Double>();
    }

    vehiclesPerMeter.put(id.toString(), val);
  }
  
  public void setVehiclesPerMeterOnLink(CharSequence id, Double val) {
    if (vehiclesPerMeter == null) {
      this.vehiclesPerMeter = new HashMap<CharSequence,Double>();
    }

    vehiclesPerMeter.put(id, val);
  }
}
