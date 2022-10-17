package com.softserve.hometasks.hometask1.hw14_CodeConventionDebbuging_done;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * In the next method calculate amount of characters in the string. Need to find logic errors
 */
public class PT {
    public static void main(String[] args) throws IOException {
        int countCharacters = 0;
        String testWord;
        String characterInWord = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input word");
        testWord = br.readLine();
        System.out.println("Input character");
        characterInWord = br.readLine();
        for (Character each : testWord.toCharArray()) {
            if (each.toString().equals(characterInWord) ) {
                countCharacters += 1;
            }
        }
        System.out.println("There are character " + characterInWord + " " + countCharacters + " times in the word " + testWord);
    }
}
