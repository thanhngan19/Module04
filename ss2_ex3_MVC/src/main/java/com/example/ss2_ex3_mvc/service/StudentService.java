package com.example.ss2_ex3_mvc.service;

import com.example.ss2_ex3_mvc.model.student;
import com.example.ss2_ex3_mvc.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class StudentService implements IStudentService{
    @Autowired
    private IStudentRepository studentRepository;
    @Override
    public ArrayList<student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void addStudent(student student) {
        studentRepository.addStudent(student);
    }
}
