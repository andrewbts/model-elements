/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
public class Link extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Link\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"laneCount\",\"type\":[\"null\",\"double\"]},{\"name\":\"length\",\"type\":[\"null\",\"double\"]},{\"name\":\"laneOffset\",\"type\":[\"null\",\"int\"],\"doc\":\"* index of the first lane of this link in case the road is\\n     * divided into paralell links.\"},{\"name\":\"speedLimit\",\"type\":[\"null\",\"double\"]},{\"name\":\"detailLevel\",\"type\":[\"null\",\"int\"]},{\"name\":\"beginId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"endId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"points\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Point\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\",\"default\":0.0},{\"name\":\"longitude\",\"type\":\"double\",\"default\":0.0}]}}}]}");
  @Deprecated public java.lang.String id;
  @Deprecated public java.lang.String name;
  @Deprecated public java.lang.String type;
  @Deprecated public java.lang.Double laneCount;
  @Deprecated public java.lang.Double length;
  /** * index of the first lane of this link in case the road is
     * divided into paralell links. */
  @Deprecated public java.lang.Integer laneOffset;
  @Deprecated public java.lang.Double speedLimit;
  @Deprecated public java.lang.Integer detailLevel;
  @Deprecated public java.lang.String beginId;
  @Deprecated public java.lang.String endId;
  @Deprecated public java.util.List<edu.berkeley.path.model_elements_base.Point> points;

  /**
   * Default constructor.
   */
  public Link() {}

  /**
   * All-args constructor.
   */
  public Link(java.lang.String id, java.lang.String name, java.lang.String type, java.lang.Double laneCount, java.lang.Double length, java.lang.Integer laneOffset, java.lang.Double speedLimit, java.lang.Integer detailLevel, java.lang.String beginId, java.lang.String endId, java.util.List<edu.berkeley.path.model_elements_base.Point> points) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.laneCount = laneCount;
    this.length = length;
    this.laneOffset = laneOffset;
    this.speedLimit = speedLimit;
    this.detailLevel = detailLevel;
    this.beginId = beginId;
    this.endId = endId;
    this.points = points;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return type;
    case 3: return laneCount;
    case 4: return length;
    case 5: return laneOffset;
    case 6: return speedLimit;
    case 7: return detailLevel;
    case 8: return beginId;
    case 9: return endId;
    case 10: return points;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.String)value$; break;
    case 1: name = (java.lang.String)value$; break;
    case 2: type = (java.lang.String)value$; break;
    case 3: laneCount = (java.lang.Double)value$; break;
    case 4: length = (java.lang.Double)value$; break;
    case 5: laneOffset = (java.lang.Integer)value$; break;
    case 6: speedLimit = (java.lang.Double)value$; break;
    case 7: detailLevel = (java.lang.Integer)value$; break;
    case 8: beginId = (java.lang.String)value$; break;
    case 9: endId = (java.lang.String)value$; break;
    case 10: points = (java.util.List<edu.berkeley.path.model_elements_base.Point>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'type' field.
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.String value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'laneCount' field.
   */
  public java.lang.Double getLaneCount() {
    return laneCount;
  }

  /**
   * Sets the value of the 'laneCount' field.
   * @param value the value to set.
   */
  public void setLaneCount(java.lang.Double value) {
    this.laneCount = value;
  }

  /**
   * Gets the value of the 'length' field.
   */
  public java.lang.Double getLength() {
    return length;
  }

  /**
   * Sets the value of the 'length' field.
   * @param value the value to set.
   */
  public void setLength(java.lang.Double value) {
    this.length = value;
  }

  /**
   * Gets the value of the 'laneOffset' field.
   * * index of the first lane of this link in case the road is
     * divided into paralell links.   */
  public java.lang.Integer getLaneOffset() {
    return laneOffset;
  }

  /**
   * Sets the value of the 'laneOffset' field.
   * * index of the first lane of this link in case the road is
     * divided into paralell links.   * @param value the value to set.
   */
  public void setLaneOffset(java.lang.Integer value) {
    this.laneOffset = value;
  }

  /**
   * Gets the value of the 'speedLimit' field.
   */
  public java.lang.Double getSpeedLimit() {
    return speedLimit;
  }

  /**
   * Sets the value of the 'speedLimit' field.
   * @param value the value to set.
   */
  public void setSpeedLimit(java.lang.Double value) {
    this.speedLimit = value;
  }

  /**
   * Gets the value of the 'detailLevel' field.
   */
  public java.lang.Integer getDetailLevel() {
    return detailLevel;
  }

  /**
   * Sets the value of the 'detailLevel' field.
   * @param value the value to set.
   */
  public void setDetailLevel(java.lang.Integer value) {
    this.detailLevel = value;
  }

  /**
   * Gets the value of the 'beginId' field.
   */
  public java.lang.String getBeginId() {
    return beginId;
  }

  /**
   * Sets the value of the 'beginId' field.
   * @param value the value to set.
   */
  public void setBeginId(java.lang.String value) {
    this.beginId = value;
  }

  /**
   * Gets the value of the 'endId' field.
   */
  public java.lang.String getEndId() {
    return endId;
  }

  /**
   * Sets the value of the 'endId' field.
   * @param value the value to set.
   */
  public void setEndId(java.lang.String value) {
    this.endId = value;
  }

  /**
   * Gets the value of the 'points' field.
   */
  public java.util.List<edu.berkeley.path.model_elements_base.Point> getPoints() {
    return points;
  }

  /**
   * Sets the value of the 'points' field.
   * @param value the value to set.
   */
  public void setPoints(java.util.List<edu.berkeley.path.model_elements_base.Point> value) {
    this.points = value;
  }

  /** Creates a new Link RecordBuilder */
  public static edu.berkeley.path.model_elements_base.Link.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.Link.Builder();
  }
  
  /** Creates a new Link RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.Link.Builder newBuilder(edu.berkeley.path.model_elements_base.Link.Builder other) {
    return new edu.berkeley.path.model_elements_base.Link.Builder(other);
  }
  
  /** Creates a new Link RecordBuilder by copying an existing Link instance */
  public static edu.berkeley.path.model_elements_base.Link.Builder newBuilder(edu.berkeley.path.model_elements_base.Link other) {
    return new edu.berkeley.path.model_elements_base.Link.Builder(other);
  }
  
  /**
   * RecordBuilder for Link instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Link>
    implements org.apache.avro.data.RecordBuilder<Link> {

    private java.lang.String id;
    private java.lang.String name;
    private java.lang.String type;
    private java.lang.Double laneCount;
    private java.lang.Double length;
    private java.lang.Integer laneOffset;
    private java.lang.Double speedLimit;
    private java.lang.Integer detailLevel;
    private java.lang.String beginId;
    private java.lang.String endId;
    private java.util.List<edu.berkeley.path.model_elements_base.Point> points;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.Link.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.Link.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Link instance */
    private Builder(edu.berkeley.path.model_elements_base.Link other) {
            super(edu.berkeley.path.model_elements_base.Link.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = (java.lang.String) data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = (java.lang.String) data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = (java.lang.String) data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.laneCount)) {
        this.laneCount = (java.lang.Double) data().deepCopy(fields()[3].schema(), other.laneCount);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.length)) {
        this.length = (java.lang.Double) data().deepCopy(fields()[4].schema(), other.length);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.laneOffset)) {
        this.laneOffset = (java.lang.Integer) data().deepCopy(fields()[5].schema(), other.laneOffset);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.speedLimit)) {
        this.speedLimit = (java.lang.Double) data().deepCopy(fields()[6].schema(), other.speedLimit);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.detailLevel)) {
        this.detailLevel = (java.lang.Integer) data().deepCopy(fields()[7].schema(), other.detailLevel);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.beginId)) {
        this.beginId = (java.lang.String) data().deepCopy(fields()[8].schema(), other.beginId);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.endId)) {
        this.endId = (java.lang.String) data().deepCopy(fields()[9].schema(), other.endId);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.points)) {
        this.points = (java.util.List<edu.berkeley.path.model_elements_base.Point>) data().deepCopy(fields()[10].schema(), other.points);
        fieldSetFlags()[10] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.String getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.Link.Builder setId(java.lang.String value) {
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
    public edu.berkeley.path.model_elements_base.Link.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.String getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public edu.berkeley.path.model_elements_base.Link.Builder setName(java.lang.String value) {
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
    public edu.berkeley.path.model_elements_base.Link.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'type' field */
    public java.lang.String getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public edu.berkeley.path.model_elements_base.Link.Builder setType(java.lang.String value) {
      validate(fields()[2], value);
      this.type = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'type' field */
    public edu.berkeley.path.model_elements_base.Link.Builder clearType() {
      type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'laneCount' field */
    public java.lang.Double getLaneCount() {
      return laneCount;
    }
    
    /** Sets the value of the 'laneCount' field */
    public edu.berkeley.path.model_elements_base.Link.Builder setLaneCount(java.lang.Double value) {
      validate(fields()[3], value);
      this.laneCount = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'laneCount' field has been set */
    public boolean hasLaneCount() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'laneCount' field */
    public edu.berkeley.path.model_elements_base.Link.Builder clearLaneCount() {
      laneCount = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'length' field */
    public java.lang.Double getLength() {
      return length;
    }
    
    /** Sets the value of the 'length' field */
    public edu.berkeley.path.model_elements_base.Link.Builder setLength(java.lang.Double value) {
      validate(fields()[4], value);
      this.length = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'length' field has been set */
    public boolean hasLength() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'length' field */
    public edu.berkeley.path.model_elements_base.Link.Builder clearLength() {
      length = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'laneOffset' field */
    public java.lang.Integer getLaneOffset() {
      return laneOffset;
    }
    
    /** Sets the value of the 'laneOffset' field */
    public edu.berkeley.path.model_elements_base.Link.Builder setLaneOffset(java.lang.Integer value) {
      validate(fields()[5], value);
      this.laneOffset = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'laneOffset' field has been set */
    public boolean hasLaneOffset() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'laneOffset' field */
    public edu.berkeley.path.model_elements_base.Link.Builder clearLaneOffset() {
      laneOffset = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'speedLimit' field */
    public java.lang.Double getSpeedLimit() {
      return speedLimit;
    }
    
    /** Sets the value of the 'speedLimit' field */
    public edu.berkeley.path.model_elements_base.Link.Builder setSpeedLimit(java.lang.Double value) {
      validate(fields()[6], value);
      this.speedLimit = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'speedLimit' field has been set */
    public boolean hasSpeedLimit() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'speedLimit' field */
    public edu.berkeley.path.model_elements_base.Link.Builder clearSpeedLimit() {
      speedLimit = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'detailLevel' field */
    public java.lang.Integer getDetailLevel() {
      return detailLevel;
    }
    
    /** Sets the value of the 'detailLevel' field */
    public edu.berkeley.path.model_elements_base.Link.Builder setDetailLevel(java.lang.Integer value) {
      validate(fields()[7], value);
      this.detailLevel = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'detailLevel' field has been set */
    public boolean hasDetailLevel() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'detailLevel' field */
    public edu.berkeley.path.model_elements_base.Link.Builder clearDetailLevel() {
      detailLevel = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'beginId' field */
    public java.lang.String getBeginId() {
      return beginId;
    }
    
    /** Sets the value of the 'beginId' field */
    public edu.berkeley.path.model_elements_base.Link.Builder setBeginId(java.lang.String value) {
      validate(fields()[8], value);
      this.beginId = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'beginId' field has been set */
    public boolean hasBeginId() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'beginId' field */
    public edu.berkeley.path.model_elements_base.Link.Builder clearBeginId() {
      beginId = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'endId' field */
    public java.lang.String getEndId() {
      return endId;
    }
    
    /** Sets the value of the 'endId' field */
    public edu.berkeley.path.model_elements_base.Link.Builder setEndId(java.lang.String value) {
      validate(fields()[9], value);
      this.endId = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'endId' field has been set */
    public boolean hasEndId() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'endId' field */
    public edu.berkeley.path.model_elements_base.Link.Builder clearEndId() {
      endId = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'points' field */
    public java.util.List<edu.berkeley.path.model_elements_base.Point> getPoints() {
      return points;
    }
    
    /** Sets the value of the 'points' field */
    public edu.berkeley.path.model_elements_base.Link.Builder setPoints(java.util.List<edu.berkeley.path.model_elements_base.Point> value) {
      validate(fields()[10], value);
      this.points = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'points' field has been set */
    public boolean hasPoints() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'points' field */
    public edu.berkeley.path.model_elements_base.Link.Builder clearPoints() {
      points = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    @Override
    public Link build() {
      try {
        Link record = new Link();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.String) defaultValue(fields()[1]);
        record.type = fieldSetFlags()[2] ? this.type : (java.lang.String) defaultValue(fields()[2]);
        record.laneCount = fieldSetFlags()[3] ? this.laneCount : (java.lang.Double) defaultValue(fields()[3]);
        record.length = fieldSetFlags()[4] ? this.length : (java.lang.Double) defaultValue(fields()[4]);
        record.laneOffset = fieldSetFlags()[5] ? this.laneOffset : (java.lang.Integer) defaultValue(fields()[5]);
        record.speedLimit = fieldSetFlags()[6] ? this.speedLimit : (java.lang.Double) defaultValue(fields()[6]);
        record.detailLevel = fieldSetFlags()[7] ? this.detailLevel : (java.lang.Integer) defaultValue(fields()[7]);
        record.beginId = fieldSetFlags()[8] ? this.beginId : (java.lang.String) defaultValue(fields()[8]);
        record.endId = fieldSetFlags()[9] ? this.endId : (java.lang.String) defaultValue(fields()[9]);
        record.points = fieldSetFlags()[10] ? this.points : (java.util.List<edu.berkeley.path.model_elements_base.Point>) defaultValue(fields()[10]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
