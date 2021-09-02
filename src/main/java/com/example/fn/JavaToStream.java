package com.example.fn;

import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.UUID;

public class JavaToStream {

    public String handleRequest(String input) {
        Producer simpleProducer = new Producer();
        String topic = "stream";
        ProducerRecord<String, String> data = new ProducerRecord<>(topic, UUID.randomUUID().toString(), input);
        simpleProducer.producer.send(data);
        simpleProducer.producer.close();
        return "Message Sent";
    }
}
