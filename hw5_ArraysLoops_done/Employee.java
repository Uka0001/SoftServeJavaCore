package com.softserve.hometasks.hometask1.hw5_ArraysLoops_done;

/*
Create a class Employee with fields name, department number, salary. Create five objects of class Employee. Display
all employees of a certain department (enter department number in the console);
arrange workers by the field salary in descending order.
 */

public class Employee {

    String name;
    int depNumber;
    int salary;


    public Employee(String name, int depNumber, int salary) {
        this.name = name;
        this.depNumber = depNumber;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", depNumber=" + depNumber +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepNumber() {
        return depNumber;
    }

    /*public void setDepNumber(int depNumber) {
        this.depNumber = scanner.nextInt();
    }*/

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
