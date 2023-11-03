package com.example.ss8_ex1_form.service;

import com.example.ss8_ex1_form.model.User;
import com.example.ss8_ex1_form.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    IUserRepository repo;
    @Override
    public void save(User user) {
        repo.save(user);
    }
}
