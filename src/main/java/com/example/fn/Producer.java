package com.example.fn;


import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class Producer {

    public KafkaProducer<String, String> producer;
    private final Properties properties = new Properties();

    public Producer() {
        properties.put("bootstrap.servers", "cell-1.streaming.sa-saopaulo-1.oci.oraclecloud.com:9092");
        properties.put("security.protocol", "SASL_SSL");
        properties.put("sasl.mechanism", "PLAIN");
        properties.put("sasl.jaas.config", "org.apache.kafka.common.security.plain.PlainLoginModule required username=\"oraclepocb3/oracleidentitycloudservice/gustavo.alves@oracle.com/ocid1.streampool.oc1.sa-saopaulo-1.amaaaaaaupwapsqanhzrlwefuoy3qnvnalwvy37w5gipwu4sukwylzhdcyfa\" password=\"P1QPs5fF7P6r9D<:B>Ve\";");
        properties.put("acks", "all");
        properties.put("retries", 0);
        properties.put("batch.size", 16384);
        properties.put("linger.ms", 1);
        properties.put("buffer.memory", 33554432);
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        producer = new KafkaProducer<>(properties);
    }

}