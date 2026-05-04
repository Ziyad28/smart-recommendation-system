package com.ziyad.recommendationapp.model;

public class Place {

    private String name;
    private double rating;
    private int reviews;
    private String searchName;
    private String mapUrl;

    public Place() {
    }

    public Place(String name, double rating, int reviews) {
        this.name = name;
        this.rating = rating;
        this.reviews = reviews;
        this.searchName = name;
    }

    public Place(String name, double rating, int reviews, String searchName, String mapUrl) {
        this.name = name;
        this.rating = rating;
        this.reviews = reviews;
        this.searchName = searchName;
        this.mapUrl = mapUrl;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getReviews() {
        return reviews;
    }

    public String getSearchName() {
        return searchName;
    }

    public String getMapUrl() {
        return mapUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl;
    }
}