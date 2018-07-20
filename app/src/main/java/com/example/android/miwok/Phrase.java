package com.example.android.miwok;

public class Phrase {

    private String mMiwokPhrase;
    private String mDefaultPhrase;

    public Phrase(String a, String b) {
        mMiwokPhrase = a;
        mDefaultPhrase = b;
    }

    public String getMiwokPhrase() {
        return mMiwokPhrase;
    }

    public String getDefaultPhrase() {
        return mDefaultPhrase;
    }
}
