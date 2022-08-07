package com.softserve.hometasks.hometask1.hw9_Collections_done.hw3;

import java.util.Comparator;

public class Course extends Student implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getCourse() - o2.getCourse();
    }
}
