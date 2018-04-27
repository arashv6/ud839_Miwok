package com.example.android.miwok;

public class Word {
    /** default word in persian*/
    private  String farsiWord;
    /** translate word in English*/
    private  String englishWord;
    /** image resource ID */
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    /** Constructor */
    public  Word(String defaultWord, String translateWord )
    {
        farsiWord = defaultWord;
        englishWord = translateWord;
    }

    public Word(String farsiWord, String englishWord, int mImageResourceID)
    {
        this.farsiWord = farsiWord;
        this.englishWord = englishWord;
        this.mImageResourceID = mImageResourceID;
    }

    /** Second Constructor */

    public  String getFarsiWord()
    {
        return(farsiWord);
    }

    public String getEnglishWord()
    {
        return englishWord;
    }

    public int getmImageResourceID()
    {
        return mImageResourceID;
    }
    public int hasImage() {
        int out = 0;
        if (mImageResourceID != NO_IMAGE_PROVIDED) {
            out = 1;
        }/*the image is provided*/
        else {
            out = 0;
        }
        return out;
    }
}
