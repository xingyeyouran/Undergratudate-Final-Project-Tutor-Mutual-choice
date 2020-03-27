package com.example.anonomous.service;

import com.example.anonomous.entity.Course;
import com.example.anonomous.entity.Student;

import java.util.List;
import java.util.UUID;

public interface CourseService {
    Course getCourse(UUID uuid);
    Course getCourse(String name);
    List<Student> getStudents(Course course);
    List<Student> getStudents(UUID uuid,String courseName);

}
