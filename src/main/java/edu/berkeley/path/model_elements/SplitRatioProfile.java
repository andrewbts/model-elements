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

public class SplitRatioProfile extends edu.berkeley.path.model_elements_base.SplitRatioProfile {
  public void addRatioAt(Long inLinkID, Long outLinkID, Long vehTypeID, Double ratio) {
    addRatioAt(inLinkID.toString(), outLinkID.toString(), vehTypeID.toString(), ratio);
  }
  
  public void addRatioAt(String inLinkID, String outLinkID, String vehTypeID, Double ratio) {
    Map<CharSequence,Map<CharSequence,Map<CharSequence,List<Double>>>>
      ratioMap = getRatio();
    
    if (ratioMap == null) {
      ratioMap = new HashMap<CharSequence,Map<CharSequence,Map<CharSequence,List<Double>>>>();
      setRatio(ratioMap);
    }
    
    addRatioToMapAt(ratioMap, inLinkID, outLinkID, vehTypeID, ratio);
  }

  public static void addRatioToMapAt(
      Map<CharSequence,Map<CharSequence,Map<CharSequence,List<Double>>>> ratioMap,
      Long inLinkID, Long outLinkID, Long vehTypeID, Double ratio) {
    addRatioToMapAt(ratioMap, inLinkID.toString(), outLinkID.toString(), vehTypeID.toString(), ratio);
  }
  
  public static void addRatioToMapAt(
      Map<CharSequence,Map<CharSequence,Map<CharSequence,List<Double>>>> ratioMap,
      String inLinkID, String outLinkID, String vehTypeID, Double ratio) {
    
    Map<CharSequence,Map<CharSequence,List<Double>>> inLinkMap =
      ratioMap.get(inLinkID);
    
    if (inLinkMap == null) {
      inLinkMap = new HashMap<CharSequence,Map<CharSequence,List<Double>>>();
      ratioMap.put(inLinkID, inLinkMap);
    }

    Map<CharSequence,List<Double>> outLinkMap =
      inLinkMap.get(outLinkID);
    
    if (outLinkMap == null) {
      outLinkMap = new HashMap<CharSequence,List<Double>>();
      inLinkMap.put(outLinkID, outLinkMap);
    }

    List<Double> vehTypeList =
      outLinkMap.get(vehTypeID);
    
    if (vehTypeList == null) {
      vehTypeList = new ArrayList<Double>();
      outLinkMap.put(vehTypeID, vehTypeList);
    }
    
    vehTypeList.add(ratio);
  }
}
