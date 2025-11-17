package com.example.ex0251;

import android.widget.TextView;

public class Dog extends Animal {
    TextView tv;
    public Dog(){

    }

    public void eat(){

    }

    public void makeSound(){
        tv.setText("waff");
    }
}
