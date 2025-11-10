package com.springwithhudeifa.store;

import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationService implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Sending this message :- "+message+" using Email Method.");
    }
}
