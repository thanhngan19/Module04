package com.student.repository;
import com.student.model.Student;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
@Repository
public class StudentRepository implements IStudentRepository {
    private static ArrayList<Student> students = new ArrayList<Student>();
    static{
        students.add(new Student(1,"John"));
        students.add(new Student(1,"John"));
        students.add(new Student(1,"John"));
    }

    @Override
    public ArrayList<Student> getStudent() {
        return students;
    }
    public  void addStudent(Student student) {
        students.add(student);
    }
    public Student getStudentById(int id){
        Student studentFind = null;
        for(Student student : students){
            if(student.getId()==id){
                studentFind= student;
            }
        }
        return studentFind;
    }
    public  void editStudent(String name,int id){
        for(Student student : students){
            if(student.getId()==id){
                student.setName(name);
            }
        }
    }
}
