package com.softserve.hometasks.hometask1.hw7_OOP2.pt1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat one = new Cat();
        Cat two = new Cat();
        Dog three = new Dog();
        Dog fore = new Dog();

        Animal [] animals = {one, two, three, fore};
        for (Animal all: animals) {
            System.out.println("Animal: ");
            all.feed();
            all.voice();
        }
    }
}
