package org.neoa.ch02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class Ch02DslStreamsApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch02DslStreamsApplication.class, args);
    }

    @KafkaListener(id = "users", topics = "users")
    public void listenUsers(String value) {
        System.out.println("(DSL) Hello, " + value);
    }

}
