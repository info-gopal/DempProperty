package com.infovision.employeeapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infovision.employeeapplication.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
