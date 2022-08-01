package com.softserve.hometasks.hometask1.hw7_OOP2.hw1;

public class SalariedEmployee extends Employee implements Payment {
    String socialSecurityNumber;
    double salary;

    public SalariedEmployee(String socialSecurityNumber, double salary) {
        super("01", "SalariedEmployee");
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        //salary = fixed monthly payment
    return salary;
    }
}
