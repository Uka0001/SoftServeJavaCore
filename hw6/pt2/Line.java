package com.softserve.hometasks.hometask1.hw6.pt2;

class Line extends Point {
    Point one = new Point(1,2);
    Point two = new Point(2,3);

    public Line(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    void print(){
        System.out.println("x: " + x + "y: " + y);
    }
/*@Override
    toString() {
    }

    @Override
    void print() {
    }*/
}
