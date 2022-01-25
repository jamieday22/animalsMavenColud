import com.jamieday.Animal;
import com.jamieday.Cat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testCatWeight {


    @Test
    void age_test(){

        Animal testAnimal = new Cat();
        testAnimal.setWeight(10000);
        assertEquals(testAnimal.getWeight(), 10000, "Wrong weight for cat");

    }


}
