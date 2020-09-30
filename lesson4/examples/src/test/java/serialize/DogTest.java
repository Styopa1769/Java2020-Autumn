package serialize;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DogTest {

    @Test
    public void getName() {
        Dog dog = new Dog();
        dog.name = "sharik";
        assertEquals("sharik",dog.getName());
        assertTrue(dog.getName().equals("sharik"));
        assertFalse(dog.getName().equals("sh"));
    }

    @Test
    @Disabled
    public void setName() {
    }
}