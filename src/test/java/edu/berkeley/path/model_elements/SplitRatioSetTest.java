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

public class SplitRatioSetTest {
  SplitRatioSet srs;
  
  @Before
  public void setup() {
    srs = new SplitRatioSet();
    srs.setId(1L);
    srs.setName("test");
    
    Map<String,SplitRatioProfile> srpm = srs.getProfileMap();
    
    String[] nodeIds = { "101" };
    String[] inLinkIds = { "201", "202" };
    String[] outLinkIds = { "301", "302" };
    String[] vtypeIds = { "car", "truck" };
    
    SplitRatioProfile srp101 = new SplitRatioProfile();
    srpm.put("101", srp101);
    srp101.setSampleRate(600.0); // 10 min
    srp101.setStartTime(7.0 * 60 * 60); // 7 am

    Map<String,Map<String,Map<String,List<Double>>>>
      rm101 = srp101.getRatioMap();
    
    rm101.put("201", new HashMap<String,Map<String,List<Double>>>());
    rm101.put("202", new HashMap<String,Map<String,List<Double>>>());
    
    rm101.get("201").put("301", new HashMap<String,List<Double>>());
    rm101.get("201").put("302", new HashMap<String,List<Double>>());
    rm101.get("202").put("301", new HashMap<String,List<Double>>());
    rm101.get("202").put("302", new HashMap<String,List<Double>>());
    
    rm101.get("201").get("301").put("car", Arrays.asList(1100.0, 1101.1, 1102.2, 1103.3, 1104.4));
    rm101.get("201").get("302").put("car", Arrays.asList(1200.0, 1201.1, 1202.2, 1203.3, 1204.4));
    rm101.get("202").get("301").put("car", Arrays.asList(2100.0, 2101.1, 2102.2, 2103.3, 2104.4));
    rm101.get("202").get("302").put("car", Arrays.asList(2200.0, 2201.1, 2202.2, 2203.3, 2204.4));

    rm101.get("201").get("301").put("truck", Arrays.asList(1110.0, 1111.1, 1112.2, 1113.3, 1114.4));
    rm101.get("201").get("302").put("truck", Arrays.asList(1210.0, 1211.1, 1212.2, 1213.3, 1214.4));
    rm101.get("202").get("301").put("truck", Arrays.asList(2110.0, 2111.1, 2112.2, 2113.3, 2114.4));
    rm101.get("202").get("302").put("truck", Arrays.asList(2210.0, 2211.1, 2212.2, 2213.3, 2214.4));
  }

  @Test
  public void testAAADummy() {
    //System.out.println("SplitRatioSet:\n" + srs + "\n\n");
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
    
    SplitRatioMap srm = srs.slice(interval);
    //System.out.println("before:\n" + srm);
    
    assertEquals((Double)1100.0,
      srm.getRatioMap().get("101").get("201").get("301").get("car"));
    assertEquals((Double)1200.0,
      srm.getRatioMap().get("101").get("201").get("302").get("car"));
    assertEquals((Double)2100.0,
      srm.getRatioMap().get("101").get("202").get("301").get("car"));
    assertEquals((Double)2200.0,
      srm.getRatioMap().get("101").get("202").get("302").get("car"));

    assertEquals((Double)1110.0,
      srm.getRatioMap().get("101").get("201").get("301").get("truck"));
    assertEquals((Double)1210.0,
      srm.getRatioMap().get("101").get("201").get("302").get("truck"));
    assertEquals((Double)2110.0,
      srm.getRatioMap().get("101").get("202").get("301").get("truck"));
    assertEquals((Double)2210.0,
      srm.getRatioMap().get("101").get("202").get("302").get("truck"));
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
    
    SplitRatioMap srm = srs.slice(interval);
    //System.out.println("during:\n" + srm);
    
    assertEquals((Double)1103.3,
      srm.getRatioMap().get("101").get("201").get("301").get("car"));
    assertEquals((Double)1203.3,
      srm.getRatioMap().get("101").get("201").get("302").get("car"));
    assertEquals((Double)2103.3,
      srm.getRatioMap().get("101").get("202").get("301").get("car"));
    assertEquals((Double)2203.3,
      srm.getRatioMap().get("101").get("202").get("302").get("car"));

    assertEquals((Double)1113.3,
      srm.getRatioMap().get("101").get("201").get("301").get("truck"));
    assertEquals((Double)1213.3,
      srm.getRatioMap().get("101").get("201").get("302").get("truck"));
    assertEquals((Double)2113.3,
      srm.getRatioMap().get("101").get("202").get("301").get("truck"));
    assertEquals((Double)2213.3,
      srm.getRatioMap().get("101").get("202").get("302").get("truck"));
    
    // test rounding down
    dt = org.joda.time.Duration.standardMinutes(14);
    interval = new Interval(timeBegin, dt);
    srm = srs.slice(interval);
    //System.out.println("during:\n" + srm);
    
    assertEquals((Double)1102.2,
      srm.getRatioMap().get("101").get("201").get("301").get("car"));
    assertEquals((Double)1202.2,
      srm.getRatioMap().get("101").get("201").get("302").get("car"));
    assertEquals((Double)2102.2,
      srm.getRatioMap().get("101").get("202").get("301").get("car"));
    assertEquals((Double)2202.2,
      srm.getRatioMap().get("101").get("202").get("302").get("car"));

    assertEquals((Double)1112.2,
      srm.getRatioMap().get("101").get("201").get("301").get("truck"));
    assertEquals((Double)1212.2,
      srm.getRatioMap().get("101").get("201").get("302").get("truck"));
    assertEquals((Double)2112.2,
      srm.getRatioMap().get("101").get("202").get("301").get("truck"));
    assertEquals((Double)2212.2,
      srm.getRatioMap().get("101").get("202").get("302").get("truck"));

    // test rounding up
    dt = org.joda.time.Duration.standardMinutes(15);
    interval = new Interval(timeBegin, dt);
    srm = srs.slice(interval);
    //System.out.println("during:\n" + srm);
    
    assertEquals((Double)1103.3,
      srm.getRatioMap().get("101").get("201").get("301").get("car"));
    assertEquals((Double)1203.3,
      srm.getRatioMap().get("101").get("201").get("302").get("car"));
    assertEquals((Double)2103.3,
      srm.getRatioMap().get("101").get("202").get("301").get("car"));
    assertEquals((Double)2203.3,
      srm.getRatioMap().get("101").get("202").get("302").get("car"));

    assertEquals((Double)1113.3,
      srm.getRatioMap().get("101").get("201").get("301").get("truck"));
    assertEquals((Double)1213.3,
      srm.getRatioMap().get("101").get("201").get("302").get("truck"));
    assertEquals((Double)2113.3,
      srm.getRatioMap().get("101").get("202").get("301").get("truck"));
    assertEquals((Double)2213.3,
      srm.getRatioMap().get("101").get("202").get("302").get("truck"));
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
    
    SplitRatioMap srm = srs.slice(interval);
    //System.out.println("after:\n" + srm);
    
    assertEquals((Double)1104.4,
      srm.getRatioMap().get("101").get("201").get("301").get("car"));
    assertEquals((Double)1204.4,
      srm.getRatioMap().get("101").get("201").get("302").get("car"));
    assertEquals((Double)2104.4,
      srm.getRatioMap().get("101").get("202").get("301").get("car"));
    assertEquals((Double)2204.4,
      srm.getRatioMap().get("101").get("202").get("302").get("car"));

    assertEquals((Double)1114.4,
      srm.getRatioMap().get("101").get("201").get("301").get("truck"));
    assertEquals((Double)1214.4,
      srm.getRatioMap().get("101").get("201").get("302").get("truck"));
    assertEquals((Double)2114.4,
      srm.getRatioMap().get("101").get("202").get("301").get("truck"));
    assertEquals((Double)2214.4,
      srm.getRatioMap().get("101").get("202").get("302").get("truck"));
  }
}
