package com.tasksapp.service;

import com.tasksapp.model.Task;
import com.tasksapp.model.TaskStatus;
import com.tasksapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        taskRepository.findAll().forEach(tasks::add);

        return tasks;
    }

    @Override
    public Task getTaskById(Long id) {
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
