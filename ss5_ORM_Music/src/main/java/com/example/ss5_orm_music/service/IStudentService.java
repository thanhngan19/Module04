package com.example.ss5_orm_music.service;

import com.codegym.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    boolean add(Student student);
    Student findById(int id);
}
