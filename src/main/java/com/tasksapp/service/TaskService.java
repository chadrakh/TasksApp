package com.tasksapp.service;

import com.tasksapp.model.Task;
import com.tasksapp.model.TaskStatus;

import java.util.List;

public interface TaskService {
    List<Task> getTasks();

    List<Task> getTasksById (Long id);

    List<Task> getTasksByTitle (String title);

    List <Task> getTasksByStatus (TaskStatus status);

    Task createTask (Task task);

    boolean updateTask(Task task);

    boolean deleteTaskById (Long id);

    boolean deleteTaskByTitle (String title);
}