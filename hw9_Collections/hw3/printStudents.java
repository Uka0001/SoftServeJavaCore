package com.softserve.hometasks.hometask1.hw9_Collections.hw3;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

//method not working properly, need fix
/*public class printStudents extends Student {
    public Student printStudents(List<Student> students, Integer consoleId) {
        if (students.listIterator()){
            return students.get(getCourse().compareTo(consoleId));
        } else {
            return null;
        }
    }*/
public class printStudents extends Student {
    public Student printStudents(List<Student> students, Integer consoleId) {
        ListIterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            students.listIterator(students.size());
        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        return null;
    }
}
