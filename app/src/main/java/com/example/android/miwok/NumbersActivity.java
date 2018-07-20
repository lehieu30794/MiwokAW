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
        words.add(new Word ("Three", "tolookosu"));
        words.add(new Word ("Four", "oyyisa"));
        words.add(new Word ("Five", "massokka"));
        words.add(new Word ("Six", "temmokka"));
        words.add(new Word ("Seven", "kenekaku"));
        words.add(new Word ("Eight", "kawinta"));
        words.add(new Word ("Nine", "wo’e"));
        words.add(new Word ("Ten", "na’aacha"));
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

//        Constructor with 3 inputs; ArrayAdapter requires a single TextView

        WordAdapter adapter = new WordAdapter(this, words);

       /* ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this,
                R.layout.list_item, words);*/

        ListView listView = (ListView) findViewById(R.id.list);

//        Implements interface ListAdapter named itemsAdapter (Android team has already created)
//        ArrayAdapter is subclass of BaseAdapter and Base Adapter implements ListAdapter interface => BaseAdapter can use anywhere requires ListAdapter; the same for ArrayAdapter
        listView.setAdapter(adapter);
    }
}
