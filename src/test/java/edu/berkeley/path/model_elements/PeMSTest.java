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

import org.junit.*;

import static org.junit.Assert.*;
import java.util.*;

/**
 * Not a very interesting test; included mostly as an example of how to
 * use the api.
 **/
public class PeMSTest {
  @Test
  public void testProfile() {
    PeMS pems;
    PeMSProfile profile;
    org.joda.time.DateTime jodaDateTime;

    pems = new PeMS();
    
    jodaDateTime = new org.joda.time.DateTime(
      // YYYY, MM, DD, HH, MM
         2012, 11, 27, 13, 30,
      org.joda.time.DateTimeZone.forID("America/Los_Angeles")
    );
    
    pems.setVdsId(100L);
    pems.setJodaTimeMeasured(jodaDateTime);
    pems.setFlow(10.0);
    pems.setDensity(1.23);
    pems.setDensityError(0.2);
    pems.setSpeed(32.1);
    pems.setSpeedError(0.2);
    pems.setFreeFlowSpeed(25.1);
    pems.setFuncLoopFact(2.0);
    
    ArrayList<Double> gf = new ArrayList<Double>();
    gf.add(1.0);
    gf.add(2.0);
    
    pems.setGFactorLane(gf);
    
    profile = new PeMSProfile();
    profile.setPemsList(new ArrayList<PeMS>());    
    profile.getPems().add(pems);
    
    assertEquals((Double)2.0, profile.getPems().get(0).getGFactorLane().get(1));
  }
}
