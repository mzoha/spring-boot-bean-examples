package org.example.beanexamples.controller;

import org.example.beanexamples.service.GreetingService;
import org.example.beanexamples.service.MessageService;
import org.example.beanexamples.service.TaskService;
import org.example.beanexamples.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingService greetingService;
    private final TaskService taskService;
    private final UserService userService;
    private final MessageService messageService;

    // Constructor Injection
    public GreetingController(GreetingService greetingService, TaskService taskService, UserService userService, @Qualifier("smsService") MessageService messageService) {
        this.greetingService = greetingService;
        this.taskService = taskService;
        this.userService = userService;
        this.messageService = messageService;
    }

    @GetMapping("/hello")
    public String hello() {
        return greetingService.sayHello();
    }

    @GetMapping("/tasks")
    public String tasks(){
        return taskService.findAllTasks();
    }

    @GetMapping("/task")
    public String task(){
        return taskService.getTask();
    }

    @GetMapping("/user")
    public String user(){
        return userService.getUser();
    }

    @GetMapping("/message")
    public String message(){
        return messageService.getMessage();
    }
}
