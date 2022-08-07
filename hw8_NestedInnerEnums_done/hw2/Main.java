package com.softserve.hometasks.hometask1.hw8_NestedInnerEnums_done.hw2;

public class Main {
    public static void main(String[] args) {
        Wrapper<Integer> one = new Wrapper<Integer>(15);
        Wrapper<String> two = new Wrapper<>("Wrapper Two");
        Wrapper<Boolean> three = new Wrapper<>(true);
        System.out.println("Wrapper one: " + one.getValue() + ", Wrapper two: " + two.getValue() + ", Wrapper three: " + three.getValue());
    }
}
