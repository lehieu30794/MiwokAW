package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Phrase> phrases = new ArrayList<Phrase>();

        phrases.add(new Phrase ("abc", "def"));

/*        phrasesItem.add("Where are you going?");
        phrasesItem.add("What is your name?");
        phrasesItem.add("My name is...");
        phrasesItem.add("How are you feeling?");
        phrasesItem.add("I’m feeling good.");
        phrasesItem.add("Are you coming?");
        phrasesItem.add("Yes, I’m coming.");
        phrasesItem.add("I’m coming.");
        phrasesItem.add("Let’s go.");
        phrasesItem.add("Come here.");*/

        PhraseAdapter phrasesAdapter = new PhraseAdapter (this, phrases);

        ListView phrasesListView = (ListView) findViewById(R.id.phrases_list);
        phrasesListView.setAdapter(phrasesAdapter);
    }
}
