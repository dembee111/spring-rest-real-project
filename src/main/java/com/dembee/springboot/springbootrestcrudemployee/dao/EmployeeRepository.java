package com.dembee.springboot.springbootrestcrudemployee.dao;

import com.dembee.springboot.springbootrestcrudemployee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //No need code this here
}
