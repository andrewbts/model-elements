/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** * Density on each link at a point in time */
public class DensityMap extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DensityMap\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* Density on each link at a point in time\",\"fields\":[{\"name\":\"vehiclesPerMeter\",\"type\":{\"type\":\"map\",\"values\":\"double\",\"avro.java.string\":\"String\"},\"doc\":\"map key is linkId\",\"default\":{}}]}");
  /** map key is linkId */
  @Deprecated public java.util.Map<java.lang.String,java.lang.Double> vehiclesPerMeter;

  /**
   * Default constructor.
   */
  public DensityMap() {}

  /**
   * All-args constructor.
   */
  public DensityMap(java.util.Map<java.lang.String,java.lang.Double> vehiclesPerMeter) {
    this.vehiclesPerMeter = vehiclesPerMeter;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return vehiclesPerMeter;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: vehiclesPerMeter = (java.util.Map<java.lang.String,java.lang.Double>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'vehiclesPerMeter' field.
   * map key is linkId   */
  public java.util.Map<java.lang.String,java.lang.Double> getVehiclesPerMeter() {
    return vehiclesPerMeter;
  }

  /**
   * Sets the value of the 'vehiclesPerMeter' field.
   * map key is linkId   * @param value the value to set.
   */
  public void setVehiclesPerMeter(java.util.Map<java.lang.String,java.lang.Double> value) {
    this.vehiclesPerMeter = value;
  }

  /** Creates a new DensityMap RecordBuilder */
  public static edu.berkeley.path.model_elements_base.DensityMap.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.DensityMap.Builder();
  }
  
  /** Creates a new DensityMap RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.DensityMap.Builder newBuilder(edu.berkeley.path.model_elements_base.DensityMap.Builder other) {
    return new edu.berkeley.path.model_elements_base.DensityMap.Builder(other);
  }
  
  /** Creates a new DensityMap RecordBuilder by copying an existing DensityMap instance */
  public static edu.berkeley.path.model_elements_base.DensityMap.Builder newBuilder(edu.berkeley.path.model_elements_base.DensityMap other) {
    return new edu.berkeley.path.model_elements_base.DensityMap.Builder(other);
  }
  
  /**
   * RecordBuilder for DensityMap instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DensityMap>
    implements org.apache.avro.data.RecordBuilder<DensityMap> {

    private java.util.Map<java.lang.String,java.lang.Double> vehiclesPerMeter;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.DensityMap.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.DensityMap.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing DensityMap instance */
    private Builder(edu.berkeley.path.model_elements_base.DensityMap other) {
            super(edu.berkeley.path.model_elements_base.DensityMap.SCHEMA$);
      if (isValidValue(fields()[0], other.vehiclesPerMeter)) {
        this.vehiclesPerMeter = (java.util.Map<java.lang.String,java.lang.Double>) data().deepCopy(fields()[0].schema(), other.vehiclesPerMeter);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'vehiclesPerMeter' field */
    public java.util.Map<java.lang.String,java.lang.Double> getVehiclesPerMeter() {
      return vehiclesPerMeter;
    }
    
    /** Sets the value of the 'vehiclesPerMeter' field */
    public edu.berkeley.path.model_elements_base.DensityMap.Builder setVehiclesPerMeter(java.util.Map<java.lang.String,java.lang.Double> value) {
      validate(fields()[0], value);
      this.vehiclesPerMeter = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'vehiclesPerMeter' field has been set */
    public boolean hasVehiclesPerMeter() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'vehiclesPerMeter' field */
    public edu.berkeley.path.model_elements_base.DensityMap.Builder clearVehiclesPerMeter() {
      vehiclesPerMeter = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public DensityMap build() {
      try {
        DensityMap record = new DensityMap();
        record.vehiclesPerMeter = fieldSetFlags()[0] ? this.vehiclesPerMeter : (java.util.Map<java.lang.String,java.lang.Double>) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
