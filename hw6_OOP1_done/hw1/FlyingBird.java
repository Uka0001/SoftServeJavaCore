package com.softserve.hometasks.hometask1.hw6_OOP1_done.hw1;

public class FlyingBird extends Bird {
    public boolean fly(){
        return true;
    }

    @Override
    public String toString() {
        return "FlyingBird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
