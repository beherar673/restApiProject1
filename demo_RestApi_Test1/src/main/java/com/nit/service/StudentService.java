package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Student;
import com.nit.repository.IStudentRepository;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private IStudentRepository studentRepository;
	
	@Override
	public String registerStudent(Student student) {
		
		Student stud=studentRepository.save(student);
		return "student details saved"+stud;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student>student=studentRepository.findAll();
		return student;
	}

	@Override
	public Student getStudentBySno(int sno) {
		//return studentRepository.findById(sno).get();
		
		Optional<Student>studentOptional=studentRepository.findById(sno);
		if(studentOptional.isPresent()) {
			Student student=studentOptional.get();
			return student;
		}
		else {
			throw new IllegalArgumentException("Student not found");
		}
		
	}

	@Override
	public String deleteStudentBySno(int sno) {
		Optional<Student>studentOptional=studentRepository.findById(sno);
		if(studentOptional.isPresent()) {
			studentRepository.deleteById(sno);
			return "Student details delete having sno"+sno;
		}
		else {
			throw new IllegalArgumentException("Student not found");
		}
		
	}

	@Override
	public String updateStudenktMarksBySno(int sno ,Double marks) {
		Optional<Student>studentOptional=studentRepository.findById(sno);
		if(studentOptional.isPresent()) {
			Student student=studentOptional.get();
			student.setMarks(marks);
			studentRepository.save(student);
			return "student marks update" ;
			
		}
		else {
			throw new IllegalArgumentException("Student not found having sno"+sno);
		}
		
	}

	@Override
	public String updateStudent(Student student) {
		Student stud=studentRepository.save(student);
		
		return "student details update:"+stud;
	}

}
