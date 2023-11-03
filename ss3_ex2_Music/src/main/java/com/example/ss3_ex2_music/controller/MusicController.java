package com.example.ss3_ex2_music.controller;

import com.example.ss3_ex2_music.model.Music;
import com.example.ss3_ex2_music.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;

@Controller
@RequestMapping(value ="/music")

public class MusicController {
    @Autowired
    IMusicService service;
    @GetMapping(value ="/show")
    public String showForm(Model model){
        ArrayList<Music> musicList = service.findALL();
        model.addAttribute("music", musicList);
        return "index";
    }
    @GetMapping(value ="/create")
    public String showFormCreate(Model model){
        model.addAttribute("newMusic", new Music());
        model.addAttribute("category",new String[]{"us", "uk", "speedup"});
        return "Upload";
    }
    @PostMapping(value ="/create")
        public String Create (@ModelAttribute("newMusic") Music newMusic, RedirectAttributes redirect){
        service.addMusic(newMusic);
        redirect.addFlashAttribute("mess","uploadsuccess");
        return "redirect:/music/show";
        }


}
