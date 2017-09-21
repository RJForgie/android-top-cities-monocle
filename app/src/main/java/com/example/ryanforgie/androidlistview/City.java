package com.example.ryanforgie.androidlistview;

/**
 * Created by ryanforgie on 20/09/2017.
 */


public class City {

    private int ranking;
    private String name;
    private String country;
    private String imageName;

    public City(Integer ranking, String name, String country, String imageName) {
        this.ranking = ranking;
        this.name = name;
        this.country = country;
        this.imageName = imageName;
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

    public String getImageName() {
        return imageName;
    }


}