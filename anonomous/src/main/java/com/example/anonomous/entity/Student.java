package com.example.anonomous.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
//Students objects,includes basic info and whether has basic selection right
public class Student {
    @Id
    private int studentID;
    private String name;
    private Boolean eligible;
    private Float finalGrade;
    @Column(columnDefinition = "timestamp default current_timestamp",insertable = false,updatable = false)
    private LocalDateTime insertStamp;
    @Column(columnDefinition = "timestamp default current_timestamp"+" on update current_timestamp",insertable = false,updatable = false)
    private LocalDateTime updateStamp;
    @ManyToOne
    private Admin administrator;
    @OneToMany(mappedBy = "student")
    private List<ElectionList> elections;
    @OneToMany(mappedBy = "student")
    private List<StudentPreferenceBill> preferenceBills;


}
