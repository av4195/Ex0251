package com.example.ex0251;

import android.widget.TextView;

public class Cat extends Animal implements Runnable{
    TextView tv;
    public Cat(){

    }
    public void eat(){
        tv.setText("The cat eats cat food.");
    }

    public void makeSound(){
        tv.setText("meaw");
    }

    public void run(){
        tv.setText("Cat is running!");
    }
}
