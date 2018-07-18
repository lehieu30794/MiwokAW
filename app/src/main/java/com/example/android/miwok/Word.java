package com.example.android.miwok;

import android.content.Context;
import android.view.View;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private Context mContext;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }


/*    public void setText(String text) {
        mText = text;
    }

    public String getText() {
        return mText;
    }*/
}
