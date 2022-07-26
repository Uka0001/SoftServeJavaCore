package com.softserve.hometasks.hometask1.hw5;

import java.util.Scanner;

public class PracticalTask {
    public static void main(String[] args) {
        //Create an array of ten integers. Display
        int[] array = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};

        //the biggest of these numbers;
        int max = array[0];
        int imax = 0;
        int i = 0;
        while (i < array.length) {
            if (array[i] > max){
                max = array[i];
                imax = i;
            }
            i++;
        }
        System.out.print("Maximum number = "+ max);
        System.out.println(" is in " + (imax + 1) + " place");

        //the sum of positive numbers in the array;
        /*int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        System.out.println("Sum = " + sum);

        //the amount of negative numbers in the array
        int amountP = 0;
        for (int a : array) {
            if (a > 0) {
                amountP++;
            }
        }
        System.out.println("Amount of positive numbers = " + amountP);

        //What values there are more: negative or positive?
        int amountN = 0;
        for (int a : array) {
            if (a < 0) {
                amountN++;
            }
        }
        System.out.println("Amount of negative numbers = " + amountN);

        if (amountP > amountN) System.out.println("Amount of Positive numbers are bigger");
        else if (amountN > amountP) System.out.println("Amount of Negative numbers are bigger");
        else System.out.println("Amount of Positive and Negative numbers are equal");*/

        //continue
        /*Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n;
        for (int i = 0; i < 6; i++) {
            System.out.println("Input number");
            n = sc.nextInt();
            if (n < 0){
                continue;
            }
            sum += n;
        }
        System.out.println(sum);
        sc.close();*/

        //break
        /*Scanner sc = new Scanner(System.in);
        int n = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Input number");
            n = sc.nextInt();
            if (n < 0){
                break;
            }
        }
        System.out.println(n);
        sc.close();*/

        //array class
        /*int[] numbers = { 2, -5, 8, -4, 7 };

        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, 7);
        String elements = Arrays.toString(numbers);

        System.out.println("Numbers = " + elements);
        System.out.println("Position of element with value 7 is " + index);*/
    }
}
