package com.softserve.hometasks.hometask1.hw3_OOPClass_done;

public class Main {
    //HomeWork
   /* public static void main(String[] args) {
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
    }*/
    // Practical Task
    public static void main(String[] args) {
        Employee one = new Employee("A", 5, 40);
        Employee two = new Employee("B", 6, 45);
        Employee three = new Employee("C", 9, 60);

        two.getBonuses();
        System.out.println("total salary of all workers = " + (one.getSalary() + two.getSalary() + three.getSalary()));

        three.changeRate(7);
        System.out.println("total salary of all workers = " + (one.getSalary() + two.getSalary() + two.getBonuses() + three.getSalary()));
    }
}
