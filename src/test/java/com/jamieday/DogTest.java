package com.jamieday;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTest {

    @Test
    public void testWeight(){

        Animal testAnimal = new Dog();
        testAnimal.setWeight(10000);
        assertEquals(testAnimal.getWeight(), 10000, "Wrong weight for cat");

    }


}
