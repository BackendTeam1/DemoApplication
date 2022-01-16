package com.backendteam1.project.service;

import java.util.List;

import com.backendteam1.project.model.Student;

public interface StudentService {
	
	Student saveStudent(Student student);
	
	List<Student> getAllStudents();
	
	String deleteStudentById(long id);
	
	List<Student> getSortedStudents();
	
	Student getStudentById(long id);
	
	Student getStudentByName(String name);
	
	Student updateStudentDetails(Student student, long id);
}
