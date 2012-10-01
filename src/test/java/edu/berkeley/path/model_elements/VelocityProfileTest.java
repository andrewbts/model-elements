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

public class VelocityProfileTest {
  Network nw;
  VelocityProfile vp;
  
  @Before
  public void setup() {
    nw = new Network();
    nw.setName("test network");
    
    vp = new VelocityProfile();
    vp.setId("2");

    nw.setNodes(
      new ArrayList<edu.berkeley.path.model_elements_base.Node>(2)
    );
    nw.setLinks(
      new ArrayList<edu.berkeley.path.model_elements_base.Link>(1)
    );
    
    Node nd;
    Link ln;

    nd = new Node();
    nd.setId("1");
    nd.setName("one");
    nd.setType("hwy");
    nw.nodes.add(nd);

    nd = new Node();
    nd.setId("2");
    nd.setName("two");
    nd.setType("hwy");
    nw.nodes.add(nd);

    ln = new Link();
    ln.setId("3");
    ln.setName("three");
    ln.setType("hwy");
    ln.setLaneCount(4.0);
    ln.setLength(1000.0);
    
    ln.begin_id = 1;
    ln.end_id = 2;
    
    nw.links.add(ln);
  }

  @Test
  public void testPrimitiveVelocityProfile() {
    Map<CharSequence,List<Double>> mps =
      new HashMap<CharSequence,List<Double>>();
          
    vp.setMetersPerSecond(mps);
    
    List<Double> row = new ArrayList<Double>();
    row.add(1.0);
    row.add(2.0);
    row.add(3.0);
    
    mps.put("1", row);

    assertEquals((Double)2.0, vp.getMetersPerSecond().get("1").get(1));
  }

  @Test
  public void testVelocityProfile() {
    Link link = nw.getLinkById(3);
    
    ArrayList<Double> row = new ArrayList<Double>();
    row.add(1.0);
    row.add(2.0);
    row.add(3.0);
    
    vp.setMetersPerSecondOnLink(link, row);
    
    assertEquals((Double)2.0, vp.getMetersPerSecondOnLink(link).get(1));
  }
}
