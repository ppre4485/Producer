/**
 * Copyright 2020 Confluent Inc.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.confluent.examples.clients.cloud;

import io.confluent.kafka.schemaregistry.client.SchemaRegistryClientConfig;
import io.confluent.kafka.serializers.AbstractKafkaSchemaSerDeConfig;
import ordering.cmd.response.v_0.*;

import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.Producer;

import io.confluent.kafka.serializers.KafkaAvroSerializer;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.NewTopic;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.Exception;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.common.config.SaslConfigs;
import org.apache.kafka.common.errors.TopicExistsException;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.confluent.kafka.serializers.AbstractKafkaSchemaSerDeConfig.AUTO_REGISTER_SCHEMAS;
import static io.confluent.kafka.serializers.AbstractKafkaSchemaSerDeConfig.USE_LATEST_VERSION;

public class ProducerAvroExample {

    // Create topic in Confluent Cloud
    public static void createTopic(final String topic,
                                   final Properties cloudConfig, int numPartitions) {

        final NewTopic newTopic = new NewTopic(topic, Optional.of(numPartitions), Optional.empty());
        try (final AdminClient adminClient = AdminClient.create(cloudConfig)) {
            adminClient.createTopics(Collections.singletonList(newTopic)).all().get();
        } catch (final InterruptedException | ExecutionException e) {
            // Ignore if TopicExistsException, which may be valid if topic exists
            if (!(e.getCause() instanceof TopicExistsException)) {
                throw new RuntimeException(e);
            }
        }
    }

    public Header getHeader(int orderNumber, String orderingChannel ) {

        Header header = new Header();
        header.setMessageId("perf-test-5");
        header.setSellerId("USBL");
        header.setSite("049");
        header.setCustomerNumber("customer_number");
        header.setOrderNumber(Integer.toString(orderNumber));
        header.setDeliveryDate("2021-11-16");
        header.setDeliveryMethod("GROUND");
        header.setCustomerPoNumber("customer_po_number");
        header.setChannelOrderId("LVS");
        header.setConfirmed(false);
        header.setOrderProcessedOn("2021-11-16T18:42:53.479Z");
        header.setOrderingChannel("B2B");
//        header.setOrderType(Order_Type.REG);
//        header.setOrderStatus(Order_Status.OPEN);
//        header.setInvoiceSeparately(false);
//        header.setShippingAddress("shipping address");
//        header.setConfirmedCases(1);
//        header.setConfirmedSplits(2);
//        header.setOrderedCases(2);
//        header.setOrderedSplits(2);
//        header.setNumberOfLines(2);
//        header.setTotalPrice(new BigDecimal("123"));


//        Extn extn = new Extn();
//        extn.setNewRecord(true);
//
//        header.setExtn(extn);

//        Miscellaneous_Charges miscellaneous_charges = new Miscellaneous_Charges();
//        miscellaneous_charges.setType("type");
//        BigDecimal bigDecimal = new BigDecimal("0.03");
//        miscellaneous_charges.setAmount(bigDecimal);
//
//        header.setMiscellaneousCharges(null);
        return header;
    }

    enum Level {
        CS,
        EA
    }

    public List<Line_Item> getLineItem() {
        List<Line_Item> lineItemsList = new ArrayList<Line_Item>();
        //////////////////////////////////////////
        Line_Item line_item1 = new Line_Item();
        line_item1.setItemNumber("0318527");
        line_item1.setLineNumber(1);
        line_item1.setOrderQuantity(2);
        line_item1.setConfirmedQuantity(2);
        line_item1.setOrderingUnitOfMeasure(Ordering_Unit_Of_Measure.CS);
        line_item1.setPrice(null);
        line_item1.setPricingType(null);
        line_item1.setSubstitutedItem(false);
        line_item1.setSubReasonType("sub reason type");
        line_item1.setOriginalItemNumber("original item number");
        line_item1.setOriginalItemLineNumber(null);
        line_item1.setConfirmed(true);

        lineItemsList.add(line_item1);
        /////////////////////////////////////////////

        Line_Item line_item2 = new Line_Item();
        line_item2.setItemNumber("0033");
        line_item2.setLineNumber(1);
        line_item2.setOrderQuantity(2);
        line_item2.setConfirmedQuantity(2);
        line_item2.setOrderingUnitOfMeasure(Ordering_Unit_Of_Measure.CS);
        line_item2.setPrice(null);
        line_item2.setPricingType(null);
        line_item2.setSubstitutedItem(false);
        line_item2.setSubReasonType("sub reason type");
        line_item2.setOriginalItemNumber("original item number");
        line_item2.setOriginalItemLineNumber(null);
        line_item2.setConfirmed(true);

        lineItemsList.add(line_item2);

        ///////////////////////

        Line_Item line_item3 = new Line_Item();
        line_item3.setItemNumber("1829849");
        line_item3.setLineNumber(1);
        line_item3.setOrderQuantity(2);
        line_item3.setConfirmedQuantity(2);
        line_item3.setOrderingUnitOfMeasure(Ordering_Unit_Of_Measure.CS);
        line_item3.setPrice(null);
        line_item3.setPricingType(null);
        line_item3.setSubstitutedItem(false);
        line_item3.setSubReasonType("sub reason type");
        line_item3.setOriginalItemNumber("original item number");
        line_item3.setOriginalItemLineNumber(null);
        line_item3.setConfirmed(true);

        lineItemsList.add(line_item3);

        return lineItemsList;
    }

    public ordering.cmd.response.v_0.Exception getException() {
        ordering.cmd.response.v_0.Exception exception = null;
        return exception;
    }

    public static void main(final String[] args) throws IOException {
//        if (args.length != 1) {
//            System.out.println("Please provide command line arguments: configPath topic");
//            System.exit(1);
//        }

        // Load properties from a local configuration file
        // Create the configuration file (e.g. at '$HOME/.confluent/java.config') with configuration parameters
        // to connect to your Kafka cluster, which can be on your local host, Confluent Cloud, or any other cluster.
        // Follow these instructions to create this file: https://docs.confluent.io/platform/current/tutorials/examples/clients/docs/java.html
        final Properties props = new Properties();
//        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "lkc-orxz9-41wv3.us-east-1.aws.glb.confluent.cloud:9092");
//        props.put(SaslConfigs.SASL_JAAS_CONFIG, "org.apache.kafka.common.security.plain.PlainLoginModule required username='QKDZY2FGOTPBCCH6' password='rgfcyoGyd0ZQJ0A76BEyPHDoV8WV7eX/w0UXN+R51CErUOQBfaE5VzDIvZs44ZwW';");
//        props.put(AbstractKafkaSchemaSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "https://psrc-gn6wr.us-east-2.aws.confluent.cloud");
//        props.put(SchemaRegistryClientConfig.USER_INFO_CONFIG, "72AR4NY4UBGZ2TPJ:KZZoUzZ/Mge1SK/fO3rUfkyXyW4ig/QibE2dw+P7B26SF0sqp6cFMb+YEpjagszT");

        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "lkc-gqpd1v-428jy.us-east-1.aws.glb.confluent.cloud:9092");
        props.put(SaslConfigs.SASL_JAAS_CONFIG, "org.apache.kafka.common.security.plain.PlainLoginModule required username='ARI2TR3ASXQYKWKX' password='HxG2vBtaTORLwBkKO5jVOpkTTM7k3sgWqfT44VU69FRVwN1Ug+WZKF2xiQn9O94r';");
        props.put(AbstractKafkaSchemaSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "https://psrc-nx65v.us-east-2.aws.confluent.cloud");
        props.put(SchemaRegistryClientConfig.USER_INFO_CONFIG, "222QHF2NBTKLXMQM:Gpc/rPwxejX9q76bTmc2stV2VpUoORTpFC8pGG7tPBoy0RO1qalxSasRj0rTLPcR");


        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.IntegerDeserializer");
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "io.confluent.kafka.serializers.KafkaAvroDeserializer");
        props.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, "SASL_SSL");
        props.put(SaslConfigs.SASL_MECHANISM, "PLAIN");
        props.put(SchemaRegistryClientConfig.BASIC_AUTH_CREDENTIALS_SOURCE, "USER_INFO");
        props.put(AUTO_REGISTER_SCHEMAS, false);
        props.put(USE_LATEST_VERSION, true);

        // Add additional properties.
        props.put(ProducerConfig.ACKS_CONFIG, "all");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.IntegerSerializer");
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class);

        final String topic = "ordering.cmd.response.0";

        int numPartitions = 2;

        Producer<Integer, Order_Response> producer = new KafkaProducer<Integer, Order_Response>(props);
        KafkaProducer producer1 = new KafkaProducer(props);

        ProducerAvroExample producerAvroExample = new ProducerAvroExample();
//        Header header = producerAvroExample.getHeader(1,);
        List<Line_Item> lineItemList = producerAvroExample.getLineItem();
        ordering.cmd.response.v_0.Exception exception = producerAvroExample.getException();


        List<String> orderingChannelList = Arrays.asList(new String[]{"B2B"});

        int partition = 0;
        int n = 1;
        for (int i = 0; i < n; i++) {

            Order_Response record = new Order_Response();
            Header header = producerAvroExample.getHeader(1, orderingChannelList.get(i%5));
            record.setHeader(header);
            record.setLineItems(lineItemList);
            record.setExceptions(null);

            partition = partition%numPartitions;

            producer.send(new ProducerRecord<Integer, Order_Response>(topic, partition, null, record), new Callback() {
                @Override
                public void onCompletion(RecordMetadata m, Exception e) {
                    if (e != null) {
                        e.printStackTrace();
                    } else {
                        System.out.printf("Produced record to topic %s partition [%d] @ offset %d%n", m.topic(), m.partition(), m.offset());
                    }
                }
            });
            producer.flush();
            partition++;
        }


        System.out.printf("10 messages were produced to topic %s%n", topic);

        producer.close();
    }

    public static Properties loadConfig(final String configFile) throws IOException {
        if (!Files.exists(Paths.get(configFile))) {
            throw new IOException(configFile + " not found.");
        }
        final Properties cfg = new Properties();
        try (InputStream inputStream = new FileInputStream(configFile)) {
            cfg.load(inputStream);
        }
        return cfg;
    }



}
