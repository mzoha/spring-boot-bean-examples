package org.example.beanexamples.service;

import org.example.beanexamples.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public String getTask() {
        return "My tasks: Learn Spring Boot, Practice coding";
    }

    public String findAllTasks(){
        return taskRepository.findAllTasks();
    }
}
