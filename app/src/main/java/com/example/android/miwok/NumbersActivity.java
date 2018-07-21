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

        words.add(new Word ("One", "lutti", R.drawable.number_one));
        words.add(new Word ("Two", "otiiko", R.drawable.number_two));
        words.add(new Word ("Three", "tolookosu", R.drawable.number_three));
        words.add(new Word ("Four", "oyyisa", R.drawable.number_four));
        words.add(new Word ("Five", "massokka", R.drawable.number_five));
        words.add(new Word ("Six", "temmokka", R.drawable.number_six));
        words.add(new Word ("Seven", "kenekaku", R.drawable.number_seven));
        words.add(new Word ("Eight", "kawinta", R.drawable.number_eight));
        words.add(new Word ("Nine", "wo’e", R.drawable.number_nine));
        words.add(new Word ("Ten", "na’aacha", R.drawable.number_ten));
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
