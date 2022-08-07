package com.softserve.hometasks.hometask1.hw8_NestedInnerEnums_done.pt1;

public class Car {

    public class Model {

        private Model() {}

        public Color setMercedes() {
            model = "Mercedes";
            return new Color();
        }

        public Color setBMWx5() {
            model = "BMWx5";
            return new Color();
        }

        public Color setHonda() {
            model = "Honda";
            return new Color();
        }

        public Color setMazdaCX() {
            model = "MazdaCX";
            return new Color();
        }
    }

    public class Color {

        private Color() {}

        public Engine setRed() {
            color = "Red";
            return new Engine();
        }

        public Engine setBlack() {
            color = "Black";
            return new Engine();
        }

        public Engine setWhite() {
            color = "White";
            return new Engine();
        }
    }

    public class Engine {

        private Engine() {}

        public Gear setPetrol() {
            engine = "Petrol";
            return new Gear();
        }

        public Gear setDisel() {
            engine = "Disel";
            return new Gear();
        }
    }

    public class Gear {

        private Gear() {}

        public Light setManual() {
            gear = "Manual";
            return new Light();
        }

        public Light setAutomat() {
            gear = "Automat";
            return new Light();
        }
    }

    public class Light {

        private Light() {}

        public CarBuilder setHalogen() {
            light = "Halogen";
            return new CarBuilder();
        }

        public CarBuilder setXenon() {
            light = "Xenon";
            return new CarBuilder();
        }

        public CarBuilder setLed() {
            light = "Led";
            return new CarBuilder();
        }
    }

    public class CarBuilder {

        private CarBuilder() {}

        public Car build() {
            return Car.this;
        }
    }

    // - - - - - - - - - -

    private String model; // = null
    private String color;
    private String engine;
    private String gear;
    private String light;

    private Car() {
        model = "";
        color = "";
        engine = "";
        gear = "";
        light = "";
    }

    public static Model builder() {
        return new Car().new Model();
    }

    // getters

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public String getGear() {
        return gear;
    }

    public String getLight() {
        return light;
    }

    @Override
    public String toString() {
        return "Car [model=" + model
                + ", color=" + color
                + ", engine=" + engine
                + ", gear=" + gear
                + ", light=" + light
                + "]";
    }
}



/*Suppose we have the class Car.
Create public inner class CarBuilder inside of Car
 class correspond to the next class diagram.
 Create a car with four different parameters and print
  info about this car and its parameters
 */
