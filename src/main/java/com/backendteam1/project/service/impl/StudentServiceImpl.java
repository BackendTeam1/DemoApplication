package com.backendteam1.project.service.impl;

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
	
	

}
