package com.example.exam_spring.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long student_id;
    @Column(nullable = false)

    private String student_code;
    @Column(nullable = false)

    private String full_name;
    private String address;

    @JsonIgnore
    @OneToMany(mappedBy = "student")
    private Set<StudentCore> studentCores;






}
