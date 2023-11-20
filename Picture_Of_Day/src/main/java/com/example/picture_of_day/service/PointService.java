package com.example.picture_of_day.service;

import com.example.picture_of_day.model.PointFeed;
import com.example.picture_of_day.repository.IPointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointService implements IPointService{
    @Autowired
    IPointRepository repo;


    @Override
    public List<PointFeed> findAll() {
        return repo.findAll();
    }
}
