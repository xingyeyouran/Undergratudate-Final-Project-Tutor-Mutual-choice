package com.example.anonomous.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
//This entity represent the tutor,who has specified username & password.
public class Admin {
    @Id
    private String UserName;
    private String password;
    private int studentMaximum;
    @OneToMany(mappedBy = "administrator")
    private List<Student> students;
}
