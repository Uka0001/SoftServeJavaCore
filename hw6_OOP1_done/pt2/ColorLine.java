package com.softserve.hometasks.hometask1.hw6_OOP1_done.pt2;

class ColorLine extends Line {
    String color;

    public ColorLine(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    void print(){
        System.out.println("x: " + x + " y: " + y + " color: " + color);
    }


/*@Override
    toString() {
    }

    @Override
    void print() {
        System.out.println();
    }*/
}
