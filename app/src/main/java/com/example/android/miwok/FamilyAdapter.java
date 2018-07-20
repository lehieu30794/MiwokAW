package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class FamilyAdapter extends ArrayAdapter<Family> {

//    Public constructor
    public FamilyAdapter(Activity context, ArrayList<Family> familyItems) {
        super(context, 0, familyItems);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /*Cut this part out bc we don't want to return this View, we want to modify further
        return super.getView(position, convertView, parent);*/

        View familyListItemView = convertView;

        if (familyListItemView == null) {
//            No need to declare a new object LayoutInflater because it is a subclass of View;
//            Interesting because it works since this entire class has a super class of ArrayAdapter, not View, but still can create LayoutInflater without declare a new object
            familyListItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
//        get current position using Family object
        Family currentFamily = getItem(position);

//        Interesting! to call findViewById, need to mention familyListItemView prior to the method (View object)
        TextView a = (TextView) familyListItemView.findViewById(R.id.miwok_text_view);

//        interesting. Call a method on an object even though haven't create any new Family object. Cast in a
        a.setText(currentFamily.getMiwokFamily());


        TextView b = (TextView) familyListItemView.findViewById(R.id.default_text_view);

        b.setText(currentFamily.getDefaultFamily());


        return familyListItemView;

    }
}
