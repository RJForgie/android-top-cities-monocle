package com.example.ryanforgie.androidlistview;

import java.util.ArrayList;

/**
 * Created by ryanforgie on 20/09/2017.
 */

public class TopCities {

    private ArrayList<City> list;

    public TopCities() {
        list = new ArrayList<City>();
        list.add(new City (1, "Tokyo", "Japan", R.drawable.japan7));
        list.add(new City (2, "Vienna", "Austria", R.drawable.austria));
        list.add(new City (3, "Berlin", "Germany", R.drawable.germany5));
        list.add(new City (4, "Munich", "Germany", R.drawable.germany5));
        list.add(new City (5, "Melbourne", "Australia", R.drawable.australia));
        list.add(new City (6, "Copehagen", "Denmark", R.drawable.denmark));
        list.add(new City (7, "Sydney", "Australia", R.drawable.australia));
        list.add(new City (8, "Zurich", "Switzerland", R.drawable.switzerland15));
        list.add(new City (9, "Hamburg", "Germany", R.drawable.germany5));
        list.add(new City (10, "Madrid", "Spain", R.drawable.spain13));
        list.add(new City (11, "Stockholm", "Sweden", R.drawable.sweden14));
        list.add(new City (12, "Kyoto", "Japan", R.drawable.japan7));
        list.add(new City (13, "Helsinki", "Finland", R.drawable.finland4));
        list.add(new City (14, "Fukuoka", "Japan", R.drawable.japan7));
        list.add(new City (15, "Hong Kong", "Hong Kong", R.drawable.hong_kong6));
        list.add(new City (16, "Lisbon", "Portugal", R.drawable.portugal11));
        list.add(new City (17, "Barcelona", "Spain", R.drawable.spain13));
        list.add(new City (18, "Vancouver", "Canada", R.drawable.canada3));
        list.add(new City (19, "Dusseldorf", "Germany", R.drawable.germany5));
        list.add(new City (20, "Amsterdam", "Netherlands", R.drawable.netherlands8));
        list.add(new City (21, "Singapore", "Singapore", R.drawable.singapore12));
        list.add(new City (22, "Auckland", "New Zealand", R.drawable.new_zealand9));
        list.add(new City (23, "Brisbane", "Australia", R.drawable.australia));
        list.add(new City (24, "Portland", "USA", R.drawable.usa));
        list.add(new City (25, "Oslo", "Norway", R.drawable.norway10));
    }

    public ArrayList<City>  getList() {
        return new ArrayList<City>(list);
    }


}
