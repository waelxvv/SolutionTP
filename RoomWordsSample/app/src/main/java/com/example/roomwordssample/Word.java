package com.example.roomwordssample;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")

public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    @ColumnInfo(name = "word2")
    public String mWord2 ;

    //@ColumnInfo(name = "date") public String date ;


    public Word(@NonNull String mWord, String mWord2) {
        this.mWord = mWord;
        this.mWord2 = mWord2;
        //this.date= date;
    }
    //public String getDate(){return this.date;}
    public String getWord2(){return this.mWord2;}


    public String getWord(){return this.mWord;}
}
