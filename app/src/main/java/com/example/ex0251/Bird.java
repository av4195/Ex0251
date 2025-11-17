package com.example.ex0251;

import android.widget.TextView;

public class Bird extends Animal{
    TextView tv;
    public Bird(){

    }

    public void eat(){

    }

    public void makeSound(){
        tv.setText("tweet");
    }
}
