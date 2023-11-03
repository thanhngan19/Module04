package com.codegym.spring_data_jpa.service;


import com.codegym.spring_data_jpa.model.Student;
import com.codegym.spring_data_jpa.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    // DI interface
    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> search(String searchName) {
        return studentRepository.findStudentByNameContaining("%"+searchName+"%");
    }

    @Override
    public boolean add(Student student) {
        Student newStudent = studentRepository.save(student);
        return (newStudent!=null);
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id).orElse(null);
    }
}
