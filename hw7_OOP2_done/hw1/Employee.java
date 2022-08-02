package com.softserve.hometasks.hometask1.hw7_OOP2_done.hw1;

import java.util.*;

/*Create Payment interface with the method calculatePay(), the base class Employee with a string variable employeeld.
Create two classes SalariedEmployee and ContractEmployee, which implement interface and are inherited from the base class.
Describe hourly paid workers in the relevant classes (one of the children), and fixed paid workers (second child).
Describe the string variable socialSecurityNumber in the class SalariedEmployee .
Include a description of federalTaxIdmember in the class of ContractEmployee.
The calculation formula for the "time-worker“ is: the average monthly
salary = hourly rate * number of hours worked
For employees with a fixed payment the formula is: the average monthly 	salary = fixed monthly payment
Create an array of employees and add the employees with different form of payment.
Arrange the entire sequence of workers descending the average monthly wage. Output the employee ID, name, and the average monthly wage for all elements of the list.
*/
public abstract class Employee implements Payment {
    String employeeId;
    String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new ContractEmployee("one", 9.12, 10.0));
        employees.add(new ContractEmployee("two", 13.12, 15.0));
        employees.add(new SalariedEmployee("three", 14.0));
        employees.add(new SalariedEmployee("fore", 15.0));
        for (Employee each : employees) {
            if (each instanceof ContractEmployee) {
                double salary = ((ContractEmployee) each).calculatePay();
            }
            if (each instanceof SalariedEmployee) {
                double salary = ((SalariedEmployee) each).calculatePay();
            }
        }
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) -(o1.calculatePay() - o2.calculatePay());
            }
        });
        //Arrange the entire sequence of workers descending the average monthly wage.
        //Output the employee ID, name, and the average monthly wage for all elements of the list.
        System.out.println("sequence of workers descending the average monthly wage: \n");
        for (Employee each : employees) {
            System.out.println("employee ID: " + each.employeeId + ", employee name: " +
                    each.name + ", average monthly wage: " +  each.calculatePay());
        }


        /*ContractEmployee one = new ContractEmployee("one", 9.12, 10.0);
        ContractEmployee two = new ContractEmployee("two", 13.12, 15.0);
        SalariedEmployee three = new SalariedEmployee("three", 14.0);
        SalariedEmployee fore = new SalariedEmployee("fore", 15.0);

        Employee [] employees = {one, two, three, fore};
        for (Employee each: employees) {
            each.compareTo(employees);
        }
    }

    @Override
    public int compareTo(Employee o) {
        if (this.compareTo(o.salary) != 0 )
            return this.salary.compareTo(o.salary);
        else
            return Integer.compare(this.salary);
    }*/

    }

    @Override
    public double calculatePay() {
        return 0;
    }
}
