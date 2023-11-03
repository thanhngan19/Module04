package com.example.pictureofday.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;

import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String author;
    private String feedback;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date today;
    @ManyToOne
    @JoinColumn(name = "feed", referencedColumnName="id")
    private FeedBack feed;
    private int count;



    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Picture() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public FeedBack getFeed() {
        return feed;
    }

    public void setFeed(FeedBack feed) {
        this.feed = feed;
    }

    public Picture(int id, String author, String feedback, Date today, FeedBack feedBack, int count) {
        this.id = id;
        this.author = author;
        this.feedback = feedback;
        this.today = today;
        this.feed = feedBack;
         this.count = count;
    }



    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }

}
