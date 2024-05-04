package com.example.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class UserConsumer {

    @KafkaListener(topics = "users", groupId = "my-group")
    public void listen(User user) {
        System.out.println("Received user: " + user.getName());
    }
}
