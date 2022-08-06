package com.softserve.hometasks.hometask1.hw9_Collections.hw1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    static Set<Integer> set1 = setOf(1,2,3,4);
    static Set<Integer> set2 = setOf(2,4,6,8);

    private static Set<Integer> setOf(Integer... values) {
        return new HashSet<Integer>(Arrays.asList(values));
    }

    public static void main(String[] args) {
        System.out.println("Union method: " +   unionSetInt(set1, set2));
        System.out.println("Intersect method: " + intersectSetInt(set1, set2));
    }

    static Set unionSetInt(Set set1, Set set2){
        /*Set set3 = null;
        set3.addAll(set1);
        set3.addAll(set2);
        return set3;*/
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    static Set intersectSetInt(Set set1, Set set2){
        Set set4 = null;
        Set<Integer> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return intersectSet;
    }
}
/*Write parameterized methods union(Set set1, Set set2)
 and intersect(Set set1, Set set2), realizing
 the operations of union and intersection of
  two sets. Test the operation of these techniques on two pre-filled sets.
 */
