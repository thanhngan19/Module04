package com.example.ss5_orm_music.repository;

import com.codegym.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
    boolean add(Student student);
    Student findById(int id);
}
