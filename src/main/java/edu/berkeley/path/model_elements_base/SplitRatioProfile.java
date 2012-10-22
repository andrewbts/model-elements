/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** * Split ratio time series at a node. The node ID is not stored
   * in this record, but as the map key of the SplitRatioSet. */
public class SplitRatioProfile extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SplitRatioProfile\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* Split ratio time series at a node. The node ID is not stored\\n   * in this record, but as the map key of the SplitRatioSet.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"networkId\",\"type\":[\"null\",\"string\"],\"doc\":\"* if null, use the unique network in this scenario.\"},{\"name\":\"destinationNetworkId\",\"type\":[\"null\",\"string\"],\"doc\":\"* if null, this profile governs background flow, not OD flow.\"},{\"name\":\"startTime\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 0\"},{\"name\":\"sampleRate\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 300 seconds\"},{\"name\":\"splitratio\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"SplitRatio\",\"doc\":\"* Split ratio at a node, at one point in time, for one in-link, one\\n   * out-link, and one vehicle type. These values are not stored\\n   * in this record, but as the map keys of the SplitRatioProfile.\",\"fields\":[{\"name\":\"ratioOrder\",\"type\":\"int\",\"doc\":\"* The order that this ratio should be used when traversing.\"},{\"name\":\"ratio\",\"type\":\"double\",\"doc\":\"* The actual raio for this node, this entry and this exit link,\\n     * and this vehicle type.\"}]}}}},\"doc\":\"* keys are: inLinkId, outLinkId, vehTypeId\"}]}");
  @Deprecated public java.lang.CharSequence id;
  /** * if null, use the unique network in this scenario. */
  @Deprecated public java.lang.CharSequence networkId;
  /** * if null, this profile governs background flow, not OD flow. */
  @Deprecated public java.lang.CharSequence destinationNetworkId;
  /** * in seconds; default is 0 */
  @Deprecated public java.lang.Double startTime;
  /** * in seconds; default is 300 seconds */
  @Deprecated public java.lang.Double sampleRate;
  /** * keys are: inLinkId, outLinkId, vehTypeId */
  @Deprecated public java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.SplitRatio>>> splitratio;

  /**
   * Default constructor.
   */
  public SplitRatioProfile() {}

  /**
   * All-args constructor.
   */
  public SplitRatioProfile(java.lang.CharSequence id, java.lang.CharSequence networkId, java.lang.CharSequence destinationNetworkId, java.lang.Double startTime, java.lang.Double sampleRate, java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.SplitRatio>>> splitratio) {
    this.id = id;
    this.networkId = networkId;
    this.destinationNetworkId = destinationNetworkId;
    this.startTime = startTime;
    this.sampleRate = sampleRate;
    this.splitratio = splitratio;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return networkId;
    case 2: return destinationNetworkId;
    case 3: return startTime;
    case 4: return sampleRate;
    case 5: return splitratio;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: networkId = (java.lang.CharSequence)value$; break;
    case 2: destinationNetworkId = (java.lang.CharSequence)value$; break;
    case 3: startTime = (java.lang.Double)value$; break;
    case 4: sampleRate = (java.lang.Double)value$; break;
    case 5: splitratio = (java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.SplitRatio>>>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'networkId' field.
   * * if null, use the unique network in this scenario.   */
  public java.lang.CharSequence getNetworkId() {
    return networkId;
  }

  /**
   * Sets the value of the 'networkId' field.
   * * if null, use the unique network in this scenario.   * @param value the value to set.
   */
  public void setNetworkId(java.lang.CharSequence value) {
    this.networkId = value;
  }

  /**
   * Gets the value of the 'destinationNetworkId' field.
   * * if null, this profile governs background flow, not OD flow.   */
  public java.lang.CharSequence getDestinationNetworkId() {
    return destinationNetworkId;
  }

  /**
   * Sets the value of the 'destinationNetworkId' field.
   * * if null, this profile governs background flow, not OD flow.   * @param value the value to set.
   */
  public void setDestinationNetworkId(java.lang.CharSequence value) {
    this.destinationNetworkId = value;
  }

  /**
   * Gets the value of the 'startTime' field.
   * * in seconds; default is 0   */
  public java.lang.Double getStartTime() {
    return startTime;
  }

  /**
   * Sets the value of the 'startTime' field.
   * * in seconds; default is 0   * @param value the value to set.
   */
  public void setStartTime(java.lang.Double value) {
    this.startTime = value;
  }

  /**
   * Gets the value of the 'sampleRate' field.
   * * in seconds; default is 300 seconds   */
  public java.lang.Double getSampleRate() {
    return sampleRate;
  }

  /**
   * Sets the value of the 'sampleRate' field.
   * * in seconds; default is 300 seconds   * @param value the value to set.
   */
  public void setSampleRate(java.lang.Double value) {
    this.sampleRate = value;
  }

  /**
   * Gets the value of the 'splitratio' field.
   * * keys are: inLinkId, outLinkId, vehTypeId   */
  public java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.SplitRatio>>> getSplitratio() {
    return splitratio;
  }

  /**
   * Sets the value of the 'splitratio' field.
   * * keys are: inLinkId, outLinkId, vehTypeId   * @param value the value to set.
   */
  public void setSplitratio(java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.SplitRatio>>> value) {
    this.splitratio = value;
  }

  /** Creates a new SplitRatioProfile RecordBuilder */
  public static edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder();
  }
  
  /** Creates a new SplitRatioProfile RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder newBuilder(edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder other) {
    return new edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder(other);
  }
  
  /** Creates a new SplitRatioProfile RecordBuilder by copying an existing SplitRatioProfile instance */
  public static edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder newBuilder(edu.berkeley.path.model_elements_base.SplitRatioProfile other) {
    return new edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder(other);
  }
  
  /**
   * RecordBuilder for SplitRatioProfile instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SplitRatioProfile>
    implements org.apache.avro.data.RecordBuilder<SplitRatioProfile> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence networkId;
    private java.lang.CharSequence destinationNetworkId;
    private java.lang.Double startTime;
    private java.lang.Double sampleRate;
    private java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.SplitRatio>>> splitratio;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.SplitRatioProfile.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing SplitRatioProfile instance */
    private Builder(edu.berkeley.path.model_elements_base.SplitRatioProfile other) {
            super(edu.berkeley.path.model_elements_base.SplitRatioProfile.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.networkId)) {
        this.networkId = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.networkId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.destinationNetworkId)) {
        this.destinationNetworkId = (java.lang.CharSequence) data().deepCopy(fields()[2].schema(), other.destinationNetworkId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.startTime)) {
        this.startTime = (java.lang.Double) data().deepCopy(fields()[3].schema(), other.startTime);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.sampleRate)) {
        this.sampleRate = (java.lang.Double) data().deepCopy(fields()[4].schema(), other.sampleRate);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.splitratio)) {
        this.splitratio = (java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.SplitRatio>>>) data().deepCopy(fields()[5].schema(), other.splitratio);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'networkId' field */
    public java.lang.CharSequence getNetworkId() {
      return networkId;
    }
    
    /** Sets the value of the 'networkId' field */
    public edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder setNetworkId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.networkId = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'networkId' field has been set */
    public boolean hasNetworkId() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'networkId' field */
    public edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder clearNetworkId() {
      networkId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'destinationNetworkId' field */
    public java.lang.CharSequence getDestinationNetworkId() {
      return destinationNetworkId;
    }
    
    /** Sets the value of the 'destinationNetworkId' field */
    public edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder setDestinationNetworkId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.destinationNetworkId = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'destinationNetworkId' field has been set */
    public boolean hasDestinationNetworkId() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'destinationNetworkId' field */
    public edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder clearDestinationNetworkId() {
      destinationNetworkId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'startTime' field */
    public java.lang.Double getStartTime() {
      return startTime;
    }
    
    /** Sets the value of the 'startTime' field */
    public edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder setStartTime(java.lang.Double value) {
      validate(fields()[3], value);
      this.startTime = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'startTime' field has been set */
    public boolean hasStartTime() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'startTime' field */
    public edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder clearStartTime() {
      startTime = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'sampleRate' field */
    public java.lang.Double getSampleRate() {
      return sampleRate;
    }
    
    /** Sets the value of the 'sampleRate' field */
    public edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder setSampleRate(java.lang.Double value) {
      validate(fields()[4], value);
      this.sampleRate = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'sampleRate' field has been set */
    public boolean hasSampleRate() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'sampleRate' field */
    public edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder clearSampleRate() {
      sampleRate = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'splitratio' field */
    public java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.SplitRatio>>> getSplitratio() {
      return splitratio;
    }
    
    /** Sets the value of the 'splitratio' field */
    public edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder setSplitratio(java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.SplitRatio>>> value) {
      validate(fields()[5], value);
      this.splitratio = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'splitratio' field has been set */
    public boolean hasSplitratio() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'splitratio' field */
    public edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder clearSplitratio() {
      splitratio = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public SplitRatioProfile build() {
      try {
        SplitRatioProfile record = new SplitRatioProfile();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.networkId = fieldSetFlags()[1] ? this.networkId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.destinationNetworkId = fieldSetFlags()[2] ? this.destinationNetworkId : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.startTime = fieldSetFlags()[3] ? this.startTime : (java.lang.Double) defaultValue(fields()[3]);
        record.sampleRate = fieldSetFlags()[4] ? this.sampleRate : (java.lang.Double) defaultValue(fields()[4]);
        record.splitratio = fieldSetFlags()[5] ? this.splitratio : (java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.SplitRatio>>>) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
