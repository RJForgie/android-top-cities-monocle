package com.example.ryanforgie.androidlistview;

import java.util.ArrayList;

/**
 * Created by ryanforgie on 20/09/2017.
 */

public class TopCities {

    private ArrayList<City> list;

    public TopCities() {
        list = new ArrayList<City>();
        list.add(new City (1, "Tokyo", "Japan", "japan7"));
        list.add(new City (2, "Vienna", "Austria", "austria2"));
        list.add(new City (3, "Berlin", "Germany", "germany5"));
        list.add(new City (4, "Munich", "Germany", "germany5"));
        list.add(new City (5, "Melbourne", "Australia", "australia1"));
        list.add(new City (6, "Copehagen", "Denmark", "denmark"));
        list.add(new City (7, "Sydney", "Australia", "australia1"));
        list.add(new City (8, "Zurich", "Switzerland", "switzerland15"));
        list.add(new City (9, "Hamburg", "Germany", "germany5"));
        list.add(new City (10, "Madrid", "Spain", "spain13"));
        list.add(new City (11, "Stockholm", "Sweden", "sweden14"));
        list.add(new City (12, "Kyoto", "Japan", "Japan"));
        list.add(new City (13, "Helsinki", "Finland", "finland4"));
        list.add(new City (14, "Fukuoka", "Japan", "japan7"));
        list.add(new City (15, "Hong Kong", "Hong Kong", "hong_kong6"));
        list.add(new City (16, "Lisbon", "Portugal", "portugal11"));
        list.add(new City (17, "Barcelona", "Spain", "spain13"));
        list.add(new City (18, "Vancouver", "Canada", "canada3"));
        list.add(new City (19, "Dusseldorf", "Germany", "germany5"));
        list.add(new City (20, "Amsterdam", "Netherlands", "netherlands8"));
        list.add(new City (21, "Singapore", "Singapore", "singapore12"));
        list.add(new City (22, "Auckland", "New Zealand", "new_zealand9"));
        list.add(new City (23, "Brisbane", "Australia", "australia1"));
        list.add(new City (24, "Portland", "USA", "usa"));
        list.add(new City (25, "Oslo", "Norway", "norway10"));
    }

    public ArrayList<City>  getList() {
        return new ArrayList<City>(list);
    }


}
