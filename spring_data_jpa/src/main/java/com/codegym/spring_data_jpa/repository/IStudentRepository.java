package com.codegym.spring_data_jpa.repository;



import com.codegym.spring_data_jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IStudentRepository extends JpaRepository<Student,Integer> {
    // tạo method bằng method nameI
    List<Student> findStudentByNameContaining(String searchName);
    // tạo câu query thuần
    @Query(value = "select * from student where name like :searchName",nativeQuery = true)
    List<Student> searchByName(@Param("searchName")String searName);
}
