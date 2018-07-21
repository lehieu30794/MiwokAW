package com.example.android.miwok;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

// Create a constant which indicates no Image state
    private static final int NO_IMAGE_PROVIDED = -1;


    private Context mContext;

//    Two input parameter constructor
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //    Three input parameter constructor
    public Word(String defaultTranslation, String miwokTranslation,
                int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResrouceId(){
        return mImageResourceId;
    }
// Return if has image
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;

    }


/*    public void setText(String text) {
        mText = text;
    }

    public String getText() {
        return mText;
    }*/
}
