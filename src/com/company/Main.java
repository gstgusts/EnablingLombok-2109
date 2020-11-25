package com.company;

public class Main {

    public static void main(String[] args) {

        var dog1  = new Dog("Jerijs");

        dog1.setAge(5);

        System.out.println(dog1);
        dog1.bark(3);

        var dog2 = new Dog("Jerijs");

        dog2.setAge(5);

        System.out.println(dog1.equals(dog2));
    }
}
