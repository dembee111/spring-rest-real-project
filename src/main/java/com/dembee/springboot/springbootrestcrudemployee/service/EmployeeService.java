package com.dembee.springboot.springbootrestcrudemployee.service;

import com.dembee.springboot.springbootrestcrudemployee.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
