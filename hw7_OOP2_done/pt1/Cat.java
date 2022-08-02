package com.softserve.hometasks.hometask1.hw7_OOP2_done.pt1;

public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Miu-miu");
    }

    @Override
    public void feed() {
        System.out.println("Cat eats fish");
    }
}
