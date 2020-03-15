package com.example.anonomous.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class ElectionList {
    @Id
    @GeneratedValue
    private UUID uuid;
    private float grades;
    private float weight;
    private float lowestGradeDemand;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Course course;

}
