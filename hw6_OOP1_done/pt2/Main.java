package com.softserve.hometasks.hometask1.hw6_OOP1_done.pt2;

/*
2. Create three classes:
        Point with attributes x and y
        Line which contains two object of Point class
ColorLine with attributes Color  which extends Line class.
        Override method toString() and define
         method print() in every classes
        In main() method create array of Line and
         add some Line and ColorLine to it. Call method print() for all of it.
*/


public class Main {
    public static void main(String[] args) {
        Line [] array = new Line[5];
        array[0] = new Line(1,2);
        array[1] = new Line(1, 5);
        array[2] = new ColorLine(1, 2, "Blue");
        array[3] = new Line(1, 9);
        //array[4] = (Line) new Point(1, 2);
        array[2].print();
        array[1].print();
    }
}
