package com.softserve.hometasks.hometask1.hw11_Exceptions.pt1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Create a method for calculating the area of a rectangle
	int squareRectangle (int a, int b),
which should throw an exception if the user enters
 negative value. Input values a and b from console.
  Check the squareRectangle method in the method main.
   Check to input nonnumeric value.
*/
public class Area {
    public static void main(String[] args) {
        Area area = new Area();
        int a = 0;
        int b = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pls length of rectangle that > 0");
        a = scanner.nextInt();
        if (a < 0) {
            throw new IllegalArgumentException("Arguments must be a number > 0");
        }
        System.out.println("Enter pls width of rectangle that > 0");
        b = scanner.nextInt();
        if (b < 0) {
            throw new IllegalArgumentException("Arguments must be a number > 0");
        }
        scanner.close();

        System.out.println("Rectangle area is: " + area.squareRectangle(a, b));
    }

    public int squareRectangle(int a, int b){
        return a * b;
    }
}
