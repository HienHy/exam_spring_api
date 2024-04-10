package com.example.exam_spring.controller;

import com.example.exam_spring.entity.Student;
import com.example.exam_spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/student")
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;




    @GetMapping
    public List<Student> getAll() {
        return studentService.getAllStudent();
    }

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);

    }
}
