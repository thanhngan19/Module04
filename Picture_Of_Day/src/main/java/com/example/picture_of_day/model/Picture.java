package com.example.picture_of_day.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity

public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date today;
    @OneToMany(mappedBy="picture")
    Set<FeedBack> feedBack;

    public Picture(int id, Date today, Set<FeedBack> feedBack) {
        this.id = id;
        this.today = today;
        this.feedBack = feedBack;
    }

    public Picture() {

    }

    public Picture( Date today) {

        this.today = today;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }

    public Set<FeedBack> getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(Set<FeedBack> feedBack) {
        this.feedBack = feedBack;
    }

}
