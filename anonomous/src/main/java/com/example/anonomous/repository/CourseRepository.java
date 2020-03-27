package com.example.anonomous.repository;

import com.example.anonomous.entity.Course;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository

public interface CourseRepository extends BaseRepository<Course,Integer> {
    Course findCourseByUuid(@Param("uuid") UUID uuid);
    Course findCourseByName(@Param("name") String name);
}
