package com.infovision.employeeapplication.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EmployeeConfiguration {

	@Bean
	ModelMapper  modelMapper() {
		ModelMapper mapper=new ModelMapper();
		return mapper;
	}
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	
}
