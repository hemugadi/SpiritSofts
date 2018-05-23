package com.spiritsofts.onlinetraining.spiritsofts.model;

import android.graphics.drawable.Drawable;

public class Subject {
    private String title, duration;
    private Drawable thumbnail;

    public Subject() {
    }

    public Subject(String title, String duration,Drawable thumbnail) {
        this.title = title;
        this.duration = duration;
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Drawable getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Drawable thumbnail) {
        this.thumbnail = thumbnail;
    }
}