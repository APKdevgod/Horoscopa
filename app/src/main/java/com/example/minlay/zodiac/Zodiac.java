package com.example.minlay.zodiac;

import java.io.Serializable;

public class Zodiac implements Serializable{

    Object pic;
    String name;
    String info;
    String date;

    public Zodiac(Object pic,String zodiacName,String info,String date){
        this.pic = pic;
        this.name = zodiacName;
        this.info = info;
        this.date = date;
    }
}
