package com.example.picture_of_day.service;

import com.example.picture_of_day.model.FeedBack;
import com.example.picture_of_day.repository.IFeedBackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedBackService implements IFeedBackService {
    @Autowired
    IFeedBackRepository repo;
    @Override
    public void add(FeedBack feedBack) {
        repo.add(feedBack);
    }

    @Override
    public List<FeedBack> findAll() {
        return repo.findAll();
    }

    @Override
    public void addCount(int id) {
        repo.addCount(id);
    }
}
