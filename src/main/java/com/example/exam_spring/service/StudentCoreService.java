package com.example.exam_spring.service;


import com.example.exam_spring.entity.Student;
import com.example.exam_spring.entity.StudentCore;
import com.example.exam_spring.entity.requset.CreateStudentCore;
import com.example.exam_spring.repository.StudentCoreRepo;
import com.example.exam_spring.repository.StudentRepo;
import com.example.exam_spring.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Configuration
public class StudentCoreService {


    @Autowired
    StudentCoreRepo studentCoreRepo;

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    SubjectRepo subjectRepo;

    public List<StudentCore> getAllStudentCore(){
        return studentCoreRepo.findAll();
    }

    public StudentCore createStudentCore(StudentCore studentCore) {
        return studentCoreRepo.save(studentCore);
    }

    public ResponseEntity<?> createStudentScore(CreateStudentCore data){
        try {
            var student = studentRepo.findById(data.get()).orElseThrow(
                    () -> new Exception("Student not found by id: "+data.getStudentId())
            );
            var subject = subjectRepo.findById(data.g()).orElseThrow(
                    () -> new Exception("Subject not found by id: "+data.getStudentId())
            );
            var studentScore = studentCoreRepo.save(
                    com.example.exam_spring.entity.StudentCore.builder()
                            .student(student)
                            .subject(subject)
                            .score1(data.getScore1())
                            .score2(data.getScore2())
                            .build()
            );
            return ResponseEntity.ok(studentScore);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
