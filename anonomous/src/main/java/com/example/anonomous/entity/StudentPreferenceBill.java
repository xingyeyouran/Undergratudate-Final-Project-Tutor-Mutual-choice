package com.example.anonomous.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class StudentPreferenceBill {
    @Id
    @GeneratedValue
    private UUID uuid;
    @Column(columnDefinition = "timestamp default current_timestamp",insertable = false,updatable = false)
    private LocalDateTime insertStamp;
    @Column(columnDefinition = "timestamp default current_timestamp"+" on update current_timestamp",insertable = false,updatable = false)
    private LocalDateTime updateStamp;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Preference preference;
}
