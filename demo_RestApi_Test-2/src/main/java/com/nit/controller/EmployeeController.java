package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Employee;
import com.nit.service.IEmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private IEmployeeService iemplService;
//	//by using @RequestParam
//	@GetMapping("/show")
//    public String showEmploye(@RequestParam String name) {
//		return "one Employ "+name;
//	}
//	//by using @PathVariable
//	@GetMapping("/secend/{name}/{age}")
//	public String showEmpditels(@PathVariable String name,@PathVariable int age) {
//		return "Emp Details "+name+" "+age;
//	}
	
	//insert controller
	@PostMapping("/saveStudent")
	  public String saveEmployee(@RequestBody Employee employee) {
		//iemplService.insertditesl(employee);
			String msg=iemplService.insertditesl(employee);
			return msg;
	}
	@PutMapping("/update")
	public String updateEmployee(@RequestBody Employee employee) {
		String msg=iemplService.edit(employee);
		return "update completed"+msg;
	}
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable Integer id) {
		String msg=iemplService.deleteById(id);
		return "Employee id is deleted"+msg;
	}
	@GetMapping("/findall")
	public List<Employee> findAll(){
		List<Employee>emp=iemplService.getAllStudent();
		return emp;
	}
	
	
	
	
}
