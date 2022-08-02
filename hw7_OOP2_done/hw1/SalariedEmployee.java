package com.softserve.hometasks.hometask1.hw7_OOP2_done.hw1;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private double salary;

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

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

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
