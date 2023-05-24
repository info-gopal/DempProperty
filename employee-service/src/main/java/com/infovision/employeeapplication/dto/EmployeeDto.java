package com.infovision.employeeapplication.dto;

import lombok.Data;


@Data
public class EmployeeDto {
	
	private Long empId;
	
	private String empName;
	
	private int empAge;
	
	private String empEmail;
	
	private AddressDto addressDto;
}
