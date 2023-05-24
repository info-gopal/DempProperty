package com.infovision.employeeapplication.service;

import org.springframework.http.ResponseEntity;

import com.infovision.employeeapplication.dto.EmployeeDto;


public interface EmployeeService {
	
	ResponseEntity<EmployeeDto> saveEmployee(EmployeeDto employee);

	ResponseEntity<EmployeeDto> getEmployeDetailsById(Long empid);
}
