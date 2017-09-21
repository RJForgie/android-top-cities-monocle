package com.example.ryanforgie.androidlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopCitiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_cities);

        TopCities topCities = new TopCities();
        ArrayList<City> list = topCities.getList();

        TopCitiesAdapter cityAdapter = new TopCitiesAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(cityAdapter);

    }

    public void getCity(View listItem){
        City city = (City) listItem.getTag();
        Log.d("City:" ,city.getName());
    }
}
