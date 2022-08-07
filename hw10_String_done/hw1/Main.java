package com.softserve.hometasks.hometask1.hw10_String_done.hw1;

public class Main {
    public static void main(String[] args) {
        //Enter in the console sentence of five words.
        System.out.println("Enter in the console sentence of five words");
//        Scanner scanner = new Scanner(System.in);
//        String sentence = scanner.nextLine();
        String sentence = "one two three fore five";
        System.out.println("Your sentence is: " + sentence);
        //display the longest word in the sentence
        String[] word = sentence.split(" ");
        String longWord = "";
        for (int i = 0; i < word.length; i++)
                if (word[i].length() >= longWord.length())
                    longWord = word[i];
        System.out.println("The longest word is: " + longWord);
        //determine the number of its letters
        System.out.println("Number of its letters: " + longWord.length());
        //bring the second word in reverse order
        String two = word[1];
        System.out.println("The second word is: " + two);
        String nstr = "";
        char ch;
        for (int i=0; i<two.length(); i++) {
            ch = two.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("Word in reverse order: "+nstr);
    }
}
/*Enter in the console sentence of five words.
display the longest word in the sentence
determine the number of its letters
bring the second word in reverse order
*/
