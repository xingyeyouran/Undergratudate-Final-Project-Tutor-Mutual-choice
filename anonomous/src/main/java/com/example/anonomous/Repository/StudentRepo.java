package com.example.anonomous.Repository;

import com.example.anonomous.Entity.Student;
import com.example.anonomous.Repository.RepositoryImpl.BaseRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.stereotype.Repository;

import javax.naming.Name;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class StudentRepo {
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
