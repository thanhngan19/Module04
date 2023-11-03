package com.example.blog.service;



import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;


import org.springframework.data.domain.Pageable;
import java.util.List;

public interface IBlogService {
     Page<Blog> findAll(Pageable pageable, String searchName);
     boolean add(Blog blog);
     void delete(Blog blog);

     Blog findById(int id);


}
