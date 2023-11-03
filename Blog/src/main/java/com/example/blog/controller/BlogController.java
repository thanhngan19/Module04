package com.example.blog.controller;

import com.example.blog.dto.BlogDto;
import com.example.blog.model.Blog;
import com.example.blog.model.Category;
import com.example.blog.service.IBlogService;
import com.example.blog.service.ICategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import org.springframework.data.domain.Pageable;
import java.util.List;

@Controller
@RequestMapping(value = "/blog")
public class BlogController {
    @Autowired
    IBlogService service;
    @Autowired
    ICategoryService category;

    @GetMapping(value = "")
    public String findAll(@PageableDefault(page=0,size=1,sort="content",direction= Sort.Direction.ASC) Pageable pageable,
                          @RequestParam(defaultValue = "",required = false) String searchName,
                          Model model) {
        Page<Blog> list= service.findAll(pageable,searchName);
        model.addAttribute("list", list);
        return "list";
    }

    @GetMapping(value = "/view/{id}")
    public String viewDetail(@PathVariable int id, Model model) {
        Blog list = service.findById(id);
        model.addAttribute("list", list);
        return "detail";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        Blog de = service.findById(id);
        service.delete(de);
        return "redirect:/blog";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("blogDto", new BlogDto());
        List<Category> cate = category.findAll();
        model.addAttribute("cate", cate);
        return "create";
    }


    @PostMapping("/create")
    public String addNew(@ModelAttribute("blogDto") BlogDto blogDto,
                         BindingResult bindingResult, Model model) {
        new BlogDto().validate(blogDto, bindingResult);
       if(bindingResult.hasErrors()){
           List<Category> cate = category.findAll();
           model.addAttribute("cate", cate);
           model.addAttribute("blogDto",blogDto);
           return"create";
       }
      else{
           Blog blog = new Blog();
           BeanUtils.copyProperties(blogDto,blog);
           service.add(blog);
           return"redirect:/blog";
       }
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        List<Category> cate = category.findAll();
        model.addAttribute("cate", cate);
        Blog blogDelete = service.findById(id);
        model.addAttribute("blog", blogDelete);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("blog") Blog blog) {
        service.add(blog);
        return "redirect:/blog";
    }
}
