package com.softserve.hometasks.hometask1.hw7_OOP2.pt2;

/*
Create next structure.
In abstract class Person with property name,
declare abstract method print(). In other classes in body of method
print() output text “I am a …”. In class Staff declare abstract method
salary(). In each concrete class create constant TYPE_PERSON.
Output type of person in each constructors. Create array of Person
and add some Teachers, Cleaners and Students to it. Call method print()
for all of it. Call method salary() for all Teachers and Cleaner

*/

abstract public  class Person {
    String name;
    final String TYPE_PERSON;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    protected Person(String type_person) {
        TYPE_PERSON = getName();
    }

    abstract public void print();
    {
        System.out.println("I am a Person");
    }

}
