package com.softserve.hometasks.hometask1.hw8_NestedInnerEnums_done.pt1;

public class Main {
    public static void main(String[] args) {
        Car car = Car.builder().setHonda().setRed().setPetrol().setAutomat().setHalogen().build();
        System.out.println(car);

    }
}
