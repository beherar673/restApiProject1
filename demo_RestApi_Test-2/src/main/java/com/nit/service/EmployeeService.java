package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.model.Employee;
import com.nit.repository.IEmployeeRepritory;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private IEmployeeRepritory imEmpRepository;
	
	@Override
	public String insertditesl(Employee employee) {
		Employee emp=imEmpRepository.save(employee);
		return "Student Details insert"+emp;
	}

	@Override
	public String edit(Employee employee) {
		Employee emp=imEmpRepository.save(employee);
		return "Student details update"+emp;
	}

	@Override
	public String deleteById(Integer id) {
		imEmpRepository.deleteById(id);
		return "delete is succesfull";
	}

	@Override
	public List<Employee> getAllStudent() {
		List<Employee>emp=imEmpRepository.findAll();
		return emp;
	}

	
}
