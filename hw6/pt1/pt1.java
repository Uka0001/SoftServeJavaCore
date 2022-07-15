package com.softserve.hometasks.hometask1.hw6.pt1;

/*
1. Create abstract class Car with model, maxSpeed and
yearOfManufacture properties and run() and stop() methods.
Develop classes Truck and Sedan which extend class Car.
In main method create array of Car’s objects. Add to
 this array some trucks and sedans and print info about it
*/

import java.util.Arrays;

import static java.lang.String.valueOf;

public class pt1 {
    public static void main(String[] args) {

    Sedan one = new Sedan("Jeep", 180, 2008);
    Truck two = new Truck("MAN", 180, 2009);

    Car[] carObjects = new Car[2];
    carObjects[0] = one;
    carObjects[1] = two;
    System.out.println(valueOf(one));
    System.out.println(two);
    System.out.println(Arrays.toString(carObjects));
    System.out.println(carObjects); //-only hash output
    }
}




