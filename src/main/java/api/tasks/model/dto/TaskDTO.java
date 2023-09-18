package api.tasks.model.dto;

import api.tasks.model.TaskFrequency;

import java.util.Date;
import java.util.List;

public class TaskDTO {
    private String title;
    private List<String> tag;
    private Integer priority;
    private String description;
    private Date deadline;
    private List<String> subtask;
    private Boolean isRecurring;
    private TaskFrequency frequency;

    public TaskDTO(String title, List<String> tag, Integer priority, String description, Date deadline, List<String> subtask, Boolean isRecurring, TaskFrequency frequency) {
        this.title = title;
        this.tag = tag;
        this.priority = priority;
        this.description = description;
        this.deadline = deadline;
        this.subtask = subtask;
        this.isRecurring = isRecurring;
        this.frequency = frequency;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTag() {
        return tag;
    }

    public void setTag(List<String> tag) {
        this.tag = tag;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public List<String> getSubtask() {
        return subtask;
    }

    public void setSubtask(List<String> subtask) {
        this.subtask = subtask;
    }

    public Boolean getIsRecurring() {
        return isRecurring;
    }

    public void setIsRecurring(Boolean isRecurring) {
        this.isRecurring = isRecurring;
    }

    public TaskFrequency getFrequency() {
        return frequency;
    }

    public void setFrequency(TaskFrequency frequency) {
        this.frequency = frequency;
    }
}
