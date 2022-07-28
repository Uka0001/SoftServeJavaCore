package com.softserve.hometasks.hometask1.hw3_OOPClass_done;

/*
Create Console Application project in Java.
Add class Employee to the project.
Class Employee should consist of
	three private fields: name, rate and hours;
	static field totalSum
	properties for access to these fields;
	default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
	methods:
getSalary() - to calculate the salary of person (rate * hours)
toString() - to output information about employee
changeRate(int rate) - to change the rate of some employee and recalculate his salary
getBonuses() – to calculate 10% from salary
In the method main() create 3 objects of Employee type. Input information about them.
Display the total salary of all workers to screen
*/
public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int totalSum;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public Employee() {
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static int getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(int totalSum) {
        Employee.totalSum = totalSum;
    }

    int getSalary(){ //- to calculate the salary of person (rate * hours)
        System.out.println("the salary of person = " + (rate * hours));
        setTotalSum(rate * hours);
        return totalSum;
    }

     void changeRate(int rate) { //- to change the rate of some employee and recalculate his salary
        setRate(rate);
        getSalary();
    }
    int getBonuses(){ //– to calculate 10% from salary
        System.out.println("10% from salary of person = " + ((int) (rate * hours * 0.1)));
        setTotalSum((int) (rate * hours * 0.1 + totalSum));
        return ((int) (rate * hours * 0.1));
    }
}
