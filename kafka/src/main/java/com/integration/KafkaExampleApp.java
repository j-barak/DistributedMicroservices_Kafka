package com.integration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class KafkaExampleApp {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(KafkaExampleApp.class);
    }
    @Bean
    CommandLineRunner commandLineRunner(KafkaTempalte<String, String> kafkaTempalte) {
        return args -> {
            for (int i = 0; i < 10; i++) {
                kafkaTempalte.send("integration", new Message(
                                "hello " + i,
                                        LocalDateTime.now()
                                )
                );
            }
        };
    }
}


