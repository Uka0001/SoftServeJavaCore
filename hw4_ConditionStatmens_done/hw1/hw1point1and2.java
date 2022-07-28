package com.softserve.hometasks.hometask1.hw4_ConditionStatmens_done.hw1;

/*
Solve the next tasks:
read 3 float numbers and check: are they all belong to the range [-5,5];
read 3 integer numbers and write max and min of them;
read number of HTTP Error (400, 401,402, ...)
 and write the name of this error (Declare enum HTTPError)
*/
public class hw1point1and2 {
    public static void main(String[] args) {
        System.out.println(floatRange(5));
        System.out.println(floatRange(6));
        System.out.println(floatRange(-3));

        integerMax(4, 10, 21);
        integerMin(41, 10, 21);

    }

    static boolean floatRange(float floatNumber) {
        if (floatNumber < -5 || floatNumber > 5) {
            return false;
        } else
            return true;
    }

    static void integerMax(int number1, int number2, int number3) {
        int[] numbers = {number1, number2, number3};
        int max = numbers[0];
        for (int i = 0; i < 3; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("max number is: " + max);
    }

    static void integerMin(int number1, int number2, int number3) {
        int[] numbers = {number1, number2, number3};
        int min = numbers[0];
        for (int i = 0; i < 3; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("min number is: " + min);

    }
}
