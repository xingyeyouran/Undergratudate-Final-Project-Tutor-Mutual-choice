package com.example.anonomous.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Student {
    @Id
    private int StudentID;
    private String name;
    private Boolean eligible;
    @ManyToOne
    private Admin administrator;
    @OneToMany(mappedBy = "student")
    private List<ElectionList> elections;


}
