package api.tasks.service;

import api.tasks.model.Task;
import api.tasks.repository.TaskRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void createTask(Task newTask) {
        taskRepository.save(newTask);
    }

    public Task findTask(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Task ID: " + id + "NOT FOUND"));
    }

    public void updateTask(Long id, Task updatedTask) {

    }

    public void deleteTask(Task targetTask) {
        taskRepository.delete(targetTask);
    }

    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    public List<Task> getCompleteTasks() {
        List<Task> tasks = getTasks();

        return tasks.stream()
                .filter(task -> task.getStatus().toString().equalsIgnoreCase("COMPLETE"))
                .collect(Collectors.toList());
    }

    public List<Task> getIncompleteTasks() {
        List<Task> tasks = getTasks();

        return tasks.stream()
                .filter(task -> task.getStatus().toString().equalsIgnoreCase("INCOMPLETE"))
                .collect(Collectors.toList());
    }
}