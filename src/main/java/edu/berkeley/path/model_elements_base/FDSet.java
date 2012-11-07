/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** * Specification of Fundamental diagram time series across one or more
   * networks, for use in a scenario. */
public class FDSet extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FDSet\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* Specification of Fundamental diagram time series across one or more\\n   * networks, for use in a scenario.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"type\",\"type\":{\"type\":\"record\",\"name\":\"FDType\",\"doc\":\"* Referenced by FDSet to indicate the way the contained FDs should\\n   * be interpreted.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]}]}},{\"name\":\"profile\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"FDProfile\",\"doc\":\"* FD time series at a link. The link ID is not stored\\n   * in this record, but as the map key in the FDSet.profile.\",\"fields\":[{\"name\":\"startTime\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 0\",\"default\":0.0},{\"name\":\"sampleRate\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 300 seconds\",\"default\":300.0},{\"name\":\"fd\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FD\",\"doc\":\"* Fundamental diagram parameters on one link at one time.\",\"fields\":[{\"name\":\"freeFlowSpeed\",\"type\":\"double\"},{\"name\":\"criticalSpeed\",\"type\":\"double\"},{\"name\":\"congestionWaveSpeed\",\"type\":\"double\"},{\"name\":\"capacity\",\"type\":\"double\"},{\"name\":\"jamDensity\",\"type\":\"double\"},{\"name\":\"capacityDrop\",\"type\":\"double\"},{\"name\":\"freeFlowSpeedStd\",\"type\":\"double\"},{\"name\":\"congestionWaveSpeedStd\",\"type\":\"double\"},{\"name\":\"capacityStd\",\"type\":\"double\"}]}},\"doc\":\"* time series of FDs;\\n     * array index is index in time series (\\\"DIAG_ORDER\\\" in db)\"}]}},\"doc\":\"* map key is linkId\"}]}");
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence description;
  @Deprecated public edu.berkeley.path.model_elements_base.FDType type;
  /** * map key is linkId */
  @Deprecated public java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.FDProfile> profile;

  /**
   * Default constructor.
   */
  public FDSet() {}

  /**
   * All-args constructor.
   */
  public FDSet(java.lang.CharSequence id, java.lang.CharSequence name, java.lang.CharSequence description, edu.berkeley.path.model_elements_base.FDType type, java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.FDProfile> profile) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.type = type;
    this.profile = profile;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return description;
    case 3: return type;
    case 4: return profile;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: description = (java.lang.CharSequence)value$; break;
    case 3: type = (edu.berkeley.path.model_elements_base.FDType)value$; break;
    case 4: profile = (java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.FDProfile>)value$; break;
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
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'description' field.
   */
  public java.lang.CharSequence getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'type' field.
   */
  public edu.berkeley.path.model_elements_base.FDType getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(edu.berkeley.path.model_elements_base.FDType value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'profile' field.
   * * map key is linkId   */
  public java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.FDProfile> getProfile() {
    return profile;
  }

  /**
   * Sets the value of the 'profile' field.
   * * map key is linkId   * @param value the value to set.
   */
  public void setProfile(java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.FDProfile> value) {
    this.profile = value;
  }

  /** Creates a new FDSet RecordBuilder */
  public static edu.berkeley.path.model_elements_base.FDSet.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.FDSet.Builder();
  }
  
  /** Creates a new FDSet RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.FDSet.Builder newBuilder(edu.berkeley.path.model_elements_base.FDSet.Builder other) {
    return new edu.berkeley.path.model_elements_base.FDSet.Builder(other);
  }
  
  /** Creates a new FDSet RecordBuilder by copying an existing FDSet instance */
  public static edu.berkeley.path.model_elements_base.FDSet.Builder newBuilder(edu.berkeley.path.model_elements_base.FDSet other) {
    return new edu.berkeley.path.model_elements_base.FDSet.Builder(other);
  }
  
  /**
   * RecordBuilder for FDSet instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FDSet>
    implements org.apache.avro.data.RecordBuilder<FDSet> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private java.lang.CharSequence description;
    private edu.berkeley.path.model_elements_base.FDType type;
    private java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.FDProfile> profile;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.FDSet.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.FDSet.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing FDSet instance */
    private Builder(edu.berkeley.path.model_elements_base.FDSet other) {
            super(edu.berkeley.path.model_elements_base.FDSet.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = (java.lang.CharSequence) data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.type)) {
        this.type = (edu.berkeley.path.model_elements_base.FDType) data().deepCopy(fields()[3].schema(), other.type);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.profile)) {
        this.profile = (java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.FDProfile>) data().deepCopy(fields()[4].schema(), other.profile);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.FDSet.Builder setId(java.lang.CharSequence value) {
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
    public edu.berkeley.path.model_elements_base.FDSet.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public edu.berkeley.path.model_elements_base.FDSet.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'name' field */
    public edu.berkeley.path.model_elements_base.FDSet.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public java.lang.CharSequence getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public edu.berkeley.path.model_elements_base.FDSet.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.description = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'description' field has been set */
    public boolean hasDescription() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'description' field */
    public edu.berkeley.path.model_elements_base.FDSet.Builder clearDescription() {
      description = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'type' field */
    public edu.berkeley.path.model_elements_base.FDType getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public edu.berkeley.path.model_elements_base.FDSet.Builder setType(edu.berkeley.path.model_elements_base.FDType value) {
      validate(fields()[3], value);
      this.type = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'type' field */
    public edu.berkeley.path.model_elements_base.FDSet.Builder clearType() {
      type = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'profile' field */
    public java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.FDProfile> getProfile() {
      return profile;
    }
    
    /** Sets the value of the 'profile' field */
    public edu.berkeley.path.model_elements_base.FDSet.Builder setProfile(java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.FDProfile> value) {
      validate(fields()[4], value);
      this.profile = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'profile' field has been set */
    public boolean hasProfile() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'profile' field */
    public edu.berkeley.path.model_elements_base.FDSet.Builder clearProfile() {
      profile = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public FDSet build() {
      try {
        FDSet record = new FDSet();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.description = fieldSetFlags()[2] ? this.description : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.type = fieldSetFlags()[3] ? this.type : (edu.berkeley.path.model_elements_base.FDType) defaultValue(fields()[3]);
        record.profile = fieldSetFlags()[4] ? this.profile : (java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.FDProfile>) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}