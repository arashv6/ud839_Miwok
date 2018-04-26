package com.example.android.miwok;

public class Word {
    /** default word in persian*/
    private  String farsiWord;
    /** translate word in English*/
    private  String englishWord;
    /** Constructor */
    public  Word(String defaultWord, String translateWord )
    {
        farsiWord = defaultWord;
        englishWord = translateWord;
    }
    public  String getFarsiWord()
    {
        return(farsiWord);
    }

    public String getEnglishWord() {
        return englishWord;
    }
}
