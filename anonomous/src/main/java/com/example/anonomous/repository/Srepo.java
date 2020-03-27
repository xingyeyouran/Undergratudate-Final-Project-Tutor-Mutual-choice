package com.example.anonomous.repository;

import com.example.anonomous.entity.Student;

import java.util.List;

public interface Srepo {
    List<Student> searchStudent(int studentID);
}
