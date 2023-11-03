package com.example.ss2_ex2_sanwichcondiment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/sand")
public class SandWichController {
    @PostMapping(value = "/wich")
    public String showList(@RequestParam("condiment") String[] condiment, Model model){
       String result="Nguyên liệu cần làm sandwich là : ";
       for(String condiment1 : condiment){
        result = result +","+condiment1;
       }
        model.addAttribute("result", result);
        return "index";
    }
    @GetMapping(value = "/wich")
    public String showForm(Model model){
        return "index";
    }
}
