/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.domain;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class event_history_record extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6906712195540706282L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"event_history_record\",\"namespace\":\"com.example.domain\",\"fields\":[{\"name\":\"event_processor\",\"type\":\"string\"},{\"name\":\"time_received\",\"type\":\"string\"},{\"name\":\"time_published\",\"type\":\"string\"},{\"name\":\"topic_published\",\"type\":\"string\"},{\"name\":\"error_code\",\"type\":\"int\"},{\"name\":\"error_message\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<event_history_record> ENCODER =
      new BinaryMessageEncoder<event_history_record>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<event_history_record> DECODER =
      new BinaryMessageDecoder<event_history_record>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<event_history_record> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<event_history_record> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<event_history_record> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<event_history_record>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this event_history_record to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a event_history_record from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a event_history_record instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static event_history_record fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence event_processor;
   private java.lang.CharSequence time_received;
   private java.lang.CharSequence time_published;
   private java.lang.CharSequence topic_published;
   private int error_code;
   private java.lang.CharSequence error_message;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public event_history_record() {}

  /**
   * All-args constructor.
   * @param event_processor The new value for event_processor
   * @param time_received The new value for time_received
   * @param time_published The new value for time_published
   * @param topic_published The new value for topic_published
   * @param error_code The new value for error_code
   * @param error_message The new value for error_message
   */
  public event_history_record(java.lang.CharSequence event_processor, java.lang.CharSequence time_received, java.lang.CharSequence time_published, java.lang.CharSequence topic_published, java.lang.Integer error_code, java.lang.CharSequence error_message) {
    this.event_processor = event_processor;
    this.time_received = time_received;
    this.time_published = time_published;
    this.topic_published = topic_published;
    this.error_code = error_code;
    this.error_message = error_message;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return event_processor;
    case 1: return time_received;
    case 2: return time_published;
    case 3: return topic_published;
    case 4: return error_code;
    case 5: return error_message;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: event_processor = (java.lang.CharSequence)value$; break;
    case 1: time_received = (java.lang.CharSequence)value$; break;
    case 2: time_published = (java.lang.CharSequence)value$; break;
    case 3: topic_published = (java.lang.CharSequence)value$; break;
    case 4: error_code = (java.lang.Integer)value$; break;
    case 5: error_message = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'event_processor' field.
   * @return The value of the 'event_processor' field.
   */
  public java.lang.CharSequence getEventProcessor() {
    return event_processor;
  }


  /**
   * Sets the value of the 'event_processor' field.
   * @param value the value to set.
   */
  public void setEventProcessor(java.lang.CharSequence value) {
    this.event_processor = value;
  }

  /**
   * Gets the value of the 'time_received' field.
   * @return The value of the 'time_received' field.
   */
  public java.lang.CharSequence getTimeReceived() {
    return time_received;
  }


  /**
   * Sets the value of the 'time_received' field.
   * @param value the value to set.
   */
  public void setTimeReceived(java.lang.CharSequence value) {
    this.time_received = value;
  }

  /**
   * Gets the value of the 'time_published' field.
   * @return The value of the 'time_published' field.
   */
  public java.lang.CharSequence getTimePublished() {
    return time_published;
  }


  /**
   * Sets the value of the 'time_published' field.
   * @param value the value to set.
   */
  public void setTimePublished(java.lang.CharSequence value) {
    this.time_published = value;
  }

  /**
   * Gets the value of the 'topic_published' field.
   * @return The value of the 'topic_published' field.
   */
  public java.lang.CharSequence getTopicPublished() {
    return topic_published;
  }


  /**
   * Sets the value of the 'topic_published' field.
   * @param value the value to set.
   */
  public void setTopicPublished(java.lang.CharSequence value) {
    this.topic_published = value;
  }

  /**
   * Gets the value of the 'error_code' field.
   * @return The value of the 'error_code' field.
   */
  public int getErrorCode() {
    return error_code;
  }


  /**
   * Sets the value of the 'error_code' field.
   * @param value the value to set.
   */
  public void setErrorCode(int value) {
    this.error_code = value;
  }

  /**
   * Gets the value of the 'error_message' field.
   * @return The value of the 'error_message' field.
   */
  public java.lang.CharSequence getErrorMessage() {
    return error_message;
  }


  /**
   * Sets the value of the 'error_message' field.
   * @param value the value to set.
   */
  public void setErrorMessage(java.lang.CharSequence value) {
    this.error_message = value;
  }

  /**
   * Creates a new event_history_record RecordBuilder.
   * @return A new event_history_record RecordBuilder
   */
  public static com.example.domain.event_history_record.Builder newBuilder() {
    return new com.example.domain.event_history_record.Builder();
  }

  /**
   * Creates a new event_history_record RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new event_history_record RecordBuilder
   */
  public static com.example.domain.event_history_record.Builder newBuilder(com.example.domain.event_history_record.Builder other) {
    if (other == null) {
      return new com.example.domain.event_history_record.Builder();
    } else {
      return new com.example.domain.event_history_record.Builder(other);
    }
  }

  /**
   * Creates a new event_history_record RecordBuilder by copying an existing event_history_record instance.
   * @param other The existing instance to copy.
   * @return A new event_history_record RecordBuilder
   */
  public static com.example.domain.event_history_record.Builder newBuilder(com.example.domain.event_history_record other) {
    if (other == null) {
      return new com.example.domain.event_history_record.Builder();
    } else {
      return new com.example.domain.event_history_record.Builder(other);
    }
  }

  /**
   * RecordBuilder for event_history_record instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<event_history_record>
    implements org.apache.avro.data.RecordBuilder<event_history_record> {

    private java.lang.CharSequence event_processor;
    private java.lang.CharSequence time_received;
    private java.lang.CharSequence time_published;
    private java.lang.CharSequence topic_published;
    private int error_code;
    private java.lang.CharSequence error_message;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.domain.event_history_record.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.event_processor)) {
        this.event_processor = data().deepCopy(fields()[0].schema(), other.event_processor);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.time_received)) {
        this.time_received = data().deepCopy(fields()[1].schema(), other.time_received);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.time_published)) {
        this.time_published = data().deepCopy(fields()[2].schema(), other.time_published);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.topic_published)) {
        this.topic_published = data().deepCopy(fields()[3].schema(), other.topic_published);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.error_code)) {
        this.error_code = data().deepCopy(fields()[4].schema(), other.error_code);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.error_message)) {
        this.error_message = data().deepCopy(fields()[5].schema(), other.error_message);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing event_history_record instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.domain.event_history_record other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.event_processor)) {
        this.event_processor = data().deepCopy(fields()[0].schema(), other.event_processor);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.time_received)) {
        this.time_received = data().deepCopy(fields()[1].schema(), other.time_received);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.time_published)) {
        this.time_published = data().deepCopy(fields()[2].schema(), other.time_published);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.topic_published)) {
        this.topic_published = data().deepCopy(fields()[3].schema(), other.topic_published);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.error_code)) {
        this.error_code = data().deepCopy(fields()[4].schema(), other.error_code);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.error_message)) {
        this.error_message = data().deepCopy(fields()[5].schema(), other.error_message);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'event_processor' field.
      * @return The value.
      */
    public java.lang.CharSequence getEventProcessor() {
      return event_processor;
    }


    /**
      * Sets the value of the 'event_processor' field.
      * @param value The value of 'event_processor'.
      * @return This builder.
      */
    public com.example.domain.event_history_record.Builder setEventProcessor(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.event_processor = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'event_processor' field has been set.
      * @return True if the 'event_processor' field has been set, false otherwise.
      */
    public boolean hasEventProcessor() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'event_processor' field.
      * @return This builder.
      */
    public com.example.domain.event_history_record.Builder clearEventProcessor() {
      event_processor = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'time_received' field.
      * @return The value.
      */
    public java.lang.CharSequence getTimeReceived() {
      return time_received;
    }


    /**
      * Sets the value of the 'time_received' field.
      * @param value The value of 'time_received'.
      * @return This builder.
      */
    public com.example.domain.event_history_record.Builder setTimeReceived(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.time_received = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'time_received' field has been set.
      * @return True if the 'time_received' field has been set, false otherwise.
      */
    public boolean hasTimeReceived() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'time_received' field.
      * @return This builder.
      */
    public com.example.domain.event_history_record.Builder clearTimeReceived() {
      time_received = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'time_published' field.
      * @return The value.
      */
    public java.lang.CharSequence getTimePublished() {
      return time_published;
    }


    /**
      * Sets the value of the 'time_published' field.
      * @param value The value of 'time_published'.
      * @return This builder.
      */
    public com.example.domain.event_history_record.Builder setTimePublished(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.time_published = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'time_published' field has been set.
      * @return True if the 'time_published' field has been set, false otherwise.
      */
    public boolean hasTimePublished() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'time_published' field.
      * @return This builder.
      */
    public com.example.domain.event_history_record.Builder clearTimePublished() {
      time_published = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'topic_published' field.
      * @return The value.
      */
    public java.lang.CharSequence getTopicPublished() {
      return topic_published;
    }


    /**
      * Sets the value of the 'topic_published' field.
      * @param value The value of 'topic_published'.
      * @return This builder.
      */
    public com.example.domain.event_history_record.Builder setTopicPublished(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.topic_published = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'topic_published' field has been set.
      * @return True if the 'topic_published' field has been set, false otherwise.
      */
    public boolean hasTopicPublished() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'topic_published' field.
      * @return This builder.
      */
    public com.example.domain.event_history_record.Builder clearTopicPublished() {
      topic_published = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'error_code' field.
      * @return The value.
      */
    public int getErrorCode() {
      return error_code;
    }


    /**
      * Sets the value of the 'error_code' field.
      * @param value The value of 'error_code'.
      * @return This builder.
      */
    public com.example.domain.event_history_record.Builder setErrorCode(int value) {
      validate(fields()[4], value);
      this.error_code = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'error_code' field has been set.
      * @return True if the 'error_code' field has been set, false otherwise.
      */
    public boolean hasErrorCode() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'error_code' field.
      * @return This builder.
      */
    public com.example.domain.event_history_record.Builder clearErrorCode() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'error_message' field.
      * @return The value.
      */
    public java.lang.CharSequence getErrorMessage() {
      return error_message;
    }


    /**
      * Sets the value of the 'error_message' field.
      * @param value The value of 'error_message'.
      * @return This builder.
      */
    public com.example.domain.event_history_record.Builder setErrorMessage(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.error_message = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'error_message' field has been set.
      * @return True if the 'error_message' field has been set, false otherwise.
      */
    public boolean hasErrorMessage() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'error_message' field.
      * @return This builder.
      */
    public com.example.domain.event_history_record.Builder clearErrorMessage() {
      error_message = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public event_history_record build() {
      try {
        event_history_record record = new event_history_record();
        record.event_processor = fieldSetFlags()[0] ? this.event_processor : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.time_received = fieldSetFlags()[1] ? this.time_received : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.time_published = fieldSetFlags()[2] ? this.time_published : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.topic_published = fieldSetFlags()[3] ? this.topic_published : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.error_code = fieldSetFlags()[4] ? this.error_code : (java.lang.Integer) defaultValue(fields()[4]);
        record.error_message = fieldSetFlags()[5] ? this.error_message : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<event_history_record>
    WRITER$ = (org.apache.avro.io.DatumWriter<event_history_record>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<event_history_record>
    READER$ = (org.apache.avro.io.DatumReader<event_history_record>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.event_processor);

    out.writeString(this.time_received);

    out.writeString(this.time_published);

    out.writeString(this.topic_published);

    out.writeInt(this.error_code);

    out.writeString(this.error_message);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.event_processor = in.readString(this.event_processor instanceof Utf8 ? (Utf8)this.event_processor : null);

      this.time_received = in.readString(this.time_received instanceof Utf8 ? (Utf8)this.time_received : null);

      this.time_published = in.readString(this.time_published instanceof Utf8 ? (Utf8)this.time_published : null);

      this.topic_published = in.readString(this.topic_published instanceof Utf8 ? (Utf8)this.topic_published : null);

      this.error_code = in.readInt();

      this.error_message = in.readString(this.error_message instanceof Utf8 ? (Utf8)this.error_message : null);

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.event_processor = in.readString(this.event_processor instanceof Utf8 ? (Utf8)this.event_processor : null);
          break;

        case 1:
          this.time_received = in.readString(this.time_received instanceof Utf8 ? (Utf8)this.time_received : null);
          break;

        case 2:
          this.time_published = in.readString(this.time_published instanceof Utf8 ? (Utf8)this.time_published : null);
          break;

        case 3:
          this.topic_published = in.readString(this.topic_published instanceof Utf8 ? (Utf8)this.topic_published : null);
          break;

        case 4:
          this.error_code = in.readInt();
          break;

        case 5:
          this.error_message = in.readString(this.error_message instanceof Utf8 ? (Utf8)this.error_message : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









