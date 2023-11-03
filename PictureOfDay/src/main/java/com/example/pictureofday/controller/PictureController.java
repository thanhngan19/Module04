package com.example.pictureofday.controller;

import com.example.pictureofday.model.FeedBack;
import com.example.pictureofday.model.Picture;
import com.example.pictureofday.repository.IPictureRepository;
import com.example.pictureofday.service.IFeedBackService;
import com.example.pictureofday.service.IPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value ="/picture")
public class PictureController {
    @Autowired
    IPictureService pic;
    @Autowired
    IFeedBackService feed;
    @Autowired
    private IPictureRepository iPictureRepository;

    @GetMapping("")
    public String showList(Model model){
        List<FeedBack> list= feed.findAll();
        model.addAttribute("list", list);
        model.addAttribute("picture", new Picture());
        return  "view";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("picture") Picture picture){
        long millis=System.currentTimeMillis();
        java.sql.Date date=new java.sql.Date(millis);
        picture.setToday(date);
        pic.create(picture);
        return"redirect:/picture/list";
    }
    @GetMapping("/list")
    public String list(@PageableDefault(page=0,size=4,sort="author",direction= Sort.Direction.ASC) Pageable pageable,
                       Model model){
        long millis=System.currentTimeMillis();
        java.sql.Date date=new java.sql.Date(millis);
        Page<Picture> list= pic.findAll(pageable,date);
        model.addAttribute("list",list);
        return"show";
    }
   @GetMapping("/count/{id}")
    public String addCount(@PathVariable int id){
        pic.addCount(id);
        return"redirect:/picture/list";
   }

}
