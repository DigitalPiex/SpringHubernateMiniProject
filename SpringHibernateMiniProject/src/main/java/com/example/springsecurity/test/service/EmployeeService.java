package com.example.springsecurity.test.service;

import com.example.springsecurity.test.entity.Employee;

import java.util.List;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);

	public List<Employee> searchBy(String theFirstName, String theLastName);
	
}
