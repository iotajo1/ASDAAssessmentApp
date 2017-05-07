package com.github.iotajo1.asdaassessmentapp;

/**
 * Created by JO_ on 5/7/2017.
 */

public class Friend {

    private int phone;
    private String name;
    private String place;
    private String job;

    //constructor
    public Friend(int phone, String name, String place, String job) {
        this.phone = phone;
        this.name = name;
        this.place = place;
        this.job = job;
    }

    //getter and setter
    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
