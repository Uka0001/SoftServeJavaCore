package com.softserve.hometasks.hometask1.hw9_Collections_done.hw1;

public class OperationSet {


    /*   Set<Integer> setOf(Integer... values) {
        return new HashSet<Integer>(Arrays.asList(values));
    }

    Set<Integer> set1 = setOf(1,2,3,4);
    Set<Integer> set2 = setOf(2,4,6,8);

    Set unionSetInt(Set set1, Set set2){
        *//*Set set3 = null;
        set3.addAll(set1);
        set3.addAll(set2);
        return set3;*//*
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    Set intersectSetInt(Set set1,Set set2){
        Set set4 = null;
        Set<Integer> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return intersectSet;
    }*/
}
