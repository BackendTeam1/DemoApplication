package com.backendteam1.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendteam1.project.model.Student;

//@Repository annotation not required cause JpaRepository implemented class(SimpleJpaRepository) already annotated with @Repository
//@Transactional annotation also present in SimpleJpaRepository so need to add this in Service layer(Move to service layer for a watch)

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	Student findByFirstName(String name);

}
