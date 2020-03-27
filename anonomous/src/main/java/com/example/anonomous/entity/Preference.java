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
//encompass all directions student may interested in
public class Preference {
    @Id
    @GeneratedValue
    private UUID uuid;
    private String name;
    private String description;
//    private Float weight;
@Column(columnDefinition = "timestamp default current_timestamp",insertable = false,updatable = false)
    private LocalDateTime insertStamp;
    @Column(columnDefinition = "timestamp default current_timestamp"+" on update current_timestamp",insertable = false,updatable = false)
    private LocalDateTime updateStamp;
    @OneToMany(mappedBy = "preference")
    private List<StudentPreferenceBill>  preferenceBill;
}
