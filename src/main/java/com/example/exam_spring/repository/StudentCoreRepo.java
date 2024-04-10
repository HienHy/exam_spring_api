package com.example.exam_spring.repository;

import com.example.exam_spring.entity.StudentCore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface StudentCoreRepo extends JpaRepository<StudentCore,Long> {
}
