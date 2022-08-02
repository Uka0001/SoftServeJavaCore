package com.softserve.hometasks.hometask1.hw7_OOP2_done.hw1;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdMember;
    private double hourlyRate;
    private double numberOfHoursWorked;
    private double salary;

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public ContractEmployee(String employeeId, String name, String federalTaxIdMember, double hourlyRate, double numberOfHoursWorked, double salary) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.salary = salary;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ContractEmployee(String federalTaxIdMember, double hourlyRate, double numberOfHoursWorked) {
        super("02","ContractEmployee");
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public double calculatePay() {
//salary = hourly rate * number of hours worked
    salary = hourlyRate * numberOfHoursWorked;
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
