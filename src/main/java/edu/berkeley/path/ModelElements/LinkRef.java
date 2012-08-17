/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.ModelElements;  
@SuppressWarnings("all")
public class LinkRef extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LinkRef\",\"namespace\":\"edu.berkeley.path.ModelElements\",\"fields\":[{\"name\":\"linkId\",\"type\":\"string\"}]}");
  @Deprecated public java.lang.CharSequence linkId;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return linkId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: linkId = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'linkId' field.
   */
  public java.lang.CharSequence getLinkId() {
    return linkId;
  }

  /**
   * Sets the value of the 'linkId' field.
   * @param value the value to set.
   */
  public void setLinkId(java.lang.CharSequence value) {
    this.linkId = value;
  }

  /** Creates a new LinkRef RecordBuilder */
  public static edu.berkeley.path.ModelElements.LinkRef.Builder newBuilder() {
    return new edu.berkeley.path.ModelElements.LinkRef.Builder();
  }
  
  /** Creates a new LinkRef RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.ModelElements.LinkRef.Builder newBuilder(edu.berkeley.path.ModelElements.LinkRef.Builder other) {
    return new edu.berkeley.path.ModelElements.LinkRef.Builder(other);
  }
  
  /** Creates a new LinkRef RecordBuilder by copying an existing LinkRef instance */
  public static edu.berkeley.path.ModelElements.LinkRef.Builder newBuilder(edu.berkeley.path.ModelElements.LinkRef other) {
    return new edu.berkeley.path.ModelElements.LinkRef.Builder(other);
  }
  
  /**
   * RecordBuilder for LinkRef instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LinkRef>
    implements org.apache.avro.data.RecordBuilder<LinkRef> {

    private java.lang.CharSequence linkId;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.ModelElements.LinkRef.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.ModelElements.LinkRef.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing LinkRef instance */
    private Builder(edu.berkeley.path.ModelElements.LinkRef other) {
            super(edu.berkeley.path.ModelElements.LinkRef.SCHEMA$);
      if (isValidValue(fields()[0], other.linkId)) {
        this.linkId = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.linkId);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'linkId' field */
    public java.lang.CharSequence getLinkId() {
      return linkId;
    }
    
    /** Sets the value of the 'linkId' field */
    public edu.berkeley.path.ModelElements.LinkRef.Builder setLinkId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.linkId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'linkId' field has been set */
    public boolean hasLinkId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'linkId' field */
    public edu.berkeley.path.ModelElements.LinkRef.Builder clearLinkId() {
      linkId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public LinkRef build() {
      try {
        LinkRef record = new LinkRef();
        record.linkId = fieldSetFlags()[0] ? this.linkId : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
