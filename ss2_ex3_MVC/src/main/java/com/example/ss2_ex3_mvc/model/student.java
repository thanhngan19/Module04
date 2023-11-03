package com.example.ss2_ex3_mvc.model;

public class student {
    private int id;
    private String name;
    private String className;
    private int gender;
    private String[] languages;

    public student() {
    }

    public student(int id, String name, String className, int gender, String[] languages) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.gender = gender;
        this.languages = languages;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }
}
