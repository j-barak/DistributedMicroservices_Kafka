package com.integration;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
                topics  = "itnegration",
                groupId = "groupId",
                containerFactory = "messageFactory"
            )

    void listener(String data) {
        System.out.println("Listener received: " + data.message());
    }
}

