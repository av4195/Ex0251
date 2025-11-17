package com.example.ex0251;

import android.widget.TextView;

public class Dog extends Animal implements Runnable{

    public Dog(){

    }

    public void eat(){
        System.out.print("The dog eats meat");
    }

    public void makeSound(){
        System.out.print("waff");
    }

    public void run(){
        System.out.print("Dog is running");
    }
}
