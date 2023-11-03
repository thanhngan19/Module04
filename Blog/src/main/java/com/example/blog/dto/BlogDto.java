package com.example.blog.dto;

import com.example.blog.model.Category;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class BlogDto implements Validator {
    private int id;
    private String content;
    private String header;
    private String footer;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateDate;
    private String contentPrimary;
    private Category getCategory;

    public BlogDto(int id, String content, String header, String footer, Date createDate, Date updateDate, String contentPrimary, Category getCategory) {
        this.id = id;
        this.content = content;
        this.header = header;
        this.footer = footer;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.contentPrimary = contentPrimary;
        this.getCategory = getCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getGetCategory() {
        return getCategory;
    }

    public void setGetCategory(Category getCategory) {
        this.getCategory = getCategory;
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

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    public BlogDto() {
    }

    public BlogDto(String content, String header, String footer, Date createDate, Date updateDate, String contentPrimary, Category getCategory) {
        this.content = content;
        this.header = header;
        this.footer = footer;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.contentPrimary = contentPrimary;
        this.getCategory = getCategory;
    }

    @Override
    public void validate(Object target, Errors errors) {
     BlogDto blogVa = (BlogDto) target; //chuyển đổi đới tuọng target dù target không phải kiểu dữ liểu blog
     if("".equals(blogVa.getContent())){
         errors.rejectValue("content",null,"Content blank");
     }
      if(!blogVa.getContent().matches("^[a-zA-Z]*$")){
         errors.rejectValue("content", null,"not match");
     }
    }
}
