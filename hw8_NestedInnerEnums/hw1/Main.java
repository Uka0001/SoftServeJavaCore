package com.softserve.hometasks.hometask1.hw8_NestedInnerEnums.hw1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student one = new Student("Oleh", "Skripka", 29, 4);
        Student two = new Student("Juliya", "Elin", 23, 3);

        List<Student> students = new ArrayList<Student>();
        students.add(one);
        students.add(two);

        for (Student each: students) {
            each.info();
            each.activity();
        }
    }
}
