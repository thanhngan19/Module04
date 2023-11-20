package com.example.picture_of_day.repository;

import com.example.picture_of_day.model.PointFeed;

import java.util.List;

public interface IPointRepository  {
    List<PointFeed> findAll();
}
