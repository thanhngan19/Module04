package com.example.pictureofday.repository;

import com.example.pictureofday.model.Picture;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.Date;


public interface IPictureRepository extends JpaRepository<Picture,Integer> {

    Page<Picture> findPictureByToday(Pageable pageable, Date date);

}
