package com.softserve.hometasks.hometask1.hw9_Collections.hw3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //declare List students and add to the list five different students
        List<Student> students = new ArrayList<>();
        students.add(0,new Student("Oleksii", 1));
        students.add(1,new Student("Vasil", 1));
        students.add(2,new Student("Pasha", 1));
        students.add(3,new Student("Den", 1));
        students.add(4,new Student("Max", 2));
        students.add(5,new Student("Luba", 2));
        students.add(6,new Student("Lena", 2));
        students.add(7,new Student("Oksana", 2));
        students.add(8,new Student("Variya", 3));
        students.add(9,new Student("Lybomir", 3));

        System.out.println("students not sorted: " + students + "\n");

        //display the list of students ordered by name
        students.sort(Comparator.comparing(Student::getName));
        for (Student each: students) {
            System.out.println("students ordered by name: "+ each.toString());

        }
        System.out.println();
        //display the list of students ordered by course
        students.sort(Comparator.comparing(Student::getCourse));
        for (Student each: students) {
            System.out.println("students ordered by course: "+ each.toString());
        }

        Scanner scanner = new Scanner(System.in);
        Integer consoleId = scanner.nextInt();
        scanner.close();
        String nameConsole = String.valueOf(new printStudents());
        System.out.println(nameConsole);
    }
}
/*In the main() method
declare List students and add to the list five different students
display the list of students ordered by name
display the list of students ordered by course.*/
