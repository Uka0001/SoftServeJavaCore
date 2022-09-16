package com.softserve.hometasks.hometask1.hw11_Exceptions.pt1;

import java.util.Arrays;

import static java.lang.Enum.valueOf;

/*
Create a class Plant, which includes
fields int size, Color color and Type type,
and constructor where these fields are initialized.
Color and type are Enum. Override the method toString( ).
Create classes ColorException and TypeException and describe
there all possible colors and types of plants. In the method
main create an array of five plants. Check to work your exceptions.
 */
public class Plant {
    int size;
    Color color;
    Type type;

    public int getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }

    public Plant(int size, Color color, Type type) throws ColorException, TypeException {
        this.size = size;
//        this.color = color;
//        this.type = type;
        if (color.getDeclaringClass().isInstance(Color.values())){ //Color.values().equals(getColor())
            this.color = color;
        } else {
            throw new ColorException("\nColor not right");
        }

        if (type.getDeclaringClass().isInstance(Type.values())) {
            this.type = type;
        } else {
            throw new TypeException("\nType not right");
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }

    public static void main(String[] args) throws ColorException, TypeException{
        Plant[] plants = new Plant[5];
        plants[0] = new Plant(4, Color.RED, Type.ONE);
        plants[1] = new Plant(3, Color.BLUE, Type.TWO);
        plants[2] = new Plant(5, Color.BLACK, Type.FORE);
        plants[3] = new Plant(6, Color.GREEN, Type.ONE);
        plants[4] = new Plant(1, Color.WHITE, Type.FIVE);

        Arrays.toString(plants);

    }
}

