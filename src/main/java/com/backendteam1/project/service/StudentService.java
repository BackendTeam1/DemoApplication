package com.backendteam1.project.service;

import java.util.List;

import com.backendteam1.project.model.Student;

public interface StudentService {
	
	Student saveStudent(Student student);
	
	List<Student> getAllStudents();

}
