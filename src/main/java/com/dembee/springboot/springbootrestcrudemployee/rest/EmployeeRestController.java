package com.dembee.springboot.springbootrestcrudemployee.rest;

import com.dembee.springboot.springbootrestcrudemployee.dao.EmployeeDao;
import com.dembee.springboot.springbootrestcrudemployee.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDao employeeDao;
    //quick and dirty: inject employee dao

    public EmployeeRestController(EmployeeDao theEmployeeDao){
        employeeDao = theEmployeeDao;
    }

    //expose "/employees"and return all employees
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeDao.findAll();
    }


}
