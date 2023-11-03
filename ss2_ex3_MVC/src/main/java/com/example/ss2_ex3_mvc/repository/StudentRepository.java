package com.example.ss2_ex3_mvc.repository;

import com.example.ss2_ex3_mvc.model.student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public class StudentRepository implements IStudentRepository{
    static ArrayList<student> students = new ArrayList<student>();
    static{
        students.add(new student(1, "John","10/11",0, new String[]{"Java", "Python"}));
        students.add(new student(2, "hi","10/12",1,new String[]{"Java", "Python"}));
        students.add(new student(3, "fg","10/13",0,new String[]{"Java", "Python"}));
        students.add(new student(4, "fgghh","10/1",1,new String[]{"Java", "Python"}));
    }
    public ArrayList<student> findAll(){
        return students;
    }
    public void addStudent(student student){
        students.add(student);
    }
}
