package com.softserve.hometasks.hometask1.hw10_String_done.pt3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String name1 = "fdbvshv";
        String name2 = "fdbvshv32845 ";
        String name3 = "fdbvshvgsnvj";
        String name4 = "fdbvshv258267";
        String name5 = "fdbvshvvjhvdtgnvjdtngvshbktbvbtl";

        List<String> passwords = new ArrayList<>();
        passwords.add(name1);
        passwords.add(name2);
        passwords.add(name3);
        passwords.add(name4);
        passwords.add(name5);

        for (String each: passwords) {
            String pattern ="^(?=.{3,15}$)(?![_.])(?!.*[_.]{2})[a-zA-Z0-9._]+(?<![_.])$";
            System.out.println((passwords.indexOf(each)+1) + " Password: " + each + "\n length: " + each.length());
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(each);
            if (m.matches())
                System.out.println("Validation: OK");
            else
                System.out.println("Validation: NOT OK");
        }

    }
}
/*The user name can be 3 to 15 characters of the Latin alphabet,
 numbers, and underscores. Using regular expressions implement
  checking the user name for validity. Input five names
  in the main method . Output a message to the console of
  the validation of each of the entered names.
 */
