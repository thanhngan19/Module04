package com.example.ss4_ex1_thymeleaf.model;

public class Product {
//    id, tên sản phẩm, giá sản phẩm, mô tả của sản phẩm, nhà sản xuất.
    private int id;
    private String name;
    private float price;
    private String description;
    private String NSX;

    public Product() {
    }

    public Product(int id, String name, float price, String description, String NSX) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.NSX = NSX;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNSX() {
        return NSX;
    }

    public void setNSX(String NSX) {
        this.NSX = NSX;
    }
}
