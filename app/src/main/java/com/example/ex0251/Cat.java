package com.example.ex0251;

import android.widget.TextView;

public class Cat extends Animal implements Runnable{
    public Cat(){

    }
    public void eat(){
        System.out.print("The cat eats cat food.");
    }

    public void makeSound(){
        System.out.print("meaw");
    }

    public void run(){
        System.out.print("Cat is running!");
    }
}
