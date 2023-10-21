package com.tasksapp.service;

import com.tasksapp.model.Task;
import com.tasksapp.model.TaskStatus;

import java.util.List;

public class TaskServiceImpl implements TaskService {
    @Override
    public List<Task> getTasks() {
        return null;
    }

    @Override
    public List<Task> getTasksById(Long id) {
        return null;
    }

    @Override
    public List<Task> getTasksByTitle(String title) {
        return null;
    }

    @Override
    public List<Task> getTasksByStatus(TaskStatus status) {
        return null;
    }

    @Override
    public Task createTask(Task task) {
        return null;
    }

    @Override
    public boolean updateTask(Task task) {
        return false;
    }

    @Override
    public boolean deleteTaskById(Long id) {
        return false;
    }

    @Override
    public boolean deleteTaskByTitle(String title) {
        return false;
    }
}
