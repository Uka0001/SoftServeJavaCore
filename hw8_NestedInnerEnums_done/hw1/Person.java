package com.softserve.hometasks.hometask1.hw8_NestedInnerEnums_done.hw1;

public abstract class Person extends FullName {
    FullName fullName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        super(firstName, lastName);
        this.age = age;
    }

    void info(){
        System.out.println("First name: " + getFirstName() + ", Last name: " +
                getLastName() + ", Age: " + getAge());
    }

    public abstract String activity();

    @Override
    public String toString() {
        return "Person{" +
                "fullName=" + fullName +
                ", age=" + age +
                '}';
    }

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
