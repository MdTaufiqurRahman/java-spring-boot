package com.example.learning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learning.models.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
