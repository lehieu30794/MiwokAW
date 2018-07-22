package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> familyItems = new ArrayList<Word>();


        familyItems.add(new Word("father","әpә", R.drawable.number_one));
        familyItems.add(new Word("mother","әṭa", R.drawable.number_one));
        familyItems.add(new Word("son","angsi", R.drawable.number_one));
        familyItems.add(new Word("daugher","tune", R.drawable.number_one));
        familyItems.add(new Word("older brother","taachi", R.drawable.number_one));
        familyItems.add(new Word("younger brother","chalitti", R.drawable.number_one));
        familyItems.add(new Word("older sister","teṭe", R.drawable.number_one));
        familyItems.add(new Word("younger sister","kolliti", R.drawable.number_one));
        familyItems.add(new Word("gandmother","ama", R.drawable.number_one));
        familyItems.add(new Word("grandfather","paapa", R.drawable.number_one));


      /*  familyMembers.add("father");
        familyMembers.add("mother");
        familyMembers.add("son");
        familyMembers.add("daughter");
        familyMembers.add("older brother");
        familyMembers.add("younger brother");
        familyMembers.add("older sister");
        familyMembers.add("younger sister");
        familyMembers.add("grandmother");
        familyMembers.add("grandfather");*/

        WordAdapter itemAdapter = new WordAdapter(this,familyItems);
        /*Interesting! Delete the data type before coding; probably because the FamilyAdapter was modified without requiring data type input
        FamilyAdapter<familyList> itemAdapter = new ArrayAdapter<familyList>(this, familyList);*/

        ListView familyListView = (ListView) findViewById(R.id.family_list_view);
        familyListView.setAdapter(itemAdapter);
    }


}
