package com.example.anonomous.Repository;

import com.example.anonomous.Entity.Student;

import java.util.List;

public interface Srepo {
    List<Student> searchStudent(int studentID);
}
