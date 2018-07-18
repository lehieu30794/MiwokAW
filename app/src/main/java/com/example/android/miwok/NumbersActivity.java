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
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word ("One", "lutti"));
        words.add(new Word ("Two", "otiiko"));
        words.add(new Word ("Three", "otiiko"));
        words.add(new Word ("Four", "otiiko"));
        words.add(new Word ("Five", "otiiko"));
        words.add(new Word ("Six", "otiiko"));
        words.add(new Word ("Seven", "otiiko"));
        words.add(new Word ("Eight", "otiiko"));
        words.add(new Word ("Nine", "otiiko"));
        words.add(new Word ("Ten", "otiiko"));
        /*words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");*/

//        Constructor with 3 inputs
        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this,
                R.layout.list_item, words);

        ListView listView = (ListView) findViewById(R.id.list);

//        Implements interface ListAdapter named itemsAdapter (Android team has already created)
//        ArrayAdapter is subclass of BaseAdapter and Base Adapter implements ListAdapter interface => BaseAdapter can use anywhere requires ListAdapter; the same for ArrayAdapter
        listView.setAdapter(itemsAdapter);
    }
}
