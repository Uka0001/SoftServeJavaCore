package com.softserve.hometasks.hometask1.hw11_Exceptions_done.ht1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Create method div(), which calculates the dividing of two double numbers.
 In main method input 2 double numbers and call this method. Catch all exceptions.
Write a method readNumber(int start, int end), that read from console integer
 number and return it, if it is in the range [start...end].
If an invalid number or non-number text is read, the method should throw an exception.
Using this method write a method main(), that has to enter 10 numbers:
a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
Refactor your previous homework (1-7) and try to handle all possible exceptions in your code.
*/
public class Dividing {
    public static void main(String[] args) {
        Dividing dividing = new Dividing();

        dividing.div();

        dividing.readNumber(1, 100);
        dividing.readNumber(10, 600);
        dividing.readNumber(14, 50);
        dividing.readNumber(25, 45);
        dividing.readNumber(56, 234);
        dividing.readNumber(34, 123);
        dividing.readNumber(11, 134);
        dividing.readNumber(99, 1000);
        dividing.readNumber(3, 99);
        dividing.readNumber(6, 45);
    }

    public double div () throws InputMismatchException, IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;

        System.out.println("Enter the first double: ");

        try {
            a = scanner.nextDouble();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Only doubles pls");
        } catch (InputMismatchException e){
            throw new InputMismatchException("Only doubles pls");
        }
        System.out.println("Enter the second double: ");

        try {
            b = scanner.nextDouble();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Only doubles pls");
        } catch (InputMismatchException e){
            throw new InputMismatchException("Only doubles pls");
        }
        System.out.println("You result is: " + a / b);
        //scanner.close();
        return a / b;
    }

    public int readNumber(int start, int end) throws IllegalArgumentException, InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter the number that you are wanted to check: ");
        int range;

        try {
            range = scanner.nextInt();
            //scanner.close();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Only int pls");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Only int pls");
        }

        if (start < range & range < end) {
            System.out.println("You are in range: < " + start + " > - < " + end + " >");
            return range;
        } else {
            System.out.println("You are out of range: < " + start + " > - < " + end + " >");
            return 0;
        }
    }
}
