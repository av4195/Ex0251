package com.example.ex0251;

import android.widget.TextView;

public class Dog extends Animal implements Runnable{
    TextView tv;
    public Dog(){

    }

    public void eat(){
        tv.setText("The dog eats meat");
    }

    public void makeSound(){
        tv.setText("waff");
    }

    public void run(){
        tv.setText("Dog is running");
    }
}
