package com.infovision.employeeapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.infovision.employeeapplication.dto.EmployeeDto;
import com.infovision.employeeapplication.entities.Employee;
import com.infovision.employeeapplication.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	
	@PostMapping
	ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employee){
		
		
		
		return employeeService.saveEmployee(employee);
		
		
	}
	
	
	@GetMapping("/{empid}")
	ResponseEntity<EmployeeDto> getEmployeDetailsById(@PathVariable("empid") Long empid){
		
		
		
		return employeeService.getEmployeDetailsById(empid);
		
		
	}
	
	
	

}
