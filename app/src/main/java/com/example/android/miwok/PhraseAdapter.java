package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PhraseAdapter extends ArrayAdapter<Phrase> {

    public PhraseAdapter(Activity context, ArrayList<Phrase> phrases) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, phrases);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        /* Not return yet
        return super.getView(position, convertView, parent);*/
        View phraseItemView = convertView;
        if (phraseItemView == null) {
            phraseItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Phrase currentPhrase = getItem(position);

        TextView miwokPhrases = (TextView) phraseItemView.findViewById(R.id.miwok_text_view);
        miwokPhrases.setText(currentPhrase.getMiwokPhrase());

        TextView defaultPhrases = (TextView) phraseItemView.findViewById(R.id.default_text_view);
        defaultPhrases.setText(currentPhrase.getDefaultPhrase());

        return phraseItemView;
    }
}
