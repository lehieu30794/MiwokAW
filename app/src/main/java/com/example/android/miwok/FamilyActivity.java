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

        ArrayList<String> familyMembers = new ArrayList<String>();

        familyMembers.add("father");
        familyMembers.add("mother");
        familyMembers.add("son");
        familyMembers.add("daughter");
        familyMembers.add("older brother");
        familyMembers.add("younger brother");
        familyMembers.add("older sister");
        familyMembers.add("younger sister");
        familyMembers.add("grandmother");
        familyMembers.add("grandfather");


        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, familyMembers);

        ListView familyListView = (ListView) findViewById(R.id.family_list_view);
        familyListView.setAdapter(itemAdapter);
    }


}
