package com.example.android.miwok;

/**
 * Created by YB on 20.11.2016.
 */
public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int imageResourceId;

    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
