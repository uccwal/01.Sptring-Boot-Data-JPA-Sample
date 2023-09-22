package com.devpark.springboot.jpadata.springbootjpadataproject.service;



import com.devpark.springboot.jpadata.springbootjpadataproject.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
