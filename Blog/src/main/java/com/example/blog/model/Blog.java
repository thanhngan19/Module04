package com.example.blog.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@Entity

public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String content;
    private String header;
    private String footer;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date createDate;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date updateDate;
    private String contentPrimary;

    public Blog(int id, String content, String header, String footer, Date createDate, Date updateDate, String contentPrimary) {
        this.id = id;
        this.content = content;
        this.header = header;
        this.footer = footer;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.contentPrimary = contentPrimary;
    }
    @ManyToOne
    @JoinColumn(name = "id_category",referencedColumnName = "id",unique = true)
    private Category getCategory;


    public Blog() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getContentPrimary() {
        return contentPrimary;
    }

    public void setContentPrimary(String contentPrimary) {
        this.contentPrimary = contentPrimary;
    }

    public Blog(int id, String content, String header, String footer, Date createDate, Date updateDate, String contentPrimary, Category getCategory) {
        this.id = id;
        this.content = content;
        this.header = header;
        this.footer = footer;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.contentPrimary = contentPrimary;
        this.getCategory = getCategory;
    }

    public Category getGetCategory() {
        return getCategory;
    }

    public void setGetCategory(Category getCategory) {
        this.getCategory = getCategory;
    }

}
