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
 * 3. Neither the name of the University nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
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

import edu.berkeley.path.model_elements.*;

public class DensityProfileTest {
  Network nw;
  DensityProfile dp;
  
  @Before
  public void setup() {
    nw = new Network();
    nw.setName("test network");
    
    dp = new DensityProfile();
    dp.setId("2");

    nw.setNodes(new ArrayList<edu.berkeley.path.model_elements_base.Node>());
    nw.setLinks(new ArrayList<edu.berkeley.path.model_elements_base.Link>());
    
    Node nd1;
    Node nd2;
    Link ln;

    nd1 = new Node();
    nd1.setId("1");
    nd1.setName("one");
    nd1.setType("hwy");
    nw.nodes.add(nd1);

    nd2 = new Node();
    nd2.setId("2");
    nd2.setName("two");
    nd2.setType("hwy");
    nw.nodes.add(nd2);

    ln = new Link();
    ln.setId("3");
    ln.setName("three");
    ln.setType("hwy");
    ln.setLaneCount(4.0);
    ln.setLength(1000.0);
    
    ln.setBegin(nd1);
    ln.setEnd(nd2);
    
    nw.links.add(ln);
  }

  @Test
  public void testPrimitiveDensityProfile() {
    Map<CharSequence,List<Double>> vpm =
      new HashMap<CharSequence,List<Double>>();
          
    dp.setVehiclesPerMeter(vpm);
    
    List<Double> row = new ArrayList<Double>();
    row.add(1.0);
    row.add(2.0);
    row.add(3.0);
    
    vpm.put("1", row);

    assertEquals((Double)2.0, dp.getVehiclesPerMeter().get("1").get(1));
  }

  @Test
  public void testDensityProfile() {
    Link link = nw.getLinkById(3);
    
    ArrayList<Double> row = new ArrayList<Double>();
    row.add(1.0);
    row.add(2.0);
    row.add(3.0);
    
    dp.setVehiclesPerMeterOnLink(link, row);
    
    assertEquals((Double)2.0, dp.getVehiclesPerMeterOnLink(link).get(1));
  }
}
