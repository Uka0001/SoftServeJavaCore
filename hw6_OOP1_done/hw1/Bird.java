package com.softserve.hometasks.hometask1.hw6_OOP1_done.hw1;

public abstract class Bird {
    boolean feathers;
    boolean layEggs;
    public abstract boolean fly();

    @Override
    public String toString() {
        return "Bird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
