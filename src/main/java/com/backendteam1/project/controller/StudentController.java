package com.backendteam1.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendteam1.project.model.Student;
import com.backendteam1.project.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	
	//REST API
	
	@PostMapping()
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		
		return new ResponseEntity<Student>(studentService.saveStudent(student), HttpStatus.CREATED);
		
	}

}
