package com.student.controller;

import com.student.model.Student;
import com.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;


@Controller
public class StudentController {
    @Autowired
    private IStudentService studentService;
//    @RequestMapping(value = "/students/list", method = RequestMethod.GET)
    @GetMapping(value = "/students/list")
    public String getStudent(Model model) {
        ArrayList<Student> students = studentService.getStudent();
        model.addAttribute("student", students);
        return "list";
        //trả về trang jsp
    }
    @GetMapping(value="/students/add")
    public String ShowFormAdd(){
        return "add";
    }
    @PostMapping(value="/students/add")
    public String Add(@RequestParam int id,String name){
        Student student = new Student(id,name);
        studentService.addStudent(student);
        return "redirect:/students/list";
    }
    @PostMapping(value="/students/edit")
    public String getStudentEdit(@RequestParam int id,Model model){
        Student findStudent =studentService.getStudentById(id);
        model.addAttribute("id",findStudent.getId());
        model.addAttribute("name",findStudent.getName());
        return"edit";
    }



}
