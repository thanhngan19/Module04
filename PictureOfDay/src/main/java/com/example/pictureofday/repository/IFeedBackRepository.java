package com.example.pictureofday.repository;

import com.example.pictureofday.model.FeedBack;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFeedBackRepository extends JpaRepository<FeedBack,Integer> {

}
