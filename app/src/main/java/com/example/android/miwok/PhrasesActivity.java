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

        ArrayList<Word> phrases = new ArrayList<Word>();

        phrases.add(new Word("Where are you going?","minto wuksus"));
        phrases.add(new Word("What is your name?","tinnә oyaase'nә"));
        phrases.add(new Word("My name is...","oyaaset..."));
        phrases.add(new Word("How are you feeling?","michәksәs?"));
        phrases.add(new Word("I’m feeling good.","kuchi achit"));
        phrases.add(new Word("Are you coming?","әәnәs'aa?"));
        phrases.add(new Word("Yes, I’m coming.","hәә’ әәnәm"));
        phrases.add(new Word("I’m coming.","әәnәm"));
        phrases.add(new Word("Let’s go.","yoowutis"));
        phrases.add(new Word("Come here.","әnni'nem"));

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

        WordAdapter phrasesAdapter = new WordAdapter (this, phrases);

        ListView phrasesListView = (ListView) findViewById(R.id.phrases_list);
        phrasesListView.setAdapter(phrasesAdapter);
    }
}
