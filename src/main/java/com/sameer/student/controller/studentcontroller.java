package com.sameer.student.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sameer.student.entity.student;
import com.sameer.student.service.studentservice;

@RestController
@RequestMapping("/student")

public class studentcontroller {
	@Autowired
	studentservice studentservice;

	public studentservice getStudentservice() {
		return studentservice;
	}

	public void setStudentservice(studentservice studentservice) {
		this.studentservice = studentservice;
	}
	@PostMapping("/create")
	public student addstudent (@RequestBody student student) {
	return studentservice.save(student);
	
}
	
	@GetMapping(path="/{id}")
	public student getstudent(@PathVariable int id)
	{
	return studentservice.getstudent(id); 
	}
	
	@PutMapping(path="/{id}") 
	public student  updatestudent(@RequestBody student student,@PathVariable int id)
	{
	return studentservice.updatestudent(id,student); 
	}

	@DeleteMapping(path="/{id}")
	public String deletestudent(@PathVariable int id)
	{
	return studentservice.deletestudent(id); 
	}
	
	@GetMapping
	public List<student> getAllstudent()
	{
	return studentservice.getstudentlist();
	}
	}





