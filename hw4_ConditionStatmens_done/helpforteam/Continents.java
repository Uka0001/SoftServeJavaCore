package com.softserve.hometasks.hometask1.hw4_ConditionStatmens_done.helpforteam;

import java.util.Locale;
import java.util.Scanner;

//Enter the name of the country. Print the name of the continent. (Declare enum with names of continents)

public enum Continents {
    NORTH_AMERICA("NORTH_AMERICA"),
    SOUTH_AMERICA("SOUTH_AMERICA"),
    AFRICA("AFRICA"),
    EURASIA("EURASIA"),
    AUSRTALIA("AUSRTALIA");

    public String name;

    Continents(String name){
        this.name = name;
    }
    Continents(){

    }

    public static void CheckCountry(){
        System.out.println("Enter the name of the country according to the following list:" +
                "\n USA, Canada, Mexico, Brazil, Colombia, Chile, Ukraine, France, Spain, Korea, Japan, China, Australia, Algeria, Marocco, Egypt");
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine().toLowerCase(Locale.ROOT);
        switch (ans){
            case "usa": case "canada": case "mexico":
                System.out.println(Continents.valueOf(NORTH_AMERICA.name));
                break;
            case "brazil": case "colombia": case "chile":
                System.out.println(Continents.valueOf(SOUTH_AMERICA.name));
                break;
            case "ukraine": case "france": case "spain": case "Korea": case "japan": case "china":
                System.out.println(Continents.valueOf(EURASIA.name));
                break;
            case "australia":
                System.out.println(Continents.valueOf(AUSRTALIA.name));
                break;
            default:
                System.out.println("There is no such country in my list");
                break;

        }


    }

}