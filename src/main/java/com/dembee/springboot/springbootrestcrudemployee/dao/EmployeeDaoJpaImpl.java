package com.dembee.springboot.springbootrestcrudemployee.dao;

import com.dembee.springboot.springbootrestcrudemployee.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoJpaImpl implements EmployeeDao{
    //define field for Entity manager
    private EntityManager entityManager;
    //set up constructor injection
    @Autowired
    public EmployeeDaoJpaImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }
    public List<Employee> findAll(){
        //create query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);
        List<Employee> employees = theQuery.getResultList();
        return employees;
    }
}
