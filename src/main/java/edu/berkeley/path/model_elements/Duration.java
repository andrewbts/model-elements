package edu.berkeley.path.model_elements;

public class Duration extends edu.berkeley.path.model_elements_base.Duration {
  public static Duration fromJoda(org.joda.time.Duration joda) {
    long ms = joda.getMillis();
    Duration duration = new Duration();
    duration.milliseconds = ms;
    return duration;
  }
  
  public org.joda.time.Duration toJoda() {
    return new org.joda.time.Duration(milliseconds);
  }
}
