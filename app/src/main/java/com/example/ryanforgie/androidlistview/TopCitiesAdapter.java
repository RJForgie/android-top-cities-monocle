package com.example.ryanforgie.androidlistview;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by ryanforgie on 20/09/2017.
 */

public class TopCitiesAdapter extends ArrayAdapter<City> {

    public TopCitiesAdapter(Context context, ArrayList<City> cities){
        super(context, 0, cities);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.city_item, parent, false);
        }

        City currentCity = getItem(position);

        TextView ranking = listItemView.findViewById(R.id.ranking);
        ranking.setText(currentCity.getRanking().toString());

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentCity.getName());

        TextView country = (TextView) listItemView.findViewById(R.id.country);
        country.setText(currentCity.getCountry());

        ImageView flag = (ImageView) listItemView.findViewById(R.id.flag);
        flag.setImageResource(R.drawable.japan7);

        int drawableResourceId = TopCitiesActivity.getResources().getIdentifier("nameOfDrawable", "drawable", TopCitiesActivity.getPackageName());




        listItemView.setTag(currentCity);

        return listItemView;



    }






}
