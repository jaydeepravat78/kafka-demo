package com.example.kafkademo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListner {


    @Value("${kafka.topic}")
    private String topic;

    @Value("${kafka.group}")
    private String group;
    @KafkaListener(topics = "${kafka.topic}", groupId = "${kafka.group}")
    public void listen(String message) {
        System.out.println("Topic: " + topic);
        System.out.println("Received message: " + message);
    }

}
