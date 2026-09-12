package at.campus02.bsd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DrinkTest {

    @Test
    public void testDrinkConstructor() {
        Drink drink = new SimpleDrink("Test", new Liquid("Water", 0.1, 0));
        assertEquals("Test", drink.getName());
    }

    @Test
    public void testSetName() {
        Drink drink = new SimpleDrink("Test", new Liquid("Water", 0.1, 0));
        drink.setName("NewName");
        assertEquals("NewName", drink.getName());
    }

    @Test
    public void testGetVolume() {
        Drink drink = new SimpleDrink("Test", new Liquid("Water", 0.5, 0));
        assertEquals(0.5, drink.getVolume(), 0.001);
    }

    @Test
    public void testGetAlcoholPercent() {
        Drink drink = new SimpleDrink("Test", new Liquid("Vodka", 0.1, 40));
        assertEquals(40, drink.getAlcoholPercent(), 0.001);
    }

    @Test
    public void testIsAlcoholicTrue() {
        Drink drink = new SimpleDrink("Beer", new Liquid("Beer", 0.5, 5));
        assertTrue(drink.isAlcoholic());
    }

    @Test
    public void testIsAlcoholicFalse() {
        Drink drink = new SimpleDrink("Water", new Liquid("Water", 0.5, 0));
        assertFalse(drink.isAlcoholic());
    }
}