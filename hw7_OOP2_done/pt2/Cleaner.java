package com.softserve.hometasks.hometask1.hw7_OOP2_done.pt2;

public class Cleaner extends Staff{

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    protected Cleaner(String type_person) {
        super(type_person);
    }

    @Override
    public void salary() {
        System.out.println("I have 200$ salary");
    }

    @Override
    public void print() {
        System.out.println("I am a Cleaner");
    }
}
