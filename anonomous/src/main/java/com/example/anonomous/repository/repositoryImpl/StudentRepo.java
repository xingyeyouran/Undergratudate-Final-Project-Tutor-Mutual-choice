package com.example.anonomous.repository.repositoryImpl;

import com.example.anonomous.entity.Student;
import com.example.anonomous.repository.Srepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class StudentRepo implements Srepo {
    @PersistenceContext
    private  EntityManager manager;

    public List<Student> searchStudent( int studentID) {
        CriteriaBuilder cb=manager.getCriteriaBuilder();
        CriteriaQuery<Student> cq=cb.createQuery(Student.class);
        Root<Student> student=cq.from(Student.class);
        Predicate p1=cb.equal(student.get("studentID"),studentID);
        TypedQuery<Student> query=manager.createQuery(cq);
        return query.getResultList();

    }


}
