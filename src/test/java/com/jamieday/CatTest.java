package com.jamieday;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    @Test
    public void testSetWeight(){

        Animal testAnimal = new Cat();
        testAnimal.setWeight(10000);
        assertEquals(testAnimal.getWeight(), 10000, "Wrong weight for cat");

    }

    @Test
    public void testSetHeight(){

        Animal testAnimal = new Cat();
        testAnimal.setHeight(20);
        assertEquals(testAnimal.getHeight(), 20, "Wrong height for cat");

    }




}
