package com.example.spring_jpa.service;

import com.example.spring_jpa.model.Student;
import com.example.spring_jpa.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService implements IStudentSsrvice{
    @Autowired
    IStudentRepository repo;
    @Override
    public List<Student> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Student> search(String searchName) {
        return repo.findStudentByNameContaining(searchName);
    }

    @Override
    public boolean add(Student student) {
        Student newStudent= repo.save(student);
        return (newStudent!=null) ;
    }

    @Override
    public Student findById(int id) {
        return repo.findById(id).orElse(null);
    }



    @Override
    public void delete(Student de) {
      repo.delete(de);
    }

    @Override
    public Page<Student> findAll(Pageable pageable, String searchName) {
        return repo.findStudentByNameContaining(pageable, searchName);
    }


}
