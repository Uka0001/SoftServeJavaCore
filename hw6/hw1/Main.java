package com.softserve.hometasks.hometask1.hw6.hw1;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args) {
        Swallow swallow1 = new Swallow();
        Penguin penguin1 = new Penguin();
        Eagle eagle1 = new Eagle();
        Chicken chicken1 = new Chicken();
        String [] birds = {valueOf(swallow1),valueOf(penguin1), valueOf(eagle1), valueOf(chicken1)};
        swallow1.fly();
        penguin1.fly();
        eagle1.fly();
        chicken1.fly();
        System.out.println("Array birds contains: " + Arrays.toString(birds));
        System.out.println("Swallow can fly: " + swallow1.fly());
        System.out.println("Penguin can fly: " + penguin1.fly());
        System.out.println("Eagle can fly: " + eagle1.fly());
        System.out.println("Chicken can fly: " + chicken1.fly());
    }
}
