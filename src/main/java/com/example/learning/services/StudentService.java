package com.example.learning.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.learning.models.Student;
import com.example.learning.repositories.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public ResponseEntity<?> addStudent(Student student) {
		
		student = studentRepository.save(student);
		return ResponseEntity.status(HttpStatus.OK).body(student);
	}

	public ResponseEntity<?> getAllStudents() {
		List<Student> studentList = studentRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(studentList);
	}

	public ResponseEntity<?> getStudentById(Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(studentRepository.findById(id));
	}

	public ResponseEntity<?> deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfully");
	}

	
}
