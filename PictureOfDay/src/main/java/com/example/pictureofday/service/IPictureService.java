package com.example.pictureofday.service;

import com.example.pictureofday.model.Picture;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.Date;

public interface IPictureService {
    Page<Picture> findAll(Pageable pageable, Date local);
    void create(Picture picture);
    Picture findById(int id);
    void addCount(int id);

}
