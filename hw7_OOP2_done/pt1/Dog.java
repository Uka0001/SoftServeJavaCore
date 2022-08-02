package com.softserve.hometasks.hometask1.hw7_OOP2_done.pt1;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("Waf-waf");
    }

    @Override
    public void feed() {
        System.out.println("Dog eats meat");
    }
}
