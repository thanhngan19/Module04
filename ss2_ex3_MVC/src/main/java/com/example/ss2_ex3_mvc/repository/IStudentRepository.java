package com.example.ss2_ex3_mvc.repository;

import com.example.ss2_ex3_mvc.model.student;

import java.util.ArrayList;

public interface IStudentRepository {
    ArrayList<student> findAll();
    void addStudent(student student);
}
