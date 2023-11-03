package com.example.blog.service;


import com.example.blog.model.Blog;
import com.example.blog.repository.IBlogRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BlogService implements IBlogService{
    @Autowired
    IBlogRepository repo;


    @Override
    public Page<Blog> findAll(Pageable pageable, String searchName) {
        return repo.findBlogByContentContaining(pageable, searchName);
    }

    @Override
    public boolean add(Blog blog) {
        Blog blogNew = repo.save(blog);
        return(blogNew!=null);
    }

    @Override
    public void delete(Blog blog) {
      repo.delete(blog);
    }



    @Override
    public Blog findById(int id) {
         return repo.findById(id).orElse(null);
    }
}
