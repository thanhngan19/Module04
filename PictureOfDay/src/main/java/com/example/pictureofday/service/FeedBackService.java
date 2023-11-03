package com.example.pictureofday.service;

import com.example.pictureofday.model.FeedBack;
import com.example.pictureofday.repository.IFeedBackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FeedBackService implements IFeedBackService {
@Autowired
    IFeedBackRepository repo;
    @Override
    public List<FeedBack> findAll() {
        return repo.findAll();
    }
}
