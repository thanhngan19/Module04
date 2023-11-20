package com.example.picture_of_day.model;

import javax.persistence.*;

@Entity

public class FeedBack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String feedBack;
    private String author;
    private int count;
    @ManyToOne
    @JoinColumn(name="id_picture",referencedColumnName="id" )
    private Picture picture;

    public FeedBack(int id, String feedBack, String author, Picture picture) {
        this.id = id;
        this.feedBack = feedBack;
        this.author = author;
        this.picture = picture;
    }

    public FeedBack() {
    }
    @ManyToOne
    @JoinColumn(name="id_point",referencedColumnName="id" )
    private PointFeed point;


    public PointFeed getPoint() {
        return point;
    }

    public void setPoint(PointFeed point) {
        this.point = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public FeedBack(int id, String feedBack, String author, int count, Picture picture, PointFeed point) {
        this.id = id;
        this.feedBack = feedBack;
        this.author = author;
        this.count = count;
        this.picture = picture;
        this.point = point;
    }
}
