package com.jamieday;

public class Cat extends Mammal{

    ///////////////////////////////////Attributes////////////////////////////////////////

    private String breed;
    private int weight;
    private String sex;
    private String colour;


    /////////////////////////////////////////constructors/////////////////////////////////////
    public Cat(){
        this("red");
    }


    public Cat(String colour){
        this("Big",colour);
    }

    public Cat(String breed, String colour){
        this(breed,4,colour);
    }

    public Cat(String breed, int weight, String colour){
        this(breed,4,"Male",colour);
    }

    public Cat(String breed, int weight, String sex, String colour){
        super("Cat");
        this.colour = colour;
        this.sex = sex;
        this.weight = weight;
        this.breed = breed;
    }
    public Cat(String breed, int weight, String sex, String colour,String name){
        super(name);
        this.colour = colour;
        this.sex = sex;
        this.weight = weight;
        this.breed = breed;
    }

    //////////////////////////////////////////Methods/////////////////////////////////////////

    public void eat(String food){
        System.out.println("I am eating "+food);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}