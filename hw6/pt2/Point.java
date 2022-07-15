package com.softserve.hometasks.hometask1.hw6.pt2;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

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

    @Override
    public String toString() {
        return super.toString();
    }

    void print(){
        System.out.println("x: " + x + "y: " + y);
    }
/*@Override
    toString() {
        return x + y;
    }

    @Override
    void print() {
    }*/
}
