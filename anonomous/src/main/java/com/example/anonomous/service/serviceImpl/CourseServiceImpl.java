package com.example.anonomous.service.serviceImpl;

import com.example.anonomous.entity.Course;
import com.example.anonomous.entity.Student;
import com.example.anonomous.repository.CourseRepository;
import com.example.anonomous.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseRepository courseRepository;
    @Override
    public Course getCourse(UUID uuid) {
        return courseRepository.findCourseByUuid(uuid);
    }

    @Override
    public Course getCourse(String name) {

        return courseRepository.findCourseByName(name);
    }

    @Override
    public List<Student> getStudents(Course course) {
        return null;
    }

    @Override
    public List<Student> getStudents(UUID uuid, String courseName) {
        return null;
    }
}
