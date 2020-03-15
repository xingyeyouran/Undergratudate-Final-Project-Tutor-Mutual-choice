package com.example.anonomous.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue
    @Column(length = 16)
    private UUID uuid;
    private String Name;
    @OneToMany(mappedBy = "course")
    private List<ElectionList> elections;
}
