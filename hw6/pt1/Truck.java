package com.softserve.hometasks.hometask1.hw6.pt1;

class Truck extends Car{

    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
