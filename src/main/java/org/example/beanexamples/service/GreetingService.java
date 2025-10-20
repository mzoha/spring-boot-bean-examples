package org.example.beanexamples.service;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {
    public String sayHello() {
        return "Hello from Spring Bean!";
    }
}
