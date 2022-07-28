package com.softserve.hometasks.hometask1.hw4_ConditionStatmens_done.hw2;

public class Test {
    static int i = 1;

    public static void main(String args[]) {
        System.out.println(i + ",");
        m(i);
        System.out.println(i);

        String str = "100";
        int i = new Integer(str);
        System.out.println(i + 1);
    }

    public static void m(int i) {
        i += 2;
    }
}
