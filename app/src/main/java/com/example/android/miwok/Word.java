package com.example.android.miwok;

//  Word class is used to create content objects in Fragment classes (FamilyFragment... etc).
// These objects form ArrayLists to be added to WordAdapter and set to the ListWiew (see WordAdapter class)

public class Word {

    private final static int HAS_NOT_INITIALIZED = -1;
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mVoiceResourceId;
    private int mImageResourceId = HAS_NOT_INITIALIZED;

//    Constructor for ListItem object with no image.
// Phrases fragment's list filled with items with no image.

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mVoiceResourceId) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mVoiceResourceId = mVoiceResourceId;
    }

//    Constructor for ListItem object with image.
//  Family, Numbers, Colors fragments lists filled with items with image.

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceId, int mVoiceResourceId) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mImageResourceId = mImageResourceId;
        this.mVoiceResourceId = mVoiceResourceId;
    }

//    Getters which are used in WordApapter class to get actual data for Adapter

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

//    toString method owerridden for log purpose.

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mVoiceResourceId=" + mVoiceResourceId +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }

//    Method hasmImage(), which is used in WordAdapter to make decision add or not image to ListItem

    public boolean hasmImage() {
        if (getmImageResourceId() == HAS_NOT_INITIALIZED) {
            return false;
        } else {
            return true;
        }
    }
}
