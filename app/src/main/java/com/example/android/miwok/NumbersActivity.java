package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

//        Create an arraylist of words; the first line is to call the constructor
        ArrayList<String> words = new ArrayList<String>();

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

//        Constructor with 3 inputs
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this,
                R.layout.list_item, words);

        ListView listView = (ListView) findViewById(R.id.list);

//        Implements interface ListAdapter named itemsAdapter (Android team has already created)
//        ArrayAdapter is subclass of BaseAdapter and Base Adapter implements ListAdapter interface => BaseAdapter can use anywhere requires ListAdapter; the same for ArrayAdapter
        listView.setAdapter(itemsAdapter);
    }
}
