package com.example.ex0251;

import android.widget.TextView;

public class Cat extends Animal{
    TextView tv;
    public Cat(){

    }
    public void eat(){

    }

    public void makeSound(){
        tv.setText("meaw");
    }
}
