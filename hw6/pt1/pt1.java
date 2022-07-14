package com.softserve.hometasks.hometask1.hw6.pt1;

/*
1. Create abstract class Car with model, maxSpeed and
yearOfManufacture properties and run() and stop() methods.
Develop classes Truck and Sedan which extend class Car.
In main method create array of Car’s objects. Add to
 this array some trucks and sedans and print info about it
*/

import java.util.Arrays;

public class pt1 {
    public static void main(String[] args) {

    Sedan one = new Sedan("Jeep", 180, 2008);
    Truck two = new Truck("MAN", 180, 2009);

    String [] carObjects = {String.valueOf(one), String.valueOf(two)};
        System.out.println(Arrays.toString(carObjects));

        //приклад рішення зі стеку через стріми та лямбду
        /*List<MyClass> list = Arrays.asList(obj, obj2);
        List<Object> all = list.stream()
                .map(o -> Arrays.asList(o.getId(), o.getAge(), o.getName()))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        all.forEach(element -> System.out.println(element));*/
    }
}

class Truck extends Car{

    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }
}

class Sedan extends Car{

    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }
}


