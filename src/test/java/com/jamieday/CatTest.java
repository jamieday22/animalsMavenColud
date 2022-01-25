package com.jamieday;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    @Test
    public void weightTest(){

        Animal testAnimal = new Cat();
        testAnimal.setWeight(10000);
        assertEquals(testAnimal.getWeight(), 10000, "Wrong weight for cat");

    }

    @Test
    public void heightTest(){

        Animal testAnimal = new Cat();
        testAnimal.setWeight(20);
        assertEquals(testAnimal.getWeight(), 20, "Wrong height for cat");

    }




}
