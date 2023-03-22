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
public class Miscellaneous_Charges extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1298988370266696908L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Miscellaneous_Charges\",\"namespace\":\"ordering.cmd.response.v_0\",\"fields\":[{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"amount\",\"type\":[\"null\",{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
  }

  private static final BinaryMessageEncoder<Miscellaneous_Charges> ENCODER =
      new BinaryMessageEncoder<Miscellaneous_Charges>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Miscellaneous_Charges> DECODER =
      new BinaryMessageDecoder<Miscellaneous_Charges>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Miscellaneous_Charges> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Miscellaneous_Charges> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Miscellaneous_Charges> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Miscellaneous_Charges>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Miscellaneous_Charges to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Miscellaneous_Charges from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Miscellaneous_Charges instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Miscellaneous_Charges fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence type;
   private java.math.BigDecimal amount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Miscellaneous_Charges() {}

  /**
   * All-args constructor.
   * @param type The new value for type
   * @param amount The new value for amount
   */
  public Miscellaneous_Charges(java.lang.CharSequence type, java.math.BigDecimal amount) {
    this.type = type;
    this.amount = amount;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return amount;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (java.lang.CharSequence)value$; break;
    case 1: amount = (java.math.BigDecimal)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public java.lang.CharSequence getType() {
    return type;
  }


  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.CharSequence value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'amount' field.
   * @return The value of the 'amount' field.
   */
  public java.math.BigDecimal getAmount() {
    return amount;
  }


  /**
   * Sets the value of the 'amount' field.
   * @param value the value to set.
   */
  public void setAmount(java.math.BigDecimal value) {
    this.amount = value;
  }

  /**
   * Creates a new Miscellaneous_Charges RecordBuilder.
   * @return A new Miscellaneous_Charges RecordBuilder
   */
  public static ordering.cmd.response.v_0.Miscellaneous_Charges.Builder newBuilder() {
    return new ordering.cmd.response.v_0.Miscellaneous_Charges.Builder();
  }

  /**
   * Creates a new Miscellaneous_Charges RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Miscellaneous_Charges RecordBuilder
   */
  public static ordering.cmd.response.v_0.Miscellaneous_Charges.Builder newBuilder(ordering.cmd.response.v_0.Miscellaneous_Charges.Builder other) {
    if (other == null) {
      return new ordering.cmd.response.v_0.Miscellaneous_Charges.Builder();
    } else {
      return new ordering.cmd.response.v_0.Miscellaneous_Charges.Builder(other);
    }
  }

  /**
   * Creates a new Miscellaneous_Charges RecordBuilder by copying an existing Miscellaneous_Charges instance.
   * @param other The existing instance to copy.
   * @return A new Miscellaneous_Charges RecordBuilder
   */
  public static ordering.cmd.response.v_0.Miscellaneous_Charges.Builder newBuilder(ordering.cmd.response.v_0.Miscellaneous_Charges other) {
    if (other == null) {
      return new ordering.cmd.response.v_0.Miscellaneous_Charges.Builder();
    } else {
      return new ordering.cmd.response.v_0.Miscellaneous_Charges.Builder(other);
    }
  }

  /**
   * RecordBuilder for Miscellaneous_Charges instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Miscellaneous_Charges>
    implements org.apache.avro.data.RecordBuilder<Miscellaneous_Charges> {

    private java.lang.CharSequence type;
    private java.math.BigDecimal amount;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ordering.cmd.response.v_0.Miscellaneous_Charges.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.amount)) {
        this.amount = data().deepCopy(fields()[1].schema(), other.amount);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing Miscellaneous_Charges instance
     * @param other The existing instance to copy.
     */
    private Builder(ordering.cmd.response.v_0.Miscellaneous_Charges other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.amount)) {
        this.amount = data().deepCopy(fields()[1].schema(), other.amount);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public java.lang.CharSequence getType() {
      return type;
    }


    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public ordering.cmd.response.v_0.Miscellaneous_Charges.Builder setType(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public ordering.cmd.response.v_0.Miscellaneous_Charges.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'amount' field.
      * @return The value.
      */
    public java.math.BigDecimal getAmount() {
      return amount;
    }


    /**
      * Sets the value of the 'amount' field.
      * @param value The value of 'amount'.
      * @return This builder.
      */
    public ordering.cmd.response.v_0.Miscellaneous_Charges.Builder setAmount(java.math.BigDecimal value) {
      validate(fields()[1], value);
      this.amount = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'amount' field has been set.
      * @return True if the 'amount' field has been set, false otherwise.
      */
    public boolean hasAmount() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'amount' field.
      * @return This builder.
      */
    public ordering.cmd.response.v_0.Miscellaneous_Charges.Builder clearAmount() {
      amount = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Miscellaneous_Charges build() {
      try {
        Miscellaneous_Charges record = new Miscellaneous_Charges();
        record.type = fieldSetFlags()[0] ? this.type : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.amount = fieldSetFlags()[1] ? this.amount : (java.math.BigDecimal) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Miscellaneous_Charges>
    WRITER$ = (org.apache.avro.io.DatumWriter<Miscellaneous_Charges>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Miscellaneous_Charges>
    READER$ = (org.apache.avro.io.DatumReader<Miscellaneous_Charges>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.type);

    if (this.amount == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.amount.toString());
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.type = in.readString(this.type instanceof Utf8 ? (Utf8)this.type : null);

      if (in.readIndex() != 1) {
        in.readNull();
        this.amount = null;
      } else {
        this.amount = new java.math.BigDecimal(in.readString());
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.type = in.readString(this.type instanceof Utf8 ? (Utf8)this.type : null);
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.amount = null;
          } else {
            this.amount = new java.math.BigDecimal(in.readString());
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










