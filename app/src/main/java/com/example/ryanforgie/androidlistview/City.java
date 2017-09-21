package com.example.ryanforgie.androidlistview;

/**
 * Created by ryanforgie on 20/09/2017.
 */


public class City {

    private int ranking;
    private String name;
    private String country;
    private int imageId;

    public City(Integer ranking, String name, String country, int imageId) {
        this.ranking = ranking;
        this.name = name;
        this.country = country;
        this.imageId = imageId;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getImageId() {
        return imageId;
    }


}