package com.example.ss3_ex1_mail.model;

public class Mail {
    int id;
    private String[] languages;
    private String [] size;
    private int Spams_Fillter;
    private String [] signature;

    public Mail() {
    }

    public Mail(String[] languages, String[] size, int spams_Fillter, String[] signature) {
        this.languages = languages;
        this.size = size;
        Spams_Fillter = spams_Fillter;
        this.signature = signature;
    }

    public Mail(int id, String[] languages, String[] size, int spams_Fillter, String[] signature) {
        this.id = id;
        this.languages = languages;
        this.size = size;
        Spams_Fillter = spams_Fillter;
        this.signature = signature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String[] getSize() {
        return size;
    }

    public void setSize(String[] size) {
        this.size = size;
    }

    public int getSpams_Fillter() {
        return Spams_Fillter;
    }

    public void setSpams_Fillter(int spams_Fillter) {
        Spams_Fillter = spams_Fillter;
    }

    public String[] getSignature() {
        return signature;
    }

    public void setSignature(String[] signature) {
        this.signature = signature;
    }

}
