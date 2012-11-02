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

import edu.berkeley.path.model_elements.*;

public class VelocityMapTest {
  Network nw;
  VelocityMap vp;
  
  @Before
  public void setup() {
    nw = new Network();
    nw.setName("test network");
    
    vp = new VelocityMap();

    nw.setNodes(new ArrayList<edu.berkeley.path.model_elements_base.Node>());
    nw.setLinks(new ArrayList<edu.berkeley.path.model_elements_base.Link>());
    
    Node nd1;
    Node nd2;
    Link ln;

    nd1 = new Node();
    nd1.setId(1L);
    nd1.setName("one");
    nd1.setType("hwy");
    nw.nodes.add(nd1);

    nd2 = new Node();
    nd2.setId(2L);
    nd2.setName("two");
    nd2.setType("hwy");
    nw.nodes.add(nd2);

    ln = new Link();
    ln.setId(3L);
    ln.setName("three");
    ln.setType("hwy");
    ln.setLaneCount(4.0);
    ln.setLength(1000.0);
    
    ln.setBegin(nd1);
    ln.setEnd(nd2);
    
    nw.links.add(ln);
  }

  @Test
  public void testPrimitiveAccess() {
    Map<CharSequence,Double> mps =
      new HashMap<CharSequence,Double>();
          
    vp.setMetersPerSecond(mps);
    
    Double val = 1.23;
    mps.put("3", val);

    assertEquals((Double)1.23, vp.getMetersPerSecond().get("3"));
  }

  @Test
  public void testHighLevelAccess() {
    Link link = nw.getLinkById(3L);
    
    Double val = 1.23;
    
    vp.setMetersPerSecondOnLink(link, val);
    
    assertEquals((Double)1.23, vp.getMetersPerSecondOnLink(link));
  }
}
