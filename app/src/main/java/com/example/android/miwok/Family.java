package com.example.android.miwok;

public class Family {

    private String mMiwokFamily;
    private String mDefaultFamily;

    public Family(String a, String b) {
        mMiwokFamily = a;
        mDefaultFamily = b;

        /*Interesting! Cannot do it the reverse way like this

        a = mMiwokFamily;
        b = mDefaultFamily;*/
    }

    public String getMiwokFamily() {
        return mMiwokFamily;
    }

    public String getDefaultFamily() {
        return mDefaultFamily;
    }
}
