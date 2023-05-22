package com.nit.service;

import java.util.List;

import com.nit.entity.Student;

public interface IStudentService {

	public String registerStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getStudentBySno(int sno);
	
	public String deleteStudentBySno(int sno);
	
	public String updateStudenktMarksBySno(int sno,Double marks);
	
	public String updateStudent(Student student);
	
}
