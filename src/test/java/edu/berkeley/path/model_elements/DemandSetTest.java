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

public class DemandSetTest {
  DemandSet ds;
  
  @Before
  public void setup() {
    ds = new DemandSet();
    ds.setId(1L);
    ds.setName("test");
    
    Map<String,DemandProfile> dpm = ds.getProfileMap();
    
    String[] linkIds = { "101", "102", "103" };
    String[] vtypeIds = { "car", "truck" };
    
    DemandProfile dp101 = new DemandProfile();
    dpm.put("101", dp101);
    dp101.setSampleRate(600.0); // 10 min
    dp101.setStartTime(7.0 * 60 * 60); // 7 am

    Map<String,List<Double>> fm101 = dp101.getFlowMap();
    fm101.put("car", Arrays.asList(0.0, 1.1, 2.2, 3.3, 4.4));
    fm101.put("truck", Arrays.asList(10.0, 11.1, 12.2, 13.3, 14.4));

    DemandProfile dp102 = new DemandProfile();
    dpm.put("102", dp102);
    dp102.setSampleRate(600.0); // 10 min
    dp102.setStartTime(7.0 * 60 * 60); // 7 am
    
    Map<String,List<Double>> fm102 = dp102.getFlowMap();
    fm102.put("car", Arrays.asList(0.0, 1.1, 2.2, 3.3, 4.4));
    fm102.put("truck", Arrays.asList(10.0, 11.1, 12.2, 13.3, 14.4));

    DemandProfile dp103 = new DemandProfile();
    dpm.put("103", dp103);
    dp103.setSampleRate(600.0); // 10 min
    dp103.setStartTime(7.0 * 60 * 60); // 7 am

    Map<String,List<Double>> fm103 = dp103.getFlowMap();
    fm103.put("car", Arrays.asList(0.0, 1.1, 2.2, 3.3, 4.4));
    fm103.put("truck", Arrays.asList(10.0, 11.1, 12.2, 13.3, 14.4));
  }

  @Test
  public void testAAADummy() {
    //System.out.println("DemandSet:\n" + ds + "\n\n");
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
    
    DemandMap dm = ds.slice(interval);
    //System.out.println("before:\n" + dm);
    
    assertEquals((Double)0.0, dm.getFlowMap().get("101").get("car"));
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
    
    DemandMap dm = ds.slice(interval);
    //System.out.println("during:\n" + dm);
    
    assertEquals((Double)3.3, dm.getFlowMap().get("101").get("car"));
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
    
    DemandMap dm = ds.slice(interval);
    //System.out.println("after:\n" + dm);

    assertEquals((Double)4.4, dm.getFlowMap().get("101").get("car"));
  }
}
