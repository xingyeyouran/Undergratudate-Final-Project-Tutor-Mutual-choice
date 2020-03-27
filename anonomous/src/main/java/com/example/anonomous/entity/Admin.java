package com.example.anonomous.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
//This entity represent the tutor,who has specified username & password.
public class Admin {
    @Id
    private String UserName;
    private String password;
    private Integer studentMaximum;
    @Column(columnDefinition = "timestamp default current_timestamp",insertable = false,updatable = false)
    private LocalDateTime insertStamp;
    @Column(columnDefinition = "timestamp default current_timestamp"+" on update current_timestamp",insertable = false,updatable = false)
    private LocalDateTime updateStamp;
    @OneToMany(mappedBy = "administrator")
    private List<Student> students;
}
