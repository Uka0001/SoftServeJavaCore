package com.softserve.hometasks.hometask1.hw3;

/*
Create Console Application project in Java.
Add class Person to the project.
Class Person should consist of
three private fields: firstName, lastName and birthYear (the birthday year)
properties for access to these fields
default constructor and constructor with 2 parameters (first and last names)
methods:
getAge() - to calculate the age of person
input() - to input information about person
output() - to output information about person
changeName(String fn, String ln) - to change the first name or/and last name of person

In the method main() create 5 objects of Person type and input information about them.
*/

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    void getAge(int birthYear) { //to calculate the age of person
        setBirthYear(birthYear);
        System.out.println(LocalDate.now().getYear() - birthYear);
    }

    void input(String firstName, String lastName, int birthYear) { //to input information about person
        setFirstName(firstName);
        setLastName(lastName);
        setBirthYear(birthYear);
    }

    void output() { //to output information about person
        System.out.println(toString());
    }

    void changeName(String fn, String ln) { // - to change the first name or/and last name of person
        if (fn.equals(firstName)) {
            setFirstName(ln);
        } else {
            setLastName(ln);
        }
    }
}
