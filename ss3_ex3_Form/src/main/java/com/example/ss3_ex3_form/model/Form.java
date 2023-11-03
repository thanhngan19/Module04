package com.example.ss3_ex3_form.model;

public class Form {
    private String name;
    private String birthday;
    private String gender;
    private String nationality;
    private String CMND;
    private String [] vehicle;
    private String idVehicle;
    private String date;
    private String month;
    private String year;
    private String city;
    private String province;
    private String district;
    private String ward;
    private String email;
    private String address;
    private String phoneNumber;
    private String [] symptom;
    private String [] infection;

    public Form() {
    }

    public Form(String name, String birthday, String gender, String nationality, String CMND, String[] vehicle, String idVehicle, String date, String month, String year, String city, String province, String district, String ward, String email, String address, String phoneNumber, String[] symptom, String[] infection) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.nationality = nationality;
        this.CMND = CMND;
        this.vehicle = vehicle;
        this.idVehicle = idVehicle;
        this.date = date;
        this.month = month;
        this.year = year;
        this.city = city;
        this.province = province;
        this.district = district;
        this.ward = ward;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.symptom = symptom;
        this.infection = infection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String[] getVehicle() {
        return vehicle;
    }

    public void setVehicle(String[] vehicle) {
        this.vehicle = vehicle;
    }

    public String getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(String idVehicle) {
        this.idVehicle = idVehicle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getSymptom() {
        return symptom;
    }

    public void setSymptom(String[] symptom) {
        this.symptom = symptom;
    }

    public String[] getInfection() {
        return infection;
    }

    public void setInfection(String[] infection) {
        this.infection = infection;
    }
}
