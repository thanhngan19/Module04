package com.example.ss2_ex3_mvc.controller;

import com.example.ss2_ex3_mvc.model.student;
import com.example.ss2_ex3_mvc.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;
    @GetMapping(value = "/show")
    public ModelAndView findAll(){
        ArrayList<student> students =studentService.findAll();
      ModelAndView model = new ModelAndView("index","students",students);
      return model;
    }
    @GetMapping(value ="/create")
    public String showCreate(Model model){
        model.addAttribute("studentNew",new student());
        model.addAttribute("lan",new String[]{"Java","C++","Python"});
//        model.addAttribute("gender",new String []{"Nam","Nữ","LGBT"});
        model.addAttribute("className",new String []{"10/11","10/10","10/9"});
        return"create";
    }
    @PostMapping(value ="/create")
    public String Create(@ModelAttribute("studentNew") student student, RedirectAttributes redirect ){
        studentService.addStudent(student);
        redirect.addFlashAttribute("mess","Create Success");
       return "redirect:/show/student";
    }


}
