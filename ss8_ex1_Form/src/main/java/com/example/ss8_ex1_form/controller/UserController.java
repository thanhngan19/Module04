package com.example.ss8_ex1_form.controller;

import com.example.ss8_ex1_form.dto.UserDto;
import com.example.ss8_ex1_form.model.User;
import com.example.ss8_ex1_form.repository.IUserRepository;
import com.example.ss8_ex1_form.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/form")
public class UserController {
    @Autowired
    IUserService service;
    @GetMapping("")
    public String showForm(Model model){
        model.addAttribute("userDto", new UserDto());
        return "view";
    }
    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("userDto") UserDto userDto, BindingResult binding, Model model){
        new UserDto().validate(userDto,binding);
        if(binding.hasErrors()){
            model.addAttribute("userDto",userDto);
                    return"view";
        }
        User userNew= new User();
        BeanUtils.copyProperties(userDto,userNew);
        service.save(userNew);
        return "redirect:/form/sweetalert";
    }
    @GetMapping("/sweetalert")
    public String sweetAlert(){
        return "alert";
    }



}
