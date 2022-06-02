package com.example.demo;

import com.example.demo.model.Notification;
import com.example.demo.producer.NotificationProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private NotificationProducer notificationProducer;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }

}
