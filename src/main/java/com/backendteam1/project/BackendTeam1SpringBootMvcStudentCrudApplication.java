package com.backendteam1.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.backendteam1.project.controller",
		"com.backendteam1.project.service.impl","com.backendteam1.project.repository",
		"com.backendteam1.project.exception"})
public class BackendTeam1SpringBootMvcStudentCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendTeam1SpringBootMvcStudentCrudApplication.class, args);
		
	}

}
