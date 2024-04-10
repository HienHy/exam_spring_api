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
@Table(name = "subjects")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subject_id;
    @Column(nullable = false)

    private String subject_code;
    @Column(nullable = false)

    private String subject_name;
    @Column(nullable = false)

    private int credit;
    @JsonIgnore
    @OneToMany(mappedBy = "subject")
    private Set<StudentCore> studentCores;





}
