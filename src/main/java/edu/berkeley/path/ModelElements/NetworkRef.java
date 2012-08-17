/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.ModelElements;  
@SuppressWarnings("all")
public class NetworkRef extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"NetworkRef\",\"namespace\":\"edu.berkeley.path.ModelElements\",\"fields\":[{\"name\":\"networkId\",\"type\":\"string\"}]}");
  @Deprecated public java.lang.CharSequence networkId;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return networkId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: networkId = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'networkId' field.
   */
  public java.lang.CharSequence getNetworkId() {
    return networkId;
  }

  /**
   * Sets the value of the 'networkId' field.
   * @param value the value to set.
   */
  public void setNetworkId(java.lang.CharSequence value) {
    this.networkId = value;
  }

  /** Creates a new NetworkRef RecordBuilder */
  public static edu.berkeley.path.ModelElements.NetworkRef.Builder newBuilder() {
    return new edu.berkeley.path.ModelElements.NetworkRef.Builder();
  }
  
  /** Creates a new NetworkRef RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.ModelElements.NetworkRef.Builder newBuilder(edu.berkeley.path.ModelElements.NetworkRef.Builder other) {
    return new edu.berkeley.path.ModelElements.NetworkRef.Builder(other);
  }
  
  /** Creates a new NetworkRef RecordBuilder by copying an existing NetworkRef instance */
  public static edu.berkeley.path.ModelElements.NetworkRef.Builder newBuilder(edu.berkeley.path.ModelElements.NetworkRef other) {
    return new edu.berkeley.path.ModelElements.NetworkRef.Builder(other);
  }
  
  /**
   * RecordBuilder for NetworkRef instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<NetworkRef>
    implements org.apache.avro.data.RecordBuilder<NetworkRef> {

    private java.lang.CharSequence networkId;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.ModelElements.NetworkRef.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.ModelElements.NetworkRef.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing NetworkRef instance */
    private Builder(edu.berkeley.path.ModelElements.NetworkRef other) {
            super(edu.berkeley.path.ModelElements.NetworkRef.SCHEMA$);
      if (isValidValue(fields()[0], other.networkId)) {
        this.networkId = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.networkId);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'networkId' field */
    public java.lang.CharSequence getNetworkId() {
      return networkId;
    }
    
    /** Sets the value of the 'networkId' field */
    public edu.berkeley.path.ModelElements.NetworkRef.Builder setNetworkId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.networkId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'networkId' field has been set */
    public boolean hasNetworkId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'networkId' field */
    public edu.berkeley.path.ModelElements.NetworkRef.Builder clearNetworkId() {
      networkId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public NetworkRef build() {
      try {
        NetworkRef record = new NetworkRef();
        record.networkId = fieldSetFlags()[0] ? this.networkId : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
