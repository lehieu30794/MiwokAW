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

        ArrayList<Word> colors = new ArrayList<Word>();

        colors.add(new Word ("red", "weṭeṭṭi", R.drawable.number_one, R.raw.number_one));
        colors.add(new Word ("green", "chokokki", R.drawable.number_one, R.raw.number_one));
        colors.add(new Word ("brown", "ṭakaakki", R.drawable.number_one, R.raw.number_one));
        colors.add(new Word ("gray", "ṭopoppi", R.drawable.number_one, R.raw.number_one));
        colors.add(new Word ("black", "kululli", R.drawable.number_one, R.raw.number_one));
        colors.add(new Word ("white", "kelelli", R.drawable.number_one, R.raw.number_one));
        colors.add(new Word ("dusty yellow", "ṭopiisә", R.drawable.number_one, R.raw.number_one));
        colors.add(new Word ("mustard yellow", "chiwiiṭә", R.drawable.number_one, R.raw.number_one));

        WordAdapter itemAdapter = new WordAdapter(this, colors);

        ListView listView = (ListView) findViewById(R.id.color_list);
        listView.setAdapter(itemAdapter);

    }
}
