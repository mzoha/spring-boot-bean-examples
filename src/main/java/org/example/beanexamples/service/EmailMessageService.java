package org.example.beanexamples.service;

import org.springframework.stereotype.Service;

@Service("emailService")
public class EmailMessageService implements MessageService{

    @Override
    public String getMessage(){
        return "Message via Email";
    }
}
