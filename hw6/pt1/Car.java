package com.softserve.hometasks.hometask1.hw6.pt1;

public abstract class Car {
    String model;
    int maxSpeed;
    int yearOfManufacture;

    public Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }

    void run() {
    }

    void stop() {
    }
}
