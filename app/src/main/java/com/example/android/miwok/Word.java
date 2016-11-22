package com.example.android.miwok;

/**
 * Created by YB on 20.11.2016.
 */
public class Word {

    private final static int HAS_NOT_INITIALIZED = -1;

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = HAS_NOT_INITIALIZED;

    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceId) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mImageResourceId = mImageResourceId;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasmImage() {
        if (getmImageResourceId() == HAS_NOT_INITIALIZED) {
            return false;
        } else {
            return true;
        }
    }
}
