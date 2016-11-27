package com.example.android.miwok;

/**
 * Created by YB on 20.11.2016.
 */
public class Word {

    private final static int HAS_NOT_INITIALIZED = -1;

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mVoiceResourceId;
    private int mImageResourceId = HAS_NOT_INITIALIZED;

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mVoiceResourceId) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mVoiceResourceId = mVoiceResourceId;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceId, int mVoiceResourceId) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mImageResourceId = mImageResourceId;
        this.mVoiceResourceId = mVoiceResourceId;
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

    public int getmVoiceResourceId() {
        return mVoiceResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mVoiceResourceId=" + mVoiceResourceId +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }

    public boolean hasmImage() {
        if (getmImageResourceId() == HAS_NOT_INITIALIZED) {
            return false;
        } else {
            return true;
        }
    }
}
