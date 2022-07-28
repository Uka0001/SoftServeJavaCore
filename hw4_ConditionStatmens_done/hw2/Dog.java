package com.softserve.hometasks.hometask1.hw4_ConditionStatmens_done.hw2;
/*
+Сreate class Dog with fields name, breed, age.
+Declare enum for field breed.
+Create 3 instances of type Dog.
Check if there is no two dogs with the same name.
+Display the name and the kind of the oldest dog.
*/


public class Dog {
    public static void main(String[] args) {
        Dog one = new Dog("Alli", Breed.Labrador, 7);
        Dog two = new Dog("Iva", Breed.Beagle, 5);
        Dog three = new Dog("Iva", Breed.Shepherd, 1);

        //Dog array
        Dog[] dogs = {one, two, three};

        //Oldest Dog in array
        int max = 0;
        String oldestDog = null;
        for (int i = 0; i < dogs.length; i++) {

            if (dogs[i].age > max) {
                max = dogs[i].age;
                oldestDog = dogs[i].name;
            }
        }
        System.out.println(oldestDog);

        //Find 2 dogs with equal names in array
        for (int j = 0; j < dogs.length; j++) {
            for (int i = 0; i < dogs.length; i++) {
                if (dogs[j].name.equals(dogs[i].name) && !(j == i)) {
                    System.out.println("Dog number " + j + " name: " + dogs[j].name + " is equals Dog number " + i + " name " + dogs[i].name);
                }
            }
        }


        /*//ArrayList Dog
        List<Dog> dogs = new ArrayList<>();
        dogs.add(one);
        dogs.add(two);
        dogs.add(three);

        //ArrayList Dog - oldest Dog
        dogs.sort(Comparator.comparing(Dog::getAge));
        System.out.println("The oldest is: " + dogs.get(2).name + ", it is a: " + dogs.get(2).breed);

        //ArrayList Dog - to dog with equal name
        for (int j = 0; j < dogs.size(); j++) {
            for (int i = 0; i < dogs.size(); i++) {
                if (dogs.get(j).name.equals(dogs.get(i).name) && !(j ==i)){
                    System.out.println("Dog number " + j +  " name: " + dogs.get(j).name + " is equals Dog number " + i +  " name " + dogs.get(i).name);
                }
            }
        }*/
    }

    String name;
    Breed breed;
    int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    enum Breed {
        Labrador, Bulldog, Shepherd, Retriever, Poodle, Beagle, Rottweiler;
    }
}
