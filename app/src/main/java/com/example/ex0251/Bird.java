package com.example.ex0251;

import android.widget.TextView;

public class Bird extends Animal implements Flyable{
    public Bird(){

    }

    public void eat(){
        System.out.print("Bird is eating seeds and insects.");
    }

    public void makeSound(){
        System.out.print("tweet");
    }
    public void fly(){
        System.out.print("Bird is flying");
    }

}
