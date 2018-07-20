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

        ArrayList<Family> familyItems = new ArrayList<Family>();


        familyItems.add(new Family("Aasdf","Basdf"));

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

        FamilyAdapter itemAdapter = new FamilyAdapter(this,familyItems);
        /*Interesting! Delete the data type before coding; probably because the FamilyAdapter was modified without requiring data type input
        FamilyAdapter<familyList> itemAdapter = new ArrayAdapter<familyList>(this, familyList);*/

        ListView familyListView = (ListView) findViewById(R.id.family_list_view);
        familyListView.setAdapter(itemAdapter);
    }


}
