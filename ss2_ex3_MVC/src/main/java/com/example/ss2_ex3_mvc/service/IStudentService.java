package com.example.ss2_ex3_mvc.service;

import com.example.ss2_ex3_mvc.model.student;

import java.util.ArrayList;

public interface IStudentService {
    ArrayList<student> findAll();
    void addStudent(student student);
}
