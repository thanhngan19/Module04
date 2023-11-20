package com.example.picture_of_day.service;

import com.example.picture_of_day.model.PointFeed;

import java.util.List;

public interface IPointService {
    List<PointFeed> findAll();
}
