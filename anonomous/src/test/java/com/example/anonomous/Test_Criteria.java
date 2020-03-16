package com.example.anonomous;

import com.example.anonomous.Repository.StudentRepo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Slf4j
@Rollback(value = false)
@Transactional
public class Test_Criteria {
   @Autowired
   StudentRepo studentRepo;
    @Test
    public void test_Search(){
       studentRepo.searchStudent(11111)
             .forEach( student -> log.debug("{}",student.getName()));


    }
}
