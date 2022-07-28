package com.softserve.hometasks.hometask1.hw4_ConditionStatmens_done.helpforteam;

public class AppProduct {

    public static void main(String[] args) {
        Product pr1 = new Product("Coca-colla", 25, 10);
        Product pr2 = new Product("Morshynska", 15, 7);
        Product pr3 = new Product("Borjomi", 10, 8);
        Product pr4 = new Product("Pepsi", 3, 11);

        Product[] products = {pr1, pr2, pr3, pr4};

        int bigPrice = 0;
        String name1 = null;
        int quantity1 = 0;
        for (Product product : products) {
            int x = product.getPrice();
            if (x > bigPrice) {
                bigPrice = x;
                name1 = product.getName();
                quantity1 = product.getQuantity();
            }

        }

        int biggestQuantity = 0;
        String name2 = null;
        for (Product productQuantity : products) {
            int y = productQuantity.getQuantity();
            if (y > biggestQuantity) {
                biggestQuantity = y;
                name2 = productQuantity.getName();
            }
        }


        System.out.println("the biggest quantity " + biggestQuantity + " product " + name2);
        System.out.println();
        System.out.println("the highest price " + bigPrice + " in the product " + name1 + " quantity " + quantity1);
    }

}
