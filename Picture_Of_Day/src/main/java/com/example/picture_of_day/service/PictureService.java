package com.example.picture_of_day.service;

import com.example.picture_of_day.model.Picture;
import com.example.picture_of_day.repository.IPictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PictureService implements IPictureService{
    @Autowired
    IPictureRepository repository;
    @Override
    public void add(Picture pic) {
        repository.add(pic);
    }
}
