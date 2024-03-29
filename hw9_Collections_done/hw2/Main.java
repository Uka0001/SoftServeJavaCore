package com.softserve.hometasks.hometask1.hw9_Collections_done.hw2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //+Create map personMap and add to it ten persons
        // of type <String, String> (lastName, firstName).
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Oleksii", "One");
        personMap.put("Den", "Two");
        personMap.put("Max", "Three");
        personMap.put("Svitlana", "Fore");
        personMap.put("AlexA", "Six");
        personMap.put("Silva", "Six");
        personMap.put("Serhiy", "Seven");
        personMap.put("AlexB", "Six");
        personMap.put("AlexC", "Six");
        personMap.put("Anton", "Ten");

        //+Output the entities of the map on the screen
        System.out.println("Original Map: " + personMap);

        //There are at less two persons with the same
        // firstName among these 10 people?
        //Count how many distinct values firstName map are in my map
        int count = (int) personMap.values().stream().distinct().count();
        System.out.println("Distinct values firstName are " + count + " in Map.");


        //+Remove from the map person whose firstName is
        // ”Orest” (or other). Print result.
        Set<Map.Entry<String, String>> entrySet = personMap.entrySet();
        Iterator<Map.Entry<String, String>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, String> entry = entryIterator.next();

            if (entry.getValue().equals("One")) {
                System.out.println("Removing : " + entry);
                entryIterator.remove();
            } else {
                System.out.println("Nothing equal has found..." + entry);
            }
        }
        System.out.println("Changed Map: " + personMap);



    }
}
/*Create map personMap and add to it ten persons
 of type <String, String> (lastName, firstName).
Output the entities of the map on the screen.
There are at less two persons with the same
 firstName among these 10 people?
Remove from the map person whose firstName is
 ”Orest” (or other). Print result.
*/
