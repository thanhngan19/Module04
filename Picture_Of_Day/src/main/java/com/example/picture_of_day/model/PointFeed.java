package com.example.picture_of_day.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class PointFeed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy="point")
    Set<FeedBack> feedBack;



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public PointFeed() {
    }
}
