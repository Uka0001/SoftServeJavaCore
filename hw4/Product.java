package com.softserve.hometasks.hometask1.hw4;
/*
Create class Product with fields name,price and quantity.
Create four instances of type Product.
Display the name and quantity of the most expensive item.
Display the name of the items, which has the biggest quantity.
*/
public class Product {
    private String name;
    private int price;
    private int quantity;



    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public String toStringBiggestQuantity() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
