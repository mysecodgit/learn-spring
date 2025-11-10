package com.springwithhudeifa.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("sms")
@Primary
public class SmsNotificationService implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Sending this message :- "+message+" using SMS Method.");
    }
}
