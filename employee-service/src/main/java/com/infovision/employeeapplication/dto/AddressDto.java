package com.infovision.employeeapplication.dto;

import lombok.Data;

@Data
public class AddressDto {
	
	private Long addId;
	
	private String addStreet;
	
	private String addVillage;
	
	private String addTown;
	
	private String addDist;
	
	private String addState;
	
	private Integer addPincode;
	
	private Long empId;

}
