package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nit.entity.Student;
import com.nit.service.IStudentService;

@RestController
@RequestMapping
public class StudentController {

	@Autowired
	private IStudentService studentService;
	
	@GetMapping("/findAllStudent")
  public List<Student>getAllStudent(){
		List<Student>student=studentService.getAllStudent();
		return student;
	}
	@GetMapping("/findStudentById/{sno}")
  public Student getAllStudent(@PathVariable int sno) {
		Student student =studentService.getStudentBySno(sno);
		return student;
	}
	@PostMapping("/saveStudent")
	  public String saveStudent(@RequestBody Student student) {
			studentService.registerStudent(student);
			String msg=studentService.registerStudent(student);
			return msg;
	}
	@PatchMapping("/updateStudentMarks")
	    public String updateStudentMarks(@RequestParam int sno,@RequestParam Double marks) {
		String msg=studentService.updateStudenktMarksBySno(sno, marks);
		return msg;
	}
	@PutMapping("/updateStudent")
	public String updateStudent(@RequestBody Student student) {
		String msg=studentService.updateStudent(student);
		return msg;
	}
	@DeleteMapping("/deleteStudentBysno/{sno}")
		public String deleteStudentBySno( @PathVariable int sno) {
			return studentService.deleteStudentBySno(sno); 
		}
	}
	

