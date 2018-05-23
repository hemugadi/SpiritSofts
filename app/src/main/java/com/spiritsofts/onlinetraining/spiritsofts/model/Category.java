package com.spiritsofts.onlinetraining.spiritsofts.model;

import java.util.List;

public class Category {
    private String categoryTitle;
    private List<Subject> subjects;

    public Category() {

    }

    public Category(String title, List<Subject> subjects) {
        this.categoryTitle = title;
        this.subjects = subjects;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String name) {
        this.categoryTitle = name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

}
