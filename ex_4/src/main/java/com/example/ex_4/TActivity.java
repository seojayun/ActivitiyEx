package com.example.ex_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TActivity  {

    private int imgID;
    private String title;
    private  String content;

    public TActivity(int imgID,String title,String content) {
        this.imgID=imgID;
        this.title=title;
        this.content=content;
    }

    public  int getImgID() {
        return imgID;
    }
    public  String getTitle() {
        return  title;
    }
    public String getContent() {
        return  content;
    }

    private void setImgID(int imgID) {
        this.imgID=imgID;
    }
    private void  setTitle(String title) {
        this.title=title;
    }
    private void setContent(String content) {
        this.content=content;
    }
}
