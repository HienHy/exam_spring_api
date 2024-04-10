package com.example.exam_spring.service;

import com.example.exam_spring.entity.Subject;
import com.example.exam_spring.repository.SubjectRepo;
import com.example.exam_spring.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Configuration
public class SubjectService {

    @Autowired
    SubjectRepo subjectRepo;

    public List<Subject> getAllSubject(){
        return subjectRepo.findAll();
    }

    public Subject createSubject(Subject subject) {
        return subjectRepo.save(subject);
    }
}
