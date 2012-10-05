/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** * Encapsulates a single run of a process. */
public class ProcessConfig extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ProcessConfig\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* Encapsulates a single run of a process.\",\"fields\":[{\"name\":\"host\",\"type\":\"string\"},{\"name\":\"pid\",\"type\":\"long\"},{\"name\":\"timeBegin\",\"type\":{\"type\":\"record\",\"name\":\"DateTime\",\"doc\":\"milliseconds, absolute, since epoch, utc\",\"fields\":[{\"name\":\"milliseconds\",\"type\":\"long\"}]},\"doc\":\"Note: wall clock time on host, not world time or sim time\"},{\"name\":\"timeEnd\",\"type\":\"DateTime\"}]}");
  @Deprecated public java.lang.CharSequence host;
  @Deprecated public long pid;
  /** Note: wall clock time on host, not world time or sim time */
  @Deprecated public edu.berkeley.path.model_elements_base.DateTime timeBegin;
  @Deprecated public edu.berkeley.path.model_elements_base.DateTime timeEnd;

  /**
   * Default constructor.
   */
  public ProcessConfig() {}

  /**
   * All-args constructor.
   */
  public ProcessConfig(java.lang.CharSequence host, java.lang.Long pid, edu.berkeley.path.model_elements_base.DateTime timeBegin, edu.berkeley.path.model_elements_base.DateTime timeEnd) {
    this.host = host;
    this.pid = pid;
    this.timeBegin = timeBegin;
    this.timeEnd = timeEnd;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return host;
    case 1: return pid;
    case 2: return timeBegin;
    case 3: return timeEnd;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: host = (java.lang.CharSequence)value$; break;
    case 1: pid = (java.lang.Long)value$; break;
    case 2: timeBegin = (edu.berkeley.path.model_elements_base.DateTime)value$; break;
    case 3: timeEnd = (edu.berkeley.path.model_elements_base.DateTime)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'host' field.
   */
  public java.lang.CharSequence getHost() {
    return host;
  }

  /**
   * Sets the value of the 'host' field.
   * @param value the value to set.
   */
  public void setHost(java.lang.CharSequence value) {
    this.host = value;
  }

  /**
   * Gets the value of the 'pid' field.
   */
  public java.lang.Long getPid() {
    return pid;
  }

  /**
   * Sets the value of the 'pid' field.
   * @param value the value to set.
   */
  public void setPid(java.lang.Long value) {
    this.pid = value;
  }

  /**
   * Gets the value of the 'timeBegin' field.
   * Note: wall clock time on host, not world time or sim time   */
  public edu.berkeley.path.model_elements_base.DateTime getTimeBegin() {
    return timeBegin;
  }

  /**
   * Sets the value of the 'timeBegin' field.
   * Note: wall clock time on host, not world time or sim time   * @param value the value to set.
   */
  public void setTimeBegin(edu.berkeley.path.model_elements_base.DateTime value) {
    this.timeBegin = value;
  }

  /**
   * Gets the value of the 'timeEnd' field.
   */
  public edu.berkeley.path.model_elements_base.DateTime getTimeEnd() {
    return timeEnd;
  }

  /**
   * Sets the value of the 'timeEnd' field.
   * @param value the value to set.
   */
  public void setTimeEnd(edu.berkeley.path.model_elements_base.DateTime value) {
    this.timeEnd = value;
  }

  /** Creates a new ProcessConfig RecordBuilder */
  public static edu.berkeley.path.model_elements_base.ProcessConfig.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.ProcessConfig.Builder();
  }
  
  /** Creates a new ProcessConfig RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.ProcessConfig.Builder newBuilder(edu.berkeley.path.model_elements_base.ProcessConfig.Builder other) {
    return new edu.berkeley.path.model_elements_base.ProcessConfig.Builder(other);
  }
  
  /** Creates a new ProcessConfig RecordBuilder by copying an existing ProcessConfig instance */
  public static edu.berkeley.path.model_elements_base.ProcessConfig.Builder newBuilder(edu.berkeley.path.model_elements_base.ProcessConfig other) {
    return new edu.berkeley.path.model_elements_base.ProcessConfig.Builder(other);
  }
  
  /**
   * RecordBuilder for ProcessConfig instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ProcessConfig>
    implements org.apache.avro.data.RecordBuilder<ProcessConfig> {

    private java.lang.CharSequence host;
    private long pid;
    private edu.berkeley.path.model_elements_base.DateTime timeBegin;
    private edu.berkeley.path.model_elements_base.DateTime timeEnd;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.ProcessConfig.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.ProcessConfig.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing ProcessConfig instance */
    private Builder(edu.berkeley.path.model_elements_base.ProcessConfig other) {
            super(edu.berkeley.path.model_elements_base.ProcessConfig.SCHEMA$);
      if (isValidValue(fields()[0], other.host)) {
        this.host = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.host);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.pid)) {
        this.pid = (java.lang.Long) data().deepCopy(fields()[1].schema(), other.pid);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timeBegin)) {
        this.timeBegin = (edu.berkeley.path.model_elements_base.DateTime) data().deepCopy(fields()[2].schema(), other.timeBegin);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.timeEnd)) {
        this.timeEnd = (edu.berkeley.path.model_elements_base.DateTime) data().deepCopy(fields()[3].schema(), other.timeEnd);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'host' field */
    public java.lang.CharSequence getHost() {
      return host;
    }
    
    /** Sets the value of the 'host' field */
    public edu.berkeley.path.model_elements_base.ProcessConfig.Builder setHost(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.host = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'host' field has been set */
    public boolean hasHost() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'host' field */
    public edu.berkeley.path.model_elements_base.ProcessConfig.Builder clearHost() {
      host = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'pid' field */
    public java.lang.Long getPid() {
      return pid;
    }
    
    /** Sets the value of the 'pid' field */
    public edu.berkeley.path.model_elements_base.ProcessConfig.Builder setPid(long value) {
      validate(fields()[1], value);
      this.pid = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'pid' field has been set */
    public boolean hasPid() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'pid' field */
    public edu.berkeley.path.model_elements_base.ProcessConfig.Builder clearPid() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'timeBegin' field */
    public edu.berkeley.path.model_elements_base.DateTime getTimeBegin() {
      return timeBegin;
    }
    
    /** Sets the value of the 'timeBegin' field */
    public edu.berkeley.path.model_elements_base.ProcessConfig.Builder setTimeBegin(edu.berkeley.path.model_elements_base.DateTime value) {
      validate(fields()[2], value);
      this.timeBegin = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'timeBegin' field has been set */
    public boolean hasTimeBegin() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'timeBegin' field */
    public edu.berkeley.path.model_elements_base.ProcessConfig.Builder clearTimeBegin() {
      timeBegin = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'timeEnd' field */
    public edu.berkeley.path.model_elements_base.DateTime getTimeEnd() {
      return timeEnd;
    }
    
    /** Sets the value of the 'timeEnd' field */
    public edu.berkeley.path.model_elements_base.ProcessConfig.Builder setTimeEnd(edu.berkeley.path.model_elements_base.DateTime value) {
      validate(fields()[3], value);
      this.timeEnd = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'timeEnd' field has been set */
    public boolean hasTimeEnd() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'timeEnd' field */
    public edu.berkeley.path.model_elements_base.ProcessConfig.Builder clearTimeEnd() {
      timeEnd = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public ProcessConfig build() {
      try {
        ProcessConfig record = new ProcessConfig();
        record.host = fieldSetFlags()[0] ? this.host : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.pid = fieldSetFlags()[1] ? this.pid : (java.lang.Long) defaultValue(fields()[1]);
        record.timeBegin = fieldSetFlags()[2] ? this.timeBegin : (edu.berkeley.path.model_elements_base.DateTime) defaultValue(fields()[2]);
        record.timeEnd = fieldSetFlags()[3] ? this.timeEnd : (edu.berkeley.path.model_elements_base.DateTime) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}