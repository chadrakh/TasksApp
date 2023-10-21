package com.tasksapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column
    private String title;

    @Column
    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    @Column
    @ElementCollection
    private List<String> tag;

    @Column
    private int priority;

    @Column
    private String description;

    @Column
    @ElementCollection
    private List<String> subtask;

    @Column
    private boolean isRecurring;

    @Column
    @Enumerated(EnumType.STRING)
    private TaskFrequency taskFrequency;

    @Column
    private Date dateAdded;

    @Column
    private Date dateCompleted;

}
