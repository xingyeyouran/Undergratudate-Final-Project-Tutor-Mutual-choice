package com.example.anonomous.repository;

import com.example.anonomous.entity.Student;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;
@Repository
public interface StudentRepository extends BaseRepository<Student,Integer>{
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Student findByStudentID(@Param("studentid") int studentID);

}
