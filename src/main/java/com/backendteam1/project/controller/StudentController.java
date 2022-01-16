package com.backendteam1.project.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	//Implemented by Aditya
	@GetMapping(value = "/search_by_name/{first_name}")
	public Student getStudent(@PathVariable String first_name)
	{
		return studentService.getStudentByName(first_name);
	}
	

	//Retrieve specific students by id ("/search_by_id)
	//Implemented by Aditya
	@GetMapping(value = "/search_by_id/{id}")
	public Student getStudent(@PathVariable long id)
	{
		return studentService.getStudentById(id);
	}
	


	//Delete specific student by id ("/delete") 
	//Implemented by : Kushal Sharma
	@DeleteMapping("/delete/{id}")
	public String Delete(@PathVariable long id)
	{
		return studentService.deleteStudentById(id);
	}
	
	
	//Update specific student data by id ("/update")
	//Implemented by Agna
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student)
	{
		return studentService.updateStudentDetails(student);
	}

	
	//Sort student by first name ("/sort") return a list of student in ascending order
	// implemented by Jai
	


	//Sort students by first name and return only specific number of objects ("/sort?5") user will pass one integer, return list of students
	//Implemented by Kushal Sharma
	@GetMapping("/sort/{noOfStudents}")
	public List<Student> students_Sorted(@PathVariable int noOfStudents)
	{			
		List<Student> finalList = new ArrayList<>();
		List<Student> sortedList = studentService.getSortedStudents();
		int count = 0;
		for(Student student: sortedList)
		{
			finalList.add(student);
			count++;
			if(count==noOfStudents)
				break;
		}
		return finalList;
	}
}
