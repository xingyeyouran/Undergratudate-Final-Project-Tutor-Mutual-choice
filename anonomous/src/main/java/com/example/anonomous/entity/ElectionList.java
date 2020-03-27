package com.example.anonomous.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class ElectionList {
    @Id
    @GeneratedValue
    private UUID uuid;
    private Float grades;
    private Float lowestGradeDemand;
    @Column(columnDefinition = "timestamp default current_timestamp",insertable = false,updatable = false)
    private LocalDateTime insertStamp;
    @Column(columnDefinition = "timestamp default current_timestamp"+" on update current_timestamp",insertable = false,updatable = false)
    private LocalDateTime updateStamp;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Course course;

}
