/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** * Split ratio time series at a node. The node ID is not stored
   * in this record, but as the map key in the SplitRatioSet.profile. */
public class SplitRatioProfile extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SplitRatioProfile\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* Split ratio time series at a node. The node ID is not stored\\n   * in this record, but as the map key in the SplitRatioSet.profile.\",\"fields\":[{\"name\":\"destinationNetworkId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"* if null, this profile governs background flow, not OD flow.\"},{\"name\":\"startTime\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 0\",\"default\":0.0},{\"name\":\"sampleRate\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 300 seconds\",\"default\":300.0},{\"name\":\"ratio\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"double\"},\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"},\"doc\":\"* time series of ratios;\\n     * map keys are: inLinkId, outLinkId, vehTypeId;\\n     * array index is index in time series (\\\"RATIO_ORDER\\\" in db)\"}]}");
  /** * if null, this profile governs background flow, not OD flow. */
  @Deprecated public java.lang.String destinationNetworkId;
  /** * in seconds; default is 0 */
  @Deprecated public java.lang.Double startTime;
  /** * in seconds; default is 300 seconds */
  @Deprecated public java.lang.Double sampleRate;
  /** * time series of ratios;
     * map keys are: inLinkId, outLinkId, vehTypeId;
     * array index is index in time series ("RATIO_ORDER" in db) */
  @Deprecated public java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.List<java.lang.Double>>>> ratio;

  /**
   * Default constructor.
   */
  public SplitRatioProfile() {}

  /**
   * All-args constructor.
   */
  public SplitRatioProfile(java.lang.String destinationNetworkId, java.lang.Double startTime, java.lang.Double sampleRate, java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.List<java.lang.Double>>>> ratio) {
    this.destinationNetworkId = destinationNetworkId;
    this.startTime = startTime;
    this.sampleRate = sampleRate;
    this.ratio = ratio;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return destinationNetworkId;
    case 1: return startTime;
    case 2: return sampleRate;
    case 3: return ratio;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: destinationNetworkId = (java.lang.String)value$; break;
    case 1: startTime = (java.lang.Double)value$; break;
    case 2: sampleRate = (java.lang.Double)value$; break;
    case 3: ratio = (java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.List<java.lang.Double>>>>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'destinationNetworkId' field.
   * * if null, this profile governs background flow, not OD flow.   */
  public java.lang.String getDestinationNetworkId() {
    return destinationNetworkId;
  }

  /**
   * Sets the value of the 'destinationNetworkId' field.
   * * if null, this profile governs background flow, not OD flow.   * @param value the value to set.
   */
  public void setDestinationNetworkId(java.lang.String value) {
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
   * Gets the value of the 'ratio' field.
   * * time series of ratios;
     * map keys are: inLinkId, outLinkId, vehTypeId;
     * array index is index in time series ("RATIO_ORDER" in db)   */
  public java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.List<java.lang.Double>>>> getRatio() {
    return ratio;
  }

  /**
   * Sets the value of the 'ratio' field.
   * * time series of ratios;
     * map keys are: inLinkId, outLinkId, vehTypeId;
     * array index is index in time series ("RATIO_ORDER" in db)   * @param value the value to set.
   */
  public void setRatio(java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.List<java.lang.Double>>>> value) {
    this.ratio = value;
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

    private java.lang.String destinationNetworkId;
    private java.lang.Double startTime;
    private java.lang.Double sampleRate;
    private java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.List<java.lang.Double>>>> ratio;

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
      if (isValidValue(fields()[0], other.destinationNetworkId)) {
        this.destinationNetworkId = (java.lang.String) data().deepCopy(fields()[0].schema(), other.destinationNetworkId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.startTime)) {
        this.startTime = (java.lang.Double) data().deepCopy(fields()[1].schema(), other.startTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.sampleRate)) {
        this.sampleRate = (java.lang.Double) data().deepCopy(fields()[2].schema(), other.sampleRate);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ratio)) {
        this.ratio = (java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.List<java.lang.Double>>>>) data().deepCopy(fields()[3].schema(), other.ratio);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'destinationNetworkId' field */
    public java.lang.String getDestinationNetworkId() {
      return destinationNetworkId;
    }
    
    /** Sets the value of the 'destinationNetworkId' field */
    public edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder setDestinationNetworkId(java.lang.String value) {
      validate(fields()[0], value);
      this.destinationNetworkId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'destinationNetworkId' field has been set */
    public boolean hasDestinationNetworkId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'destinationNetworkId' field */
    public edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder clearDestinationNetworkId() {
      destinationNetworkId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'startTime' field */
    public java.lang.Double getStartTime() {
      return startTime;
    }
    
    /** Sets the value of the 'startTime' field */
    public edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder setStartTime(java.lang.Double value) {
      validate(fields()[1], value);
      this.startTime = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'startTime' field has been set */
    public boolean hasStartTime() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'startTime' field */
    public edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder clearStartTime() {
      startTime = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'sampleRate' field */
    public java.lang.Double getSampleRate() {
      return sampleRate;
    }
    
    /** Sets the value of the 'sampleRate' field */
    public edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder setSampleRate(java.lang.Double value) {
      validate(fields()[2], value);
      this.sampleRate = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'sampleRate' field has been set */
    public boolean hasSampleRate() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'sampleRate' field */
    public edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder clearSampleRate() {
      sampleRate = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'ratio' field */
    public java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.List<java.lang.Double>>>> getRatio() {
      return ratio;
    }
    
    /** Sets the value of the 'ratio' field */
    public edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder setRatio(java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.List<java.lang.Double>>>> value) {
      validate(fields()[3], value);
      this.ratio = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'ratio' field has been set */
    public boolean hasRatio() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'ratio' field */
    public edu.berkeley.path.model_elements_base.SplitRatioProfile.Builder clearRatio() {
      ratio = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public SplitRatioProfile build() {
      try {
        SplitRatioProfile record = new SplitRatioProfile();
        record.destinationNetworkId = fieldSetFlags()[0] ? this.destinationNetworkId : (java.lang.String) defaultValue(fields()[0]);
        record.startTime = fieldSetFlags()[1] ? this.startTime : (java.lang.Double) defaultValue(fields()[1]);
        record.sampleRate = fieldSetFlags()[2] ? this.sampleRate : (java.lang.Double) defaultValue(fields()[2]);
        record.ratio = fieldSetFlags()[3] ? this.ratio : (java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.List<java.lang.Double>>>>) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
