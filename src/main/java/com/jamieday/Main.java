package com.jamieday;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Ragdoll", "Tabby");
        Cat cat2 = new Cat();
        Cat cat3 = new Cat("Coon",6,"Female","Ginger","Bobby");
        cat.setName("Tiddles");

        cat.breathe();
        cat.eat("Felix");
        cat.poop();
        System.out.println(cat.getBreed());
        System.out.println(cat.getColour());
        System.out.println(cat.getName());
        System.out.println(cat2.getBreed());
        System.out.println(cat2.getColour());
        System.out.println(cat3.getBreed());
        System.out.println(cat3.getColour());
        System.out.println(cat3.getName());
    }
}
