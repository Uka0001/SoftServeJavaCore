package com.softserve.hometasks.hometask1.hw8_NestedInnerEnums.pt1;

import java.time.LocalDate;

public class Car {

    private String model;
    private LocalDate dateOfProduction;
    private double engineCapasity;
    private String color;
    private int passengerCapasity;
    private boolean isAirConditioning;

    //Create a car with four different parameters and print
    // info about this car and its parameters

    public Car(String model, LocalDate dateOfProduction, double engineCapasity, String color, int passengerCapasity, boolean isAirConditioning) {
        this.model = model;
        this.dateOfProduction = dateOfProduction;
        this.engineCapasity = engineCapasity;
        this.color = color;
        this.passengerCapasity = passengerCapasity;
        this.isAirConditioning = isAirConditioning;
    }
//    Car first = new Car();
    /*Car.CarBuilder = new CarBuilder().addModel("Mers");
    String one  = new CarBuilder().addModel("Mers");
    String two = new CarBuilder().addColor("Green");
    double three = new CarBuilder().addEngineCapasity(1300);*/

    private Car(){}

    public static CarBuilder getCar(){
        return new Car().new CarBuilder();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", dateOfProduction=" + dateOfProduction +
                ", engineCapasity=" + engineCapasity +
                ", color='" + color + '\'' +
                ", passengerCapasity=" + passengerCapasity +
                ", isAirConditioning=" + isAirConditioning +
                '}';
    }

    public class CarBuilder{
        public CarBuilder() {
        }

        private String addModel(String addM){
            model = addM;
            return model;
        }

        private String addColor(String addC){
            color = addC;
            return color;
        }

        private LocalDate addDataOfProduction (LocalDate localD){
            localD = LocalDate.parse("dd-MM-yyyy");
            dateOfProduction = localD;
            return dateOfProduction;
        }

        private double addEngineCapasity (double engineC){
            engineCapasity = engineC;
            return engineCapasity;
        }

        private int addPassengerCapasity(int passengerC){
            passengerCapasity = passengerC;
            return passengerCapasity;
        }

        private boolean setIsAirCondition(boolean airCondition){
            isAirConditioning = airCondition;
            return isAirConditioning;
        }

        private Car build(){
            return Car.getCar().build();
        }
    }
}



/*Suppose we have the class Car.
Create public inner class CarBuilder inside of Car
 class correspond to the next class diagram.
 Create a car with four different parameters and print
  info about this car and its parameters
 */
