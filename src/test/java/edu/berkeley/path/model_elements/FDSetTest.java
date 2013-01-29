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

import org.joda.time.Interval;

public class FDSetTest {
  FDSet fds;
  
  @Before
  public void setup() {
    fds = new FDSet();
    fds.setId(1L);
    fds.setName("test");
    
    Map<String,FDProfile> fdpm = fds.getProfileMap();
    
    @SuppressWarnings("unused")
	String[] linkIds = { "101", "102", "103" };
    FD fd;
    
    FDProfile fdp101 = new FDProfile();
    fdpm.put("101", fdp101);
    fdp101.setSampleRate(600.0); // 10 min
    fdp101.setStartTime(7.0 * 60 * 60); // 7 am

    fd = new FD();
    fd.setFreeFlowSpeed(0.0);
    fdp101.getFdList().add(fd);

    fd = new FD();
    fd.setFreeFlowSpeed(1.1);
    fdp101.getFdList().add(fd);

    fd = new FD();
    fd.setFreeFlowSpeed(2.2);
    fdp101.getFdList().add(fd);

    fd = new FD();
    fd.setFreeFlowSpeed(3.3);
    fdp101.getFdList().add(fd);

    fd = new FD();
    fd.setFreeFlowSpeed(4.4);
    fdp101.getFdList().add(fd);

    FDProfile fdp102 = new FDProfile();
    fdpm.put("102", fdp102);
    fdp102.setSampleRate(600.0); // 10 min
    fdp102.setStartTime(7.0 * 60 * 60); // 7 am
    

    FDProfile fdp103 = new FDProfile();
    fdpm.put("103", fdp103);
    fdp103.setSampleRate(600.0); // 10 min
    fdp103.setStartTime(7.0 * 60 * 60); // 7 am

  }

  @Test
  public void testAAADummy() {
    //System.out.println("FDSet:\n" + fds + "\n\n");
  }

  @Test
  public void testSliceBefore() {
    org.joda.time.DateTime timeBegin = new org.joda.time.DateTime(
      // YYYY, MM, DD, HH, MM
         2012, 11, 29,  5,  0,
      org.joda.time.DateTimeZone.forID("America/Los_Angeles")
    );
    
    org.joda.time.Duration dt = org.joda.time.Duration.standardHours(1);
    
    Interval interval = new Interval(timeBegin, dt);
    
    FDMap fdm = fds.slice(interval);
    //System.out.println("before:\n" + fdm);
    
    assertEquals((Double)0.0, fdm.getFdMap().get("101").getFreeFlowSpeed());
  }

  @Test
  public void testSliceDuring() {
    org.joda.time.DateTime timeBegin = new org.joda.time.DateTime(
      // YYYY, MM, DD, HH, MM
         2012, 11, 29,  7,  10,
      org.joda.time.DateTimeZone.forID("America/Los_Angeles")
    );
    
    org.joda.time.Duration dt = org.joda.time.Duration.standardMinutes(20);
    
    Interval interval = new Interval(timeBegin, dt);
    
    FDMap fdm = fds.slice(interval);
    //System.out.println("during:\n" + fdm);
    
    assertEquals((Double)3.3, fdm.getFdMap().get("101").getFreeFlowSpeed());
  }

  @Test
  public void testSliceAfter() {
    org.joda.time.DateTime timeBegin = new org.joda.time.DateTime(
      // YYYY, MM, DD, HH, MM
         2012, 11, 29,  10,  0,
      org.joda.time.DateTimeZone.forID("America/Los_Angeles"  )
    );
    
    org.joda.time.Duration dt = org.joda.time.Duration.standardHours(10);
    
    Interval interval = new Interval(timeBegin, dt);
    
    FDMap fdm = fds.slice(interval);
    //System.out.println("after:\n" + fdm);

    assertEquals((Double)4.4, fdm.getFdMap().get("101").getFreeFlowSpeed());
  }
}
