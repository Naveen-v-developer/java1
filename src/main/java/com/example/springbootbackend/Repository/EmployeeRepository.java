package com.example.springbootbackend.Repository;

import com.example.springbootbackend.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //all crud db methods
}