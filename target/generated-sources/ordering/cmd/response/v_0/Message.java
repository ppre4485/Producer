/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ordering.cmd.response.v_0;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Message extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7146740548805500936L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Message\",\"namespace\":\"ordering.cmd.response.v_0\",\"fields\":[{\"name\":\"code\",\"type\":\"string\",\"doc\":\"Identifier for the type of exception\",\"example\":\"header.exceptions, item.exceptions etc.\"},{\"name\":\"message\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"details\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Details\",\"fields\":[{\"name\":\"code\",\"type\":\"string\",\"doc\":\"Code for the specific exception\"},{\"name\":\"message\",\"type\":\"string\"},{\"name\":\"value\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"field\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"location\",\"type\":[\"null\",\"string\"],\"doc\":\"Line number related to the exception\",\"default\":null}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Message> ENCODER =
      new BinaryMessageEncoder<Message>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Message> DECODER =
      new BinaryMessageDecoder<Message>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Message> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Message> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Message> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Message>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Message to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Message from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Message instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Message fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Identifier for the type of exception */
   private java.lang.CharSequence code;
   private java.lang.CharSequence message;
   private java.util.List<ordering.cmd.response.v_0.Details> details;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Message() {}

  /**
   * All-args constructor.
   * @param code Identifier for the type of exception
   * @param message The new value for message
   * @param details The new value for details
   */
  public Message(java.lang.CharSequence code, java.lang.CharSequence message, java.util.List<ordering.cmd.response.v_0.Details> details) {
    this.code = code;
    this.message = message;
    this.details = details;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return code;
    case 1: return message;
    case 2: return details;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: code = (java.lang.CharSequence)value$; break;
    case 1: message = (java.lang.CharSequence)value$; break;
    case 2: details = (java.util.List<ordering.cmd.response.v_0.Details>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'code' field.
   * @return Identifier for the type of exception
   */
  public java.lang.CharSequence getCode() {
    return code;
  }


  /**
   * Sets the value of the 'code' field.
   * Identifier for the type of exception
   * @param value the value to set.
   */
  public void setCode(java.lang.CharSequence value) {
    this.code = value;
  }

  /**
   * Gets the value of the 'message' field.
   * @return The value of the 'message' field.
   */
  public java.lang.CharSequence getMessage() {
    return message;
  }


  /**
   * Sets the value of the 'message' field.
   * @param value the value to set.
   */
  public void setMessage(java.lang.CharSequence value) {
    this.message = value;
  }

  /**
   * Gets the value of the 'details' field.
   * @return The value of the 'details' field.
   */
  public java.util.List<ordering.cmd.response.v_0.Details> getDetails() {
    return details;
  }


  /**
   * Sets the value of the 'details' field.
   * @param value the value to set.
   */
  public void setDetails(java.util.List<ordering.cmd.response.v_0.Details> value) {
    this.details = value;
  }

  /**
   * Creates a new Message RecordBuilder.
   * @return A new Message RecordBuilder
   */
  public static ordering.cmd.response.v_0.Message.Builder newBuilder() {
    return new ordering.cmd.response.v_0.Message.Builder();
  }

  /**
   * Creates a new Message RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Message RecordBuilder
   */
  public static ordering.cmd.response.v_0.Message.Builder newBuilder(ordering.cmd.response.v_0.Message.Builder other) {
    if (other == null) {
      return new ordering.cmd.response.v_0.Message.Builder();
    } else {
      return new ordering.cmd.response.v_0.Message.Builder(other);
    }
  }

  /**
   * Creates a new Message RecordBuilder by copying an existing Message instance.
   * @param other The existing instance to copy.
   * @return A new Message RecordBuilder
   */
  public static ordering.cmd.response.v_0.Message.Builder newBuilder(ordering.cmd.response.v_0.Message other) {
    if (other == null) {
      return new ordering.cmd.response.v_0.Message.Builder();
    } else {
      return new ordering.cmd.response.v_0.Message.Builder(other);
    }
  }

  /**
   * RecordBuilder for Message instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Message>
    implements org.apache.avro.data.RecordBuilder<Message> {

    /** Identifier for the type of exception */
    private java.lang.CharSequence code;
    private java.lang.CharSequence message;
    private java.util.List<ordering.cmd.response.v_0.Details> details;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ordering.cmd.response.v_0.Message.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.code)) {
        this.code = data().deepCopy(fields()[0].schema(), other.code);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.message)) {
        this.message = data().deepCopy(fields()[1].schema(), other.message);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.details)) {
        this.details = data().deepCopy(fields()[2].schema(), other.details);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing Message instance
     * @param other The existing instance to copy.
     */
    private Builder(ordering.cmd.response.v_0.Message other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.code)) {
        this.code = data().deepCopy(fields()[0].schema(), other.code);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.message)) {
        this.message = data().deepCopy(fields()[1].schema(), other.message);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.details)) {
        this.details = data().deepCopy(fields()[2].schema(), other.details);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'code' field.
      * Identifier for the type of exception
      * @return The value.
      */
    public java.lang.CharSequence getCode() {
      return code;
    }


    /**
      * Sets the value of the 'code' field.
      * Identifier for the type of exception
      * @param value The value of 'code'.
      * @return This builder.
      */
    public ordering.cmd.response.v_0.Message.Builder setCode(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.code = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'code' field has been set.
      * Identifier for the type of exception
      * @return True if the 'code' field has been set, false otherwise.
      */
    public boolean hasCode() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'code' field.
      * Identifier for the type of exception
      * @return This builder.
      */
    public ordering.cmd.response.v_0.Message.Builder clearCode() {
      code = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'message' field.
      * @return The value.
      */
    public java.lang.CharSequence getMessage() {
      return message;
    }


    /**
      * Sets the value of the 'message' field.
      * @param value The value of 'message'.
      * @return This builder.
      */
    public ordering.cmd.response.v_0.Message.Builder setMessage(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.message = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'message' field has been set.
      * @return True if the 'message' field has been set, false otherwise.
      */
    public boolean hasMessage() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'message' field.
      * @return This builder.
      */
    public ordering.cmd.response.v_0.Message.Builder clearMessage() {
      message = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'details' field.
      * @return The value.
      */
    public java.util.List<ordering.cmd.response.v_0.Details> getDetails() {
      return details;
    }


    /**
      * Sets the value of the 'details' field.
      * @param value The value of 'details'.
      * @return This builder.
      */
    public ordering.cmd.response.v_0.Message.Builder setDetails(java.util.List<ordering.cmd.response.v_0.Details> value) {
      validate(fields()[2], value);
      this.details = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'details' field has been set.
      * @return True if the 'details' field has been set, false otherwise.
      */
    public boolean hasDetails() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'details' field.
      * @return This builder.
      */
    public ordering.cmd.response.v_0.Message.Builder clearDetails() {
      details = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Message build() {
      try {
        Message record = new Message();
        record.code = fieldSetFlags()[0] ? this.code : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.message = fieldSetFlags()[1] ? this.message : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.details = fieldSetFlags()[2] ? this.details : (java.util.List<ordering.cmd.response.v_0.Details>) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Message>
    WRITER$ = (org.apache.avro.io.DatumWriter<Message>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Message>
    READER$ = (org.apache.avro.io.DatumReader<Message>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.code);

    if (this.message == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.message);
    }

    long size0 = this.details.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (ordering.cmd.response.v_0.Details e0: this.details) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.code = in.readString(this.code instanceof Utf8 ? (Utf8)this.code : null);

      if (in.readIndex() != 1) {
        in.readNull();
        this.message = null;
      } else {
        this.message = in.readString(this.message instanceof Utf8 ? (Utf8)this.message : null);
      }

      long size0 = in.readArrayStart();
      java.util.List<ordering.cmd.response.v_0.Details> a0 = this.details;
      if (a0 == null) {
        a0 = new SpecificData.Array<ordering.cmd.response.v_0.Details>((int)size0, SCHEMA$.getField("details").schema());
        this.details = a0;
      } else a0.clear();
      SpecificData.Array<ordering.cmd.response.v_0.Details> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<ordering.cmd.response.v_0.Details>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          ordering.cmd.response.v_0.Details e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new ordering.cmd.response.v_0.Details();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.code = in.readString(this.code instanceof Utf8 ? (Utf8)this.code : null);
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.message = null;
          } else {
            this.message = in.readString(this.message instanceof Utf8 ? (Utf8)this.message : null);
          }
          break;

        case 2:
          long size0 = in.readArrayStart();
          java.util.List<ordering.cmd.response.v_0.Details> a0 = this.details;
          if (a0 == null) {
            a0 = new SpecificData.Array<ordering.cmd.response.v_0.Details>((int)size0, SCHEMA$.getField("details").schema());
            this.details = a0;
          } else a0.clear();
          SpecificData.Array<ordering.cmd.response.v_0.Details> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<ordering.cmd.response.v_0.Details>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              ordering.cmd.response.v_0.Details e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new ordering.cmd.response.v_0.Details();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










