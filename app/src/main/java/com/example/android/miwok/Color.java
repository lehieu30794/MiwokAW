package com.example.android.miwok;

public class Color {
    private String mDefaultColor;
    private String mMiwokColor;


    public Color(String DefaultColor, String MiwokColor) {
        mDefaultColor = DefaultColor;
        mMiwokColor = MiwokColor;
    }

    public String getDeaultColor (){
        return mDefaultColor;
    }

    public String getmMiwokColor () {
        return mMiwokColor;
    }
}
