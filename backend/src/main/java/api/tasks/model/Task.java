package api.tasks.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.List;

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private TaskStatus status;
    private List<String> tag;
    private int priority;
    private String description;
    private String[] subtask;
    private boolean isRecurring;
    private TaskFrequency taskFrequency;
    private Date dateAdded;
    private Date dateCompleted;

    public Task(String title, TaskStatus status, List<String> tag, int priority, String description, String[] subtask, boolean isRecurring, TaskFrequency taskFrequency, Date dateAdded, Date dateCompleted) {
        this.title = title;
        this.status = status;
        this.tag = tag;
        this.priority = priority;
        this.description = description;
        this.subtask = subtask;
        this.isRecurring = isRecurring;
        this.taskFrequency = taskFrequency;
        this.dateAdded = dateAdded;
        this.dateCompleted = dateCompleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public List<String> getTag() {
        return tag;
    }

    public void setTag(List<String> tag) {
        this.tag = tag;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getSubtask() {
        return subtask;
    }

    public void setSubtask(String[] subtask) {
        this.subtask = subtask;
    }

    public boolean isRecurring() {
        return isRecurring;
    }

    public void setRecurring(boolean recurring) {
        isRecurring = recurring;
    }

    public TaskFrequency getTaskFrequency() {
        return taskFrequency;
    }

    public void setTaskFrequency(TaskFrequency taskFrequency) {
        this.taskFrequency = taskFrequency;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Date getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }
}
