package com.softserve.hometasks.hometask1.hw6_OOP1_done.hw2;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jone", 23, 45.05);
        Developer developer1 = new Developer("Fil", 45, 56.05, "Java dev");
        developer1.report();
        employee1.report();
        System.out.println(developer1.report());
        System.out.println(employee1.report());
    }
}
