package com.jamieday;

public abstract class Mammal extends Animal{


    /////////////////////////////////Attributes////////////////////////////////////////





    /////////////////////////////////Constructors///////////////////////////////////////
    public Mammal(String name){
        super(name);
    }




    ////////////////////////////////Methods////////////////////////////////////////////
    public Mammal reproduce(Animal mother,Animal father)throws Exception{

        return (Mammal)Class.forName(this.getClass().toString()).newInstance();

    }

    public void breathe(){
        System.out.println("Breathe in... Breathe out");
    }


}