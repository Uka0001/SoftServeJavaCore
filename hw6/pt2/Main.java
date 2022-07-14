package com.softserve.hometasks.hometask1.hw6.pt2;

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
}

class Point {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

   /* @Override
    public toString(){
    }*/

    void print(){}
}

class Line {
   /* @Override
    public toString(){
    }*/

    void print(){}
}

class ColorLine extends Line{
    String color;

   /* @Override
    public toString(){
    }*/

    void print(){}
}
