package com.example.pictureofday.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FeedBack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String feedback;
    private int count;
    @OneToMany(mappedBy = "feed")
    Set<Picture> picture;

    public FeedBack() {
    }

    public FeedBack(int id, String feedback, int like, Set<Picture> picture) {
        this.id = id;
        this.feedback = feedback;
        this.count = like;
        this.picture = picture;
    }

    public FeedBack(int id, String feedback, int count) {
        this.id = id;
        this.feedback = feedback;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getLike() {
        return count;
    }

    public void setLike(int count) {
        this.count = count;
    }

    public Set<Picture> getPicture() {
        return picture;
    }

    public void setPicture(Set<Picture> picture) {
        this.picture = picture;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
