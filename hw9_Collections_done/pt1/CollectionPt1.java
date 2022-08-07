package com.softserve.hometasks.hometask1.hw9_Collections_done.pt1;

import java.util.*;

public class CollectionPt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myCollection = new ArrayList<>();
        do {
            myCollection.add(scanner.nextInt());
        } while (scanner.hasNextInt());
        System.out.println("Your collection is: " + myCollection);
        scanner.close();
        List<Integer> myCollectionBiggerFive = new ArrayList<>();
        for (Integer each: myCollection) {
            if (each > 5){
                myCollectionBiggerFive.add(each);
            }
        }
        System.out.println("Your new collection without elements>5: " + myCollectionBiggerFive);

        for (Integer each20: myCollection){
            if (each20 > 20) {
                myCollectionBiggerFive.remove(each20);
            }
        }
        System.out.println("Your new collection without elements>20: " + myCollectionBiggerFive);

        myCollectionBiggerFive.add(2, 1);
        myCollectionBiggerFive.add(8, -3);
        myCollectionBiggerFive.add(5, -4);

        Collections.sort(myCollectionBiggerFive); ////sorting in descending(natural) order
        //Collections.sort(myCollectionBiggerFive, Collections.reverseOrder()); //sorting in reverse order

            for (Integer each: myCollectionBiggerFive) {
            System.out.println("position – " + myCollectionBiggerFive.indexOf(each) + ", value of element – " + each);
        }
    }
}
// values for scanner:
// 5 34 23 12 1 2 67 78 45 34 23 1 2 3 4 6 7 8 9 10 11 13 null
//
/*Declare collection myCollection of 10 integers and fill it (from the console or random).
Find and save in list newCollection all positions of element more than 5 in the collection. Print newCollection
Remove from collection myCollection elements, which are greater then 20. Print result
Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”
Sort and print collection
*/
