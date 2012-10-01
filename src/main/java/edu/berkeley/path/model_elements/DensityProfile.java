package edu.berkeley.path.model_elements;

import java.util.*;

public class DensityProfile extends edu.berkeley.path.model_elements_base.DensityProfile {
  public List<Double> getVehiclesPerMeterOnLink(Link link) {
    List<Double> list;
    
    if (vehiclesPerMeter == null) {
      list = null;
    }
    else {
      list = vehiclesPerMeter.get(link.getId());
    }
    
    return list;
  }
  
  public void setVehiclesPerMeterOnLink(Link link, List<Double> list) {
    if (vehiclesPerMeter == null) {
      vehiclesPerMeter = new HashMap<CharSequence,List<Double>>();
    }

    vehiclesPerMeter.put(link.getId(), list);
  }
}
