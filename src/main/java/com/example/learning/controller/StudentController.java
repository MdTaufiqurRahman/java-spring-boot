package com.example.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learning.models.Student;
import com.example.learning.services.StudentService;


@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add")
	public ResponseEntity<?> addStudent(@RequestBody Student student){
		return studentService.addStudent(student);
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getStudentById(@PathVariable(name = "id") Long stdId) {
		return studentService.getStudentById(stdId);
	}
	
	@DeleteMapping("/{id}/delete")
	public ResponseEntity<?> deleteStudentById(@PathVariable(name="id") Long stdId){
		return studentService.deleteStudentById(stdId);
	}
	
	


}
