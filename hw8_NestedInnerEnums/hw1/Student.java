package com.softserve.hometasks.hometask1.hw8_NestedInnerEnums.hw1;

public class Student extends Person {
    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(String firstName, String lastName, int age, int course) {
        super(firstName, lastName, age);
        this.course = course;
    }

    @Override
    void info() {
        System.out.println("First name: " + getFirstName() + ", Last name: " +
                getLastName() + ", Age: " + getAge() + ", Course: " + getCourse());
    }

    @Override
    public String activity() {
        System.out.println("I study at university");
        return "I study at university";
    }
}
