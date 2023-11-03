package com.example.spring_jpa.repository;

import com.example.spring_jpa.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface IStudentRepository extends JpaRepository<Student,Integer> {

    List<Student> findStudentByNameContaining(String name);
    Page<Student> findStudentByNameContaining(Pageable pageable,String searchName);


}
