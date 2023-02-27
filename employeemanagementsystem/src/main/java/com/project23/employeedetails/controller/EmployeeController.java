package com.project23.employeedetails.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project23.employeedetails.model.Employee;
import com.project23.employeedetails.service.EmployeeService;

@RestController
@RequestMapping("/empreg/")

public class EmployeeController {
	
	private EmployeeService employeeService;
	
	
	@PostMapping("/employeesdata")
 public Employee createEmployee(Employee employee) {
	 
		
	
 }
	
}
