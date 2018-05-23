package com.spiritsofts.onlinetraining.spiritsofts.model;

public class Subject {
    private String title, duration, price;

    public Subject() {
    }

    public Subject(String title, String duration, String price) {
        this.title = title;
        this.duration = duration;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}