package edu.berkeley.path.model_elements;

public class DateTime extends edu.berkeley.path.model_elements_base.DateTime {
  public static DateTime fromJoda(org.joda.time.DateTime joda) {
    long ms = joda.getMillis();
    DateTime datetime = new DateTime();
    datetime.milliseconds = ms;
    return datetime;
  }
  
  public org.joda.time.DateTime toJoda() {
    return new org.joda.time.DateTime(milliseconds);
  }
}
