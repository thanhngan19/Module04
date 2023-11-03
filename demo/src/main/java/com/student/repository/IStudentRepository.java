package com.student.repository;


import com.student.model.Student;

import java.util.ArrayList;

public interface IStudentRepository {
    ArrayList<Student> getStudent();
    void addStudent(Student student);
    Student getStudentById(int id);
    void editStudent(String name,int id);
}
