package com.example.ss8_ex1_form.repository;

import com.example.ss8_ex1_form.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {

}
