package com.softserve.hometasks.hometask1.hw7_OOP2.hw1;

public class ContractEmployee extends Employee implements Payment {
    String federalTaxIdmember;
    double hourlyRate;
    double numberOfHoursWorked;
    double salary;

    public ContractEmployee(String federalTaxIdmember, double hourlyRate, double numberOfHoursWorked) {
        super("02","ContractEmployee");
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public double calculatePay() {
//salary = hourly rate * number of hours worked
    salary = hourlyRate * numberOfHoursWorked;
        return salary;
    }
}
