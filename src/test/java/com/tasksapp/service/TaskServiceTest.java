package com.tasksapp.service;

import com.tasksapp.model.Task;
import com.tasksapp.model.TaskPriority;
import com.tasksapp.model.TaskStatus;
import com.tasksapp.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

@DataJpaTest
class TaskServiceTest {

    @Mock
    private TaskRepository mockTaskRepository;

    @InjectMocks
    private TaskServiceImpl taskServiceImpl;

    // Long id
    // String title
    // TaskStatus status
    // List<String> tag
    // int priority
    // String description

    @Test
    public void testGetTasksReturnsListOfAllTasks() {
        List<Task> taskList = Arrays.asList(
                Task.builder().title("Task 1").status(TaskStatus.INCOMPLETE).priority(TaskPriority.LOW).description("The first task is incomplete and is low priority.").build(),
                Task.builder().title("Task 2").status(TaskStatus.INCOMPLETE).priority(TaskPriority.MEDIUM).description("The first task is incomplete and is medium priority.").build(),
                Task.builder().title("Task 3").status(TaskStatus.COMPLETE).priority(TaskPriority.HIGH).description("The first task is complete and is high priority.").build()
        );

        when(mockTaskRepository.findAll()).thenReturn(taskList);

        List<Task> result = taskServiceImpl.getTasks();

        assertThat(result).hasSize(3);
        assertThat(result).isEqualTo(taskList);
    }

    @Test
    public void testGetTasksByTitleReturnsAllMatchedTasks() {
        String targetTitle = "Target Title";

        List<Task> taskList = Arrays.asList(
                Task.builder().id(1L).title("An Existing Task").status(TaskStatus.INCOMPLETE).priority(TaskPriority.LOW).description("This is an existing task.").build(),
                Task.builder().id(2L).title("Another Existing Task").status(TaskStatus.INCOMPLETE).priority(TaskPriority.LOW).description("This is another existing task.").build(),
                Task.builder().id(3L).title(targetTitle).status(TaskStatus.INCOMPLETE).priority(TaskPriority.LOW).description("This is a task with the target title.").build(),
                Task.builder().id(4L).title(targetTitle).status(TaskStatus.INCOMPLETE).priority(TaskPriority.LOW).description("This is another task with the target title.").build()
        );

        List<Task> expected = taskList.stream()
                .filter(task -> task.getTitle().equalsIgnoreCase(targetTitle))
                .toList();

        List<Task> result = taskServiceImpl.getTasksByTitle(targetTitle);

        when(mockTaskRepository.getTasksByTitleContainsIgnoreCase(targetTitle)).thenReturn(expected);

        assertThat(result).isEqualTo(expected);
    }

}