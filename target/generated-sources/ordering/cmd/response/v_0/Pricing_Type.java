/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ordering.cmd.response.v_0;
@org.apache.avro.specific.AvroGenerated
public enum Pricing_Type implements org.apache.avro.generic.GenericEnumSymbol<Pricing_Type> {
  DEFAULT_PRICE, HAND_PRICE, SUB_HAND_PRICE, LAST_MARGIN_PRICE, LOCK_PRICE, CLOUD_PRICE  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"Pricing_Type\",\"namespace\":\"ordering.cmd.response.v_0\",\"symbols\":[\"DEFAULT_PRICE\",\"HAND_PRICE\",\"SUB_HAND_PRICE\",\"LAST_MARGIN_PRICE\",\"LOCK_PRICE\",\"CLOUD_PRICE\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}