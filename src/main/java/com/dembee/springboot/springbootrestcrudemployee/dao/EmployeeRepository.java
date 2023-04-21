package com.dembee.springboot.springbootrestcrudemployee.dao;

import com.dembee.springboot.springbootrestcrudemployee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //No need code this here
}
