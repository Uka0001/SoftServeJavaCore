package com.softserve.hometasks.hometask1.hw7_OOP2_done.pt2;

public class Main {
    public static void main(String[] args) {

        //Create array of Person
        //and add some Teachers, Cleaners and Students to it.
        Person[] persons = new Person[6];
        persons[0] = new Teacher("Worker");
        persons[1] = new Teacher("Worker1");
        persons[2] = new Cleaner("Worker2");
        persons[3] = new Cleaner("Worker3");
        persons[4] = new Student("!Worker");
        persons[5] = new Student("!Worker1");

        //Call method print()
        //for all of it. 
        for (Person current: persons){
            current.print();
            if (current instanceof Staff){
                Staff s = (Staff) current;
                s.salary();
            }
        }

    }
}
