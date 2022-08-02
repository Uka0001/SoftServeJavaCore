package com.softserve.hometasks.hometask1.hw7_OOP2_done.pt2;

public class Student extends Person{
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    protected Student(String type_person) {
        super(type_person);
    }

    @Override
    public void print() {
        System.out.println("I am a Student");
    }
}
