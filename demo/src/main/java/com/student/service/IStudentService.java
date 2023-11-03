package com.student.service;


import com.student.model.Student;

import java.util.ArrayList;

public interface IStudentService {
    ArrayList<Student> getStudent();
    void addStudent(Student student);
    Student getStudentById(int id);
    void editStudent(String name,int id);
}
