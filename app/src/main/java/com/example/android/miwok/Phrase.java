package com.example.android.miwok;

public class Phrase {

    private String mMiwokPhrase;
    private String mDefaultPhrase;

//    Don't understand why switching this position let MiwokPhrase appear on top of DefaultPhrase. Should be otherway around according to the order
    public Phrase(String a, String b) {
        mDefaultPhrase = a;
        mMiwokPhrase = b;
    }

    public String getMiwokPhrase() {
        return mMiwokPhrase;
    }

    public String getDefaultPhrase() {
        return mDefaultPhrase;
    }
}
