package org.example.beanexamples.repository;

import org.springframework.stereotype.Repository;

@Repository
public class TaskRepository {
    public String findAllTasks() {
        return "Tasks from DB (mocked)";
    }
}
