package com.nit.service;

import java.util.List;

import com.nit.model.Employee;

public interface IEmployeeService {

	public String insertditesl(Employee employee);
	
	public String edit(Employee employee);
	
	public String deleteById(Integer id);
	
	public List<Employee> getAllStudent();
}
