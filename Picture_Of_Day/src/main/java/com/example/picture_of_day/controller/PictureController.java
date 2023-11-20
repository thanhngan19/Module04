package com.example.picture_of_day.controller;

import com.example.picture_of_day.model.FeedBack;
import com.example.picture_of_day.model.Picture;
import com.example.picture_of_day.service.IFeedBackService;
import com.example.picture_of_day.service.IPictureService;
import com.example.picture_of_day.service.IPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/picture")

public class PictureController {
    @Autowired
    IFeedBackService feed;
    @Autowired
    IPictureService picture;
    @Autowired
    IPointService point;
    @GetMapping("/view")
    public String showPicture(Model model){
        model.addAttribute("feedBack", new FeedBack());
        model.addAttribute("list", point.findAll());
        return "view";
    }
    @PostMapping("/save")
    public String saveFeed(@ModelAttribute("feedBack") FeedBack feedBack){
        long millis=System.currentTimeMillis();
        java.sql.Date date=new java.sql.Date(millis);
        Picture pics = new Picture(date);
        picture.add(pics);
        feedBack.setPicture(pics);
        System.out.println( feedBack.getPoint());
        feed.add(feedBack);
        return "redirect:/picture/list";
    }
    @GetMapping("/list")
    public String showList(Model model){
        model.addAttribute("list", feed.findAll());
        return "show";
    }
    @GetMapping("/count/{id}")
    public String addCount(@PathVariable int id){
        feed.addCount(id);
        return"redirect:/picture/list";
    }


}
