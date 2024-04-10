package com.example.exam_spring.service;

import com.example.exam_spring.entity.Student;
import com.example.exam_spring.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Configuration
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public List<Student> getAllStudent(){
        return studentRepo.findAll();
    }

    public Student createStudent(Student student) {
        return studentRepo.save(student);
    }
}
