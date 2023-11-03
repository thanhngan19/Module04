package com.example.ss4_ex1_thymeleaf.service;

import com.example.ss4_ex1_thymeleaf.model.Product;

import java.util.ArrayList;

public interface IProductService {
    ArrayList<Product> findAll();
    void editProduct(Product product);
    void addNew(Product product);
    Product findById(int id);
    ArrayList<Product>  findProduct( String name);
    void deleteProduct(int id);
}
