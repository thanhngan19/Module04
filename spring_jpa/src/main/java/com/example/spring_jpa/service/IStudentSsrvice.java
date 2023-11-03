package com.example.spring_jpa.service;

import com.example.spring_jpa.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IStudentSsrvice {
    List<Student> findAll();
    List<Student> search(String searchName);

    boolean add(Student student);

    Student findById(int id);


    void delete(Student de);
    Page<Student> findAll(Pageable pageable, String searchName);
}
