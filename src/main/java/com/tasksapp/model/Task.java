package com.tasksapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @Column(nullable = false)
    private String title;

    @Column
    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    @Column
    @Enumerated(EnumType.STRING)
    private TaskPriority priority;

    @Column
    private String description;

    // @Column
    // @ElementCollection
    // private List<String> tag;

    // @Column
    // @ElementCollection
    // private List<String> subtask;

    // @Column
    // private boolean isRecurring;

    // @Column
    // @Enumerated(EnumType.STRING)
    // private TaskFrequency taskFrequency;

    // @Column
    // private Date dateAdded;

    // @Column
    // private Date dateCompleted;

}
