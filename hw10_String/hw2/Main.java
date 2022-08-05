package com.softserve.hometasks.hometask1.hw10_String.hw2;

public class Main {
    public static void main(String[] args) {
        String str = "I      am     learning       Java    Core";
        System.out.println(str);
        String strT = str.replaceAll("\\s+", " ");
        System.out.println(strT);
    }
}
/*Enter a sentence that contains the words between
 more than one space. Convert all spaces, consecutive,
  one. For example, if we introduce the sentence "I
     am      learning     Java   Core», we have to
     get the "I'm learning Java Core»
 */
