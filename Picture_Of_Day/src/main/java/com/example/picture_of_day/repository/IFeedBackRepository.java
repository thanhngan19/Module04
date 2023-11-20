package com.example.picture_of_day.repository;

import com.example.picture_of_day.model.FeedBack;
import com.example.picture_of_day.model.Picture;

import java.util.List;

public interface IFeedBackRepository {
    void add(FeedBack feedBack);
    List<FeedBack> findAll();
    void addCount(int id);
    FeedBack findById(int id);
}
