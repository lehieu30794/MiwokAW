package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Color> colors = new ArrayList<Color>();

        colors.add(new Color ("red", "weṭeṭṭi"));
        colors.add(new Color ("red", "weṭeṭṭi"));
        colors.add(new Color ("red", "weṭeṭṭi"));
        colors.add(new Color ("red", "weṭeṭṭi"));
        colors.add(new Color ("red", "weṭeṭṭi"));
        colors.add(new Color ("red", "weṭeṭṭi"));
        colors.add(new Color ("red", "weṭeṭṭi"));
        colors.add(new Color ("red", "weṭeṭṭi"));

        ColorAdapter itemAdapter = new ColorAdapter(this, colors);

        ListView listView = (ListView) findViewById(R.id.color_list);
        listView.setAdapter(itemAdapter);

    }
}
