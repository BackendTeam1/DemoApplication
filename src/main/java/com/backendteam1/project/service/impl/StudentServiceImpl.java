package com.backendteam1.project.service.impl;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backendteam1.project.model.Student;
import com.backendteam1.project.repository.StudentRepository;
import com.backendteam1.project.service.StudentService;


//@Transactional annotation also present in SimpleJpaRepository so need to add this in Service layer(Move to service layer for a watch)
@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentRepository studentRepository;
	
	
	//@Autowired not required as our java bean class has one constructor so spring will use that constructor to inject all dependencies
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}



	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	
	@Override
	public String deleteStudentById(long id)
	{
		studentRepository.deleteById(id);
		return "Student with id: "+ Long.toString(id) +" removed successfully";
	}



	@Override
	public List<Student> getSortedStudents() 
	{	
		return studentRepository.findAll(Sort.by(Sort.Direction.ASC,"firstName"));
	}
	
	@Override
	public Student getStudentById(long id){
		return studentRepository.findById(id).get();
	}

	@Override
	public Student getStudentByName(String name){
		return studentRepository.findByFirstName(name);
	}
	
	@Override
	public Student updateStudentDetails(Student student, long id)
	{
		Student existingStudent = studentRepository.findById(id).orElse(null);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		return studentRepository.save(existingStudent);
	}

}
