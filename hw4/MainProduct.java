package com.softserve.hometasks.hometask1.hw4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainProduct {
    public static void main(String[] args) {
        Product one = new Product("One", 200, 5);
        Product two = new Product("Two", 100, 7);
        Product three = new Product("Three", 300, 9);
        Product fore = new Product("Fore", 600, 2);

        List<Product> products = new ArrayList<Product>();
        products.add(one);
        products.add(two);
        products.add(three);
        products.add(fore);
        products.sort(Comparator.comparing(Product::getPrice));
        System.out.println("The most expensive item is: " + products.get(3));
        products.sort(Comparator.comparing(Product::getQuantity));
        System.out.println("Item that has the biggest quantity is: " + products.get(3));
        }
    }
