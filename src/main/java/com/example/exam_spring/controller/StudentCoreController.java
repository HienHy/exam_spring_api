package com.example.exam_spring.controller;

import com.example.exam_spring.entity.Student;
import com.example.exam_spring.entity.StudentCore;
import com.example.exam_spring.entity.Subject;
import com.example.exam_spring.service.StudentCoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/student-core")
@RestController
public class StudentCoreController {

    @Autowired
    private StudentCoreService studentCoreService;



    @GetMapping
    public List<StudentCore> getAll() {
        return studentCoreService.getAllStudentCore();
    }

    @PostMapping("/create")
    public StudentCore createStudent(@RequestBody StudentCore studentCore) {
        return studentCoreService.createStudentCore(studentCore);

    }
}
