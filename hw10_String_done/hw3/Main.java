package com.softserve.hometasks.hometask1.hw10_String_done.hw3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the text\n" +
                "that contains several occurrences\n" +
                "of US currency");
//        Scanner scanner = new Scanner(System.in);
//        String dollarString = scanner.nextLine();
        /*String dollarString = "13234243434";
        System.out.println("Your string is: "+ dollarString);
        String pattern = "$\\d*\\.?\\d{0,2}";
        System.out.println("Your pattern is: " + pattern);
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(dollarString);
        System.out.println(m);*/
        String pattern = "\\$\\s*\\d+\\.\\d{2}";
        String text = "Now is the time. 4 item(s) - $ 1111450.40 text. 222.33E text $110.41 text, $134444.23";
        //
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find()) {
            String dollar = text.substring(m.start() + 1, m.end()).trim();
            System.out.println("dollar = " + dollar);
        }


    }
}
/*Implement a pattern for US currency:
 the first symbol "$", then any number of digits,
  dot and two digits after the dot. Enter the text
   from the console that contains several occurrences
    of US currency. Display all occurrences on the screen.
 */
