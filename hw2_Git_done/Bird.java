package com.softserve.hometasks.hometask1.hw2_Git_done;

public abstract class Bird {
    String feathers;
    String layEggs;
    public abstract void fly();
}

class FlyingBird extends Bird{
    @Override
    public void fly() {
    }
}

class NonFlyingBird extends Bird{
    public void fly() {
    }
}
/*
class Eagle extends FlyingBird
class Swallow extends FlyingBird
class Penguin extends NonFlyingBird
class Chicken extends NonFlyingBird*/
