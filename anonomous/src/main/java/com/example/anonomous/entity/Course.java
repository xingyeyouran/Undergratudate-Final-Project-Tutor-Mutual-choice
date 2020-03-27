package com.example.anonomous.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
//Courses belongs to tutor & student and grades of each course
public class Course {
    @Id
    @GeneratedValue
    @Column(length = 16)
    private UUID uuid;
    private String Name;
    private Float weight;
    @Column(columnDefinition = "timestamp default current_timestamp",insertable = false,updatable = false)
    private LocalDateTime insertTime;
    @Column(columnDefinition = "timestamp default current_timestamp"+" on update current_timestamp",insertable = false,updatable = false)
    private LocalDateTime updateTime;
    @OneToMany(mappedBy = "course")
    private List<ElectionList> elections;
}
