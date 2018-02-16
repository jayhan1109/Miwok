package com.example.android.miwok;


import android.media.MediaPlayer;
import android.widget.ImageView;

/**
 * Created by jungh on 2/14/2018.
 */

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImage = 0;
    private int mAudio;

    // Constructor
    public Word(String mDefaultTranslation, String mMiwokTranslation, int mAudio) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mAudio=mAudio;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImage, int mAudio) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImage = mImage;
        this.mAudio=mAudio;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImage() {
        return mImage;
    }

    public int getmAudio(){return mAudio;}

}
