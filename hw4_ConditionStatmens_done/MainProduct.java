package com.softserve.hometasks.hometask1.hw4_ConditionStatmens_done;

public class MainProduct {
    public static void main(String[] args) {
        Product one = new Product("One", 200, 5);
        Product two = new Product("Two", 100, 7);
        Product three = new Product("Three", 300, 9);
        Product fore = new Product("Fore", 600, 2);

        /*List<Product> products = new ArrayList<Product>();
        products.add(one);
        products.add(two);
        products.add(three);
        products.add(fore);
        products.sort(Comparator.comparing(Product::getPrice));
        System.out.println("The most expensive item is: " + products.get(3));
        products.sort(Comparator.comparing(Product::getQuantity));
        System.out.println("Item that has the biggest quantity is: " + products.get(3));
        }*/


        Product[] productsArray = {one, two, three, fore};

        int maxQuantity = 0;
        String quantityName1 = null;
        for (Product product1 : productsArray) {
            int x = product1.getQuantity();
            if (x > maxQuantity) {
                maxQuantity = x;
                quantityName1 = product1.getName();
            }

        }
        System.out.println("The biggest quantity is: " + maxQuantity + ", and name of the product is: " + quantityName1);

        int maxPrice = 0;
        String quantityName2 = null;
        int quantity2 = 0;
        for (Product product2 : productsArray) {
            int y = product2.getPrice();
            if (y > maxPrice) {
                maxPrice = y;
                quantityName2 = product2.getName();
                quantity2 = product2.getQuantity();
            }
        }
        System.out.println("The biggest price is: " + maxPrice + ", and name of the product is: " + quantityName2 + ". Its quantity is: " + quantity2);

    }
}
