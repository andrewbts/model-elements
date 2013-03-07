/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** * State of ensemble CTMs in an ordered list. */
public class FreewayCTMEnsembleState extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FreewayCTMEnsembleState\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* State of ensemble CTMs in an ordered list.\",\"fields\":[{\"name\":\"ensembleState\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FreewayCTMState\",\"doc\":\"* State of entire CTM, comprising:\\n   * state of each link,\\n   * state of each origin queue, and\\n   * optionally the in- and out-flows of each link.\",\"fields\":[{\"name\":\"linkState\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"FreewayLinkState\",\"doc\":\"* State of one link at one time.\\n   *\\n   * May contain density, velocity, or both.\",\"fields\":[{\"name\":\"density\",\"type\":[\"double\",\"null\"]},{\"name\":\"velocity\",\"type\":[\"double\",\"null\"]}]},\"avro.java.string\":\"String\"},\"doc\":\"map key is link id\"},{\"name\":\"queueLength\",\"type\":{\"type\":\"map\",\"values\":\"double\",\"avro.java.string\":\"String\"},\"doc\":\"map key is origin link id\"},{\"name\":\"linkFlowState\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"FreewayLinkFlowState\",\"doc\":\"* In- and out-flow state of one link at one time.\\n   *\\n   * The in- and out-flows are a quantity of interest computed by a CTM,\\n   * though not needed for either estimation of future time steps of a CTM.\",\"fields\":[{\"name\":\"inFlow\",\"type\":\"double\"},{\"name\":\"outFlow\",\"type\":\"double\"}]},\"avro.java.string\":\"String\"}],\"doc\":\"map key is link id\"}]}},\"doc\":\"one entry per CTM\"},{\"name\":\"t\",\"type\":{\"type\":\"record\",\"name\":\"DateTime\",\"doc\":\"milliseconds, absolute, since epoch, utc\",\"fields\":[{\"name\":\"milliseconds\",\"type\":\"long\"}]}},{\"name\":\"quality\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"double\",\"avro.java.string\":\"String\"}],\"doc\":\"map key is link id\\n     *\\n     * used by FreewayReporterBlock?\"}]}");
  /** one entry per CTM */
  @Deprecated public java.util.List<edu.berkeley.path.model_elements_base.FreewayCTMState> ensembleState;
  @Deprecated public edu.berkeley.path.model_elements_base.DateTime t;
  /** map key is link id
     *
     * used by FreewayReporterBlock? */
  @Deprecated public java.util.Map<java.lang.String,java.lang.Double> quality;

  /**
   * Default constructor.
   */
  public FreewayCTMEnsembleState() {}

  /**
   * All-args constructor.
   */
  public FreewayCTMEnsembleState(java.util.List<edu.berkeley.path.model_elements_base.FreewayCTMState> ensembleState, edu.berkeley.path.model_elements_base.DateTime t, java.util.Map<java.lang.String,java.lang.Double> quality) {
    this.ensembleState = ensembleState;
    this.t = t;
    this.quality = quality;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ensembleState;
    case 1: return t;
    case 2: return quality;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ensembleState = (java.util.List<edu.berkeley.path.model_elements_base.FreewayCTMState>)value$; break;
    case 1: t = (edu.berkeley.path.model_elements_base.DateTime)value$; break;
    case 2: quality = (java.util.Map<java.lang.String,java.lang.Double>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'ensembleState' field.
   * one entry per CTM   */
  public java.util.List<edu.berkeley.path.model_elements_base.FreewayCTMState> getEnsembleState() {
    return ensembleState;
  }

  /**
   * Sets the value of the 'ensembleState' field.
   * one entry per CTM   * @param value the value to set.
   */
  public void setEnsembleState(java.util.List<edu.berkeley.path.model_elements_base.FreewayCTMState> value) {
    this.ensembleState = value;
  }

  /**
   * Gets the value of the 't' field.
   */
  public edu.berkeley.path.model_elements_base.DateTime getT() {
    return t;
  }

  /**
   * Sets the value of the 't' field.
   * @param value the value to set.
   */
  public void setT(edu.berkeley.path.model_elements_base.DateTime value) {
    this.t = value;
  }

  /**
   * Gets the value of the 'quality' field.
   * map key is link id
     *
     * used by FreewayReporterBlock?   */
  public java.util.Map<java.lang.String,java.lang.Double> getQuality() {
    return quality;
  }

  /**
   * Sets the value of the 'quality' field.
   * map key is link id
     *
     * used by FreewayReporterBlock?   * @param value the value to set.
   */
  public void setQuality(java.util.Map<java.lang.String,java.lang.Double> value) {
    this.quality = value;
  }

  /** Creates a new FreewayCTMEnsembleState RecordBuilder */
  public static edu.berkeley.path.model_elements_base.FreewayCTMEnsembleState.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.FreewayCTMEnsembleState.Builder();
  }
  
  /** Creates a new FreewayCTMEnsembleState RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.FreewayCTMEnsembleState.Builder newBuilder(edu.berkeley.path.model_elements_base.FreewayCTMEnsembleState.Builder other) {
    return new edu.berkeley.path.model_elements_base.FreewayCTMEnsembleState.Builder(other);
  }
  
  /** Creates a new FreewayCTMEnsembleState RecordBuilder by copying an existing FreewayCTMEnsembleState instance */
  public static edu.berkeley.path.model_elements_base.FreewayCTMEnsembleState.Builder newBuilder(edu.berkeley.path.model_elements_base.FreewayCTMEnsembleState other) {
    return new edu.berkeley.path.model_elements_base.FreewayCTMEnsembleState.Builder(other);
  }
  
  /**
   * RecordBuilder for FreewayCTMEnsembleState instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FreewayCTMEnsembleState>
    implements org.apache.avro.data.RecordBuilder<FreewayCTMEnsembleState> {

    private java.util.List<edu.berkeley.path.model_elements_base.FreewayCTMState> ensembleState;
    private edu.berkeley.path.model_elements_base.DateTime t;
    private java.util.Map<java.lang.String,java.lang.Double> quality;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.FreewayCTMEnsembleState.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.FreewayCTMEnsembleState.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing FreewayCTMEnsembleState instance */
    private Builder(edu.berkeley.path.model_elements_base.FreewayCTMEnsembleState other) {
            super(edu.berkeley.path.model_elements_base.FreewayCTMEnsembleState.SCHEMA$);
      if (isValidValue(fields()[0], other.ensembleState)) {
        this.ensembleState = (java.util.List<edu.berkeley.path.model_elements_base.FreewayCTMState>) data().deepCopy(fields()[0].schema(), other.ensembleState);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.t)) {
        this.t = (edu.berkeley.path.model_elements_base.DateTime) data().deepCopy(fields()[1].schema(), other.t);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.quality)) {
        this.quality = (java.util.Map<java.lang.String,java.lang.Double>) data().deepCopy(fields()[2].schema(), other.quality);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'ensembleState' field */
    public java.util.List<edu.berkeley.path.model_elements_base.FreewayCTMState> getEnsembleState() {
      return ensembleState;
    }
    
    /** Sets the value of the 'ensembleState' field */
    public edu.berkeley.path.model_elements_base.FreewayCTMEnsembleState.Builder setEnsembleState(java.util.List<edu.berkeley.path.model_elements_base.FreewayCTMState> value) {
      validate(fields()[0], value);
      this.ensembleState = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'ensembleState' field has been set */
    public boolean hasEnsembleState() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'ensembleState' field */
    public edu.berkeley.path.model_elements_base.FreewayCTMEnsembleState.Builder clearEnsembleState() {
      ensembleState = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 't' field */
    public edu.berkeley.path.model_elements_base.DateTime getT() {
      return t;
    }
    
    /** Sets the value of the 't' field */
    public edu.berkeley.path.model_elements_base.FreewayCTMEnsembleState.Builder setT(edu.berkeley.path.model_elements_base.DateTime value) {
      validate(fields()[1], value);
      this.t = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 't' field has been set */
    public boolean hasT() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 't' field */
    public edu.berkeley.path.model_elements_base.FreewayCTMEnsembleState.Builder clearT() {
      t = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'quality' field */
    public java.util.Map<java.lang.String,java.lang.Double> getQuality() {
      return quality;
    }
    
    /** Sets the value of the 'quality' field */
    public edu.berkeley.path.model_elements_base.FreewayCTMEnsembleState.Builder setQuality(java.util.Map<java.lang.String,java.lang.Double> value) {
      validate(fields()[2], value);
      this.quality = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'quality' field has been set */
    public boolean hasQuality() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'quality' field */
    public edu.berkeley.path.model_elements_base.FreewayCTMEnsembleState.Builder clearQuality() {
      quality = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public FreewayCTMEnsembleState build() {
      try {
        FreewayCTMEnsembleState record = new FreewayCTMEnsembleState();
        record.ensembleState = fieldSetFlags()[0] ? this.ensembleState : (java.util.List<edu.berkeley.path.model_elements_base.FreewayCTMState>) defaultValue(fields()[0]);
        record.t = fieldSetFlags()[1] ? this.t : (edu.berkeley.path.model_elements_base.DateTime) defaultValue(fields()[1]);
        record.quality = fieldSetFlags()[2] ? this.quality : (java.util.Map<java.lang.String,java.lang.Double>) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
