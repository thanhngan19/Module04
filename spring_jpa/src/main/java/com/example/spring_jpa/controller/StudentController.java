package com.example.spring_jpa.controller;

import com.example.spring_jpa.model.Student;
import com.example.spring_jpa.service.IStudentSsrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    IStudentSsrvice service;
    @GetMapping("")
//    public ModelAndView findAll(){
//        List<Student> students = service.findAll();
//        ModelAndView model = new ModelAndView("list","students",students);
//        return model;
//    public String showList(@PageableDefault(page = 0,size = 2,sort = "name",direction = Sort.Direction.ASC) Pageable pageable,
//                           @RequestParam(defaultValue = "",required = false) String searchName,
//                           Model model) {
//        Page<Student> studentPage = service.findAll(pageable,searchName);
//        model.addAttribute("studentPage",studentPage);
//        model.addAttribute("searchName",searchName);
//        return "list";
//    }
    public String findAll(@PageableDefault(page=0,size = 2,sort = "name",direction = Sort.Direction.ASC) Pageable pageable,
                          @RequestParam(defaultValue = "",required = false) String searchName,
                           Model model){
        Page<Student> studentPage = service.findAll(pageable,searchName);
        model.addAttribute("studentPage",studentPage);
        return"list";
    }


    @GetMapping("/create")
    public String createStudent(Model model){
        model.addAttribute("student",new Student());
        return"create";
    }
    @PostMapping("/create")
    public String createStudent(@ModelAttribute("student") Student student){
        service.add(student);
        return"redirect:/student";
    }
    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable int id,Model model){
        Student edit = service.findById(id);
        model.addAttribute("edit",edit);
        return "edit";
    }
    @PostMapping("/edit")
    public String editStudent(@ModelAttribute("student") Student student){
        service.add(student);
        return"redirect:/student";
    }
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        Student student = service.findById(id);
        service.delete(student);
        return"redirect:/student";
    }
    @PostMapping("/search")
    public String search(@RequestParam String search,Model model) {
        List<Student> list = service.search(search);
        model.addAttribute("students", list);
        return "list";
    }



}
