package com.example.picture_of_day.service;

import com.example.picture_of_day.model.FeedBack;

import java.util.List;

public interface IFeedBackService {
    void add(FeedBack feedBack);
    List<FeedBack> findAll();
    void addCount(int id);
}
