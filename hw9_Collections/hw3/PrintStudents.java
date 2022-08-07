package com.softserve.hometasks.hometask1.hw9_Collections.hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class PrintStudents extends Student {
    public static List printStudents(List<Student> students, Integer consoleId) {

        List arrayList = new ArrayList<>();
        for(Student list: students) {
            if((list.getCourse()).equals(consoleId))
                arrayList.add(list.getName());

        }
        return arrayList;
    }
}
/*method printStudents (List students, Integer course),
+which receives a list of students and the course
number and prints to the console the names of
the students from the list, which are taught in this course (use an iterator)
methods to compare students by name and by course*/
