package com.backendteam1.project.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	
	//creating / saving student data
	@PostMapping("/create")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		
		return new ResponseEntity<Student>(studentService.saveStudent(student), HttpStatus.CREATED);
		
	}
	
	
	//Retrieving all students data
	@GetMapping("/fetch_all")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	
	//Retrieve specific student by name ("/search_by_name) return a list of students
	

	//Retrieve specific students by id ("/search_by_id)
	//Implemented by Aditya
	


	//Delete specific student by id ("/delete")
	
	
	
	//Update specific student data by id ("/update")
	

	
	//Sort student by first name ("/sort") return a list of student in ascending order
	


	//Sort students by first name and return only specific number of objects ("/sort?5") user will pass one integer, return list of students
	
	

}
