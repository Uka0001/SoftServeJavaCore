package com.softserve.hometasks.hometask1.hw9_Collections_done.pt2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Alex");
        employeeMap.put(2, "Anton");
        employeeMap.put(3, "Sveta");
        employeeMap.put(4, "Vasil");
        employeeMap.put(5, "Hristina");
        employeeMap.put(6, "Den");
        employeeMap.put(7, "Kiril");
        System.out.println("Your map is: " + employeeMap);
        System.out.println("Enter ID pls");
        Scanner scanner = new Scanner(System.in);
        Integer userEnteredId = scanner.nextInt();
        if (employeeMap.containsKey(userEnteredId)){
            System.out.println("Your user name: " + employeeMap.get(userEnteredId));
        } else {
            System.out.println("You have entered the wrong ID");
        }
        System.out.println("\nEnter name pls");
        scanner.nextLine();
        String userEnteredName = scanner.nextLine();
        scanner.close();
        if (employeeMap.containsValue(userEnteredName)){
            // iterate each entry of hashmap
            for(Map.Entry<Integer, String> each: employeeMap.entrySet()) {
                // if give value is equal to value from entry
                // print the corresponding key
                if (Objects.equals(each.getValue(), userEnteredName)) {
                    System.out.println("Your user ID: " + each.getKey());
                    break;
                }
            }
        } else {
            System.out.println("You have entered the wrong name");
        }
    }
}
/*In the main() method declare map employeeMap of pairs <Integer, String>.
Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
Ask user to enter ID, then find and write corresponding name from your map. If you can't find this ID - say about it to user (use function containsKey()).
Ask user to enter name, verify than you have name in your map and write corresponding ID. If you can't find this name - say about it to user (use function containsValue()).
*/
