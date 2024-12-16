package edu.miu.cs544.temuulen.lab12_receiver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "${springjms.cs544Queue}")
    public void receive(String message) {
        System.out.println("Received Message > " + message);
    }

    @JmsListener(destination = "${springjms.cs544Queue}")
    public void receiveStudent(edu.miu.cs544.temuulen.lab12_receiver.entity.Student student) {
        System.out.println("Received Message > " + student);
    }
}
