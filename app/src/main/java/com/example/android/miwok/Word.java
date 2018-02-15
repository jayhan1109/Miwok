package com.example.android.miwok;


import android.widget.ImageView;

/**
 * Created by jungh on 2/14/2018.
 */

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImage=0;

    // Constructor
    public Word(String mDefaultTranslation,String mMiwokTranslation){
        this.mDefaultTranslation=mDefaultTranslation;
        this.mMiwokTranslation=mMiwokTranslation;
    }

    public Word(String mDefaultTranslation,String mMiwokTranslation,int mImage){
        this.mDefaultTranslation=mDefaultTranslation;
        this.mMiwokTranslation=mMiwokTranslation;
        this.mImage=mImage;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getmImage(){return mImage;}
}
