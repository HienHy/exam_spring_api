package com.example.exam_spring.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student_core")
public class StudentCore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long student_core_id;


    @Column(columnDefinition = "decimal(5,2)")

    private double score1;
    @Column(columnDefinition = "decimal(5,2)")

    private double score2;

    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;


    @ManyToOne
    @JoinColumn(name="subject_id")
    private Subject subject;



}
