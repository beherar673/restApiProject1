package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.model.Employee;

public interface IEmployeeRepritory extends JpaRepository<Employee,Integer> {

}
