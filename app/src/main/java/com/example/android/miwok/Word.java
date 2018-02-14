package com.example.android.miwok;

/**
 * Created by jungh on 2/14/2018.
 */

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    // Constructor
    public Word(String mDefaultTranslation,String mMiwokTranslation){
        this.mDefaultTranslation=mDefaultTranslation;
        this.mMiwokTranslation=mMiwokTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }
}
