package com.softserve.hometasks.hometask1.hw6.hw1;

public class NonFlyingBird extends Bird {
    public boolean fly(){
        return false;
    }

    @Override
    public String toString() {
        return "NonFlyingBird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
