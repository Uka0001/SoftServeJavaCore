package com.softserve.hometasks.hometask1.hw3;

public class Main {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
        Person three = new Person();
        Person fore = new Person();
        Person five = new Person();

        one.input("Oleh", "A", 1990);
        two.input("Alex", "B", 1987);
        three.input("Q", "E", 1967);
        fore.input("C", "D", 1991);
        five.input("A", "And", 1999);

        two.output();

        three.getAge(1965);
        three.output();

        two.changeName("B", "Bird");
        two.output();

    }
}
