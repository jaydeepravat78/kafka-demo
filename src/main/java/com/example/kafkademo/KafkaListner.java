package com.example.kafkademo;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListner {


    @KafkaListener(topics = "${kafka.topic}", groupId = "${kafka.group}")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }

}
