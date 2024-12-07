package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.springboot.service.APIService;

@RestController
@RequestMapping("api")
public class ClientContoller {
	
	@Autowired
	private APIService service;
	
	@GetMapping("/")
	public String demo() {
		return "<h2>API Demo</h2>";
	}
	
	
	@GetMapping("demo1")
	public List<Object> demo1(){
		return service.displayAllStudents();
	}
	
	@GetMapping("demo2")
	public Object demo2(@RequestParam("id") int sid){
		return service.displayStudentById(sid);
	}
	
	@GetMapping("demo3")
	public List<Object> demo3(){
		return service.displayAllUsers();
	}
	
	@GetMapping("demo4/{id}")
	public Object demo4(@PathVariable("id") int uid){
		return service.displayUserById(uid);
	}
	
}
