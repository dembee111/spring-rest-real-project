package com.dembee.springboot.springbootrestcrudemployee.dao;

import com.dembee.springboot.springbootrestcrudemployee.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> findAll();
}
