package edu.miu.cs544.temuulen.lab12_receiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class Lab12ReceiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab12ReceiverApplication.class, args);
    }

}
