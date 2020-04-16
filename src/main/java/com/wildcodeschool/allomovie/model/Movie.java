package com.wildcodeschool.allomovie.model;

import java.util.Date;

public class Movie {

    private long id;
    private String title;
    private String picture; // picture url
    private double rate;
    private Date release;
    private boolean pg13;

    public Movie() {}

    public Movie(long id, String title, String picture, double rate, Date release, boolean pg13) {
        this.id = id;
        this.title = title;
        this.picture = picture;
        this.rate = rate;
        this.release = release;
        this.pg13 = pg13;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Date getRelease() {
        return release;
    }

    public void setRelease(Date release) {
        this.release = release;
    }

    public boolean isPg13() {
        return pg13;
    }

    public void setPg13(boolean pg13) {
        this.pg13 = pg13;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
