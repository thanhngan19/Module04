package com.example.ss8_ex2_music.controller;

import com.example.ss8_ex2_music.dto.MusicDto;
import com.example.ss8_ex2_music.model.Music;
import com.example.ss8_ex2_music.service.IMusicService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/music")

public class MusicController {
    @Autowired
    IMusicService service;
    @GetMapping("")
    public String getMusic(@PageableDefault(page=0,size=4,sort="name",direction= Sort.Direction.ASC) Pageable pageable,
                           @RequestParam(defaultValue = "",required = false) String name,
                           Model model ){
        Page<Music> list= service.findAll(pageable,name);
        model.addAttribute("list",list);
        return"index";
    }
    @GetMapping("/create")
    public String formCreate(Model model){
     model.addAttribute("musicDto", new MusicDto());
     return"create";
    }
    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("musicDto") MusicDto musicDto, BindingResult bindingResult,
                         Model model){
        new MusicDto().validate(musicDto,bindingResult);
        if(bindingResult.hasErrors()){
            model.addAttribute("musicDto",musicDto);
            return"create";
        }
        Music music= new Music();
        BeanUtils.copyProperties(musicDto,music);
        service.update(music);
        return"redirect:/music";
    }
    @GetMapping("edit/{id}")
    public String showFromEdit(@PathVariable int id,Model model){
         Music find= service.findById(id);
        MusicDto musicDto = new MusicDto();
        BeanUtils.copyProperties(find,musicDto);
        model.addAttribute("musicDto",musicDto);
        return "create";
    }
    @PostMapping("/edit")
    public String edit(@Valid @ModelAttribute("musicDto") MusicDto musicDto, BindingResult bindingResult,
                       Model model){
        new MusicDto().validate(musicDto,bindingResult);
        if(bindingResult.hasErrors()){
            model.addAttribute("musicDto",musicDto);
            return"edit";
        }
        Music music= new Music();
        BeanUtils.copyProperties(musicDto,music);
        service.update(music);
        return"redirect:/music";
    }

}
