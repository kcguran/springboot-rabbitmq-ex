package com.example.demo.listener;

import com.example.demo.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NatificationListener {

    @RabbitListener(queues = "kerem-guran-queue")
    public void handleMessage(Notification notification){
        System.out.println("Mesaj alındı");
        System.out.println(notification.toString());
    }
}
