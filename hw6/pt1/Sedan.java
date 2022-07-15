package com.softserve.hometasks.hometask1.hw6.pt1;

class Sedan extends Car{

    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}