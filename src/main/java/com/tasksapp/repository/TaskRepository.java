package com.tasksapp.repository;

import com.tasksapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    public List<Task> getTaskByTitleContainsIgnoreCase(String targetTitle);
}
