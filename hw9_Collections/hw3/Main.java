package com.softserve.hometasks.hometask1.hw9_Collections.hw3;

import java.util.*;

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

        /*System.out.println("Second method sorting: ");
        Collections.sort(students,new Student.Name);
        System.out.println("List of students sorted by name: "+ students);*/

        System.out.println();
        //display the list of students ordered by course
        students.sort(Comparator.comparing(Student::getCourse));
        for (Student each: students) {
            System.out.println("students ordered by course: "+ each.toString());
        }

        /*System.out.println("Second method sorting: ");
        Collections.sort(List<Student> students,new Course().getCourse());
        System.out.println("List of students sorted by course: "+ students);*/

        Scanner scanner = new Scanner(System.in);
        Integer consoleId = scanner.nextInt();
        scanner.close();
        System.out.println();
        System.out.println("These students: "+PrintStudents.printStudents(students,consoleId)+" are studying in this course: "+consoleId);



    }
}
/*+In the main() method
+declare List students and add to the list five different students
+display the list of students ordered by name
+display the list of students ordered by course.*/
