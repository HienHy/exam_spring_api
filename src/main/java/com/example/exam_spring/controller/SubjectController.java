package com.example.exam_spring.controller;

import com.example.exam_spring.entity.Student;
import com.example.exam_spring.entity.Subject;
import com.example.exam_spring.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/subject")
@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public List<Subject> getAll() {
        return subjectService.getAllSubject();
    }

    @PostMapping("/create")
    public Subject createSubject(@RequestBody Subject subject) {
        return subjectService.createSubject(subject);

    }
}
