package com.example.pictureofday.service;

import com.example.pictureofday.model.Picture;
import com.example.pictureofday.repository.IPictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.Date;

@Service
public class PictureService implements IPictureService {
    @Autowired
    IPictureRepository repo;

    @Override
    public Page<Picture> findAll(Pageable pageable, Date local) {
        return repo.findPictureByToday(pageable, local);
    }

    @Override
    public void create(Picture picture) {
        repo.save(picture);
    }

    @Override
    public Picture findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void addCount(int id) {
        Picture pic = repo.findById(id).orElse(null);
        pic.setCount(pic.getCount()+1);
        repo.saveAndFlush(pic);
    }
}
