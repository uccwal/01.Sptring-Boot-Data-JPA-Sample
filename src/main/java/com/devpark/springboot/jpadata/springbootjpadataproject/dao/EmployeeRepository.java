package com.devpark.springboot.jpadata.springbootjpadataproject.dao;

import com.devpark.springboot.jpadata.springbootjpadataproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
