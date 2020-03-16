package com.example.anonomous.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
public class Preference {
    @Id
    @GeneratedValue
    private UUID uuid;
    private String name;
    private String description;
    private float weight;
    @ManyToOne
    private Student student;
}
