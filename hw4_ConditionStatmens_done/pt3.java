package com.softserve.hometasks.hometask1.hw4_ConditionStatmens_done;
//Enter the name of the country.
// Print the name of the continent.
// (Declare enum with names of continents)

public class pt3 {
    public static void main(String[] args) {
        Continent continent = null;
        String city = "Kharkiv";
        switch (city) {
            case "Kinshasa":
            case "Lagos":
            case "Cairo":
            case "Giza":
            case "Dar es Salaam":
            case "Khartoum":
            case "Johannesburg":
            case "Abidjan":
            case "Alexandria":
            case "Nairobi":
                continent = Continent.AFRICA;
                break;
            case "Beijing":
            case "Pyongyang":
            case "Seoul":
            case "Taipei":
            case "Tokyo":
            case "Ulaanbaatar":
                continent = Continent.ASIA;
                break;
            case "New York City":
            case "Los Angeles":
            case "Chicago":
            case "Houston":
            case "Phoenix":
            case "Philadelphia":
                continent = Continent.NORTHAMERICA;
                break;
            case "São Paulo":
            case "Rio de Janeiro":
            case "Distrito Federal":
            case "Bahia":
            case "Ceará":
                continent = Continent.SOUTHAMERICA;
                break;
            case "London":
            case "Paris":
            case "Madrid":
            case "Kiev":
            case "Kharkiv":
                continent = Continent.EUROPE;
                break;
            case "Sydney":
            case "Melbourne":
            case "Brisbane":
            case "Perth":
            case "Adelaide":
                continent = Continent.AUSTRALIA;
                break;
            case "Esperanza":
            case "McMurdo":
            case "Cámara":
            case "Neumayer II":
            case "Neumayer III":
            case "Orcadas":
                continent = Continent.ANTARCTICA;
                break;
        }
        System.out.println("City " + city + " is located on " + continent + " continent.");
    }

    public enum Continent {
        ASIA,
        AFRICA,
        EUROPE,
        NORTHAMERICA,
        SOUTHAMERICA,
        AUSTRALIA,
        ANTARCTICA;
    }
}
