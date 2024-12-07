package com.klef.jfsd.springboot.service;

import java.util.List;

public interface APIService {
	
	//Internal API- Spring Boot Rest API JPA Project
	public List<Object> displayAllStudents();
	public Object displayStudentById(int sid);
	
	//External API -JSON Placeholder
	
	public List<Object> displayAllUsers();
	public Object displayUserById(int uid);
	

}
