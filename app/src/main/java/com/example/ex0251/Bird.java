package com.example.ex0251;

import android.widget.TextView;

public class Bird extends Animal implements Flyable{
    TextView tv;
    public Bird(){

    }

    public void eat(){
        tv.setText("Bird is eating seeds and insects.");
    }

    public void makeSound(){
        tv.setText("tweet");
    }
    public void fly(){
        tv.setText("Bird is flying");
    }

}
