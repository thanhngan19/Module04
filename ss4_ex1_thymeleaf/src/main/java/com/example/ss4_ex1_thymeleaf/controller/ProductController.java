package com.example.ss4_ex1_thymeleaf.controller;

import com.example.ss4_ex1_thymeleaf.model.Product;
import com.example.ss4_ex1_thymeleaf.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    private IProductService productService;
    @GetMapping(value = "")
    public String getProduct(Model model){
        ArrayList<Product> pro=productService.findAll();
        model.addAttribute("product", pro);
        return "list";
    }
    @GetMapping(value = "/create")
    public String createProduct( Model model){
        model.addAttribute("product", new Product());
        return "create";
    }
    @PostMapping(value = "/create")
    public String createProduct(@ModelAttribute("product") Product product){
        productService.addNew(product);
        return "redirect:/product";
    }
    @GetMapping(value = "/edit/{id}")
    public String editProduct(@PathVariable int id, Model model){
        Product product=productService.findById(id);
        model.addAttribute("product", product);
        return "create";
    }
    @PostMapping(value = "/edit")
    public String editProduct(@ModelAttribute("product") Product product){
        productService.editProduct(product);
        return "redirect:/product";
    }
    @PostMapping(value = "/search")
    public String searchProduct(@RequestParam (name="search") String search,Model model){
        ArrayList<Product> productSearch=productService.findProduct(search);
        model.addAttribute("product",productSearch);
        return "search";
    }
    @GetMapping(value = "/delete/{id}")
    public String deleteProduct(@PathVariable  int id){
        productService.deleteProduct(id);
        return "redirect:/product";
    }



}
