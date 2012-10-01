package edu.berkeley.path.model_elements;

import java.util.*;

public class VelocityProfile extends edu.berkeley.path.model_elements_base.VelocityProfile {
  public List<Double> getMetersPerSecondOnLink(Link link) {
    List<Double> list;
    
    if (metersPerSecond == null) {
      list = null;
    }
    else {
      list = metersPerSecond.get(link.getId());
    }
    
    return list;
  }
  
  public void setMetersPerSecondOnLink(Link link, List<Double> list) {
    if (metersPerSecond == null) {
      metersPerSecond = new HashMap<CharSequence,List<Double>>();
    }

    metersPerSecond.put(link.getId(), list);
  }
}
