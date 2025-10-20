package org.example.beanexamples.service;

import org.springframework.stereotype.Service;

@Service("smsService")
public class SmsMessageService implements MessageService{
    @Override
    public String getMessage(){
        return "Message via SMS";
    }
}
