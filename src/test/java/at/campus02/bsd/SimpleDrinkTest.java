package at.campus02.bsd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleDrinkTest {

    @Test
    public void testSimpleDrinkConstructor() {
        Liquid liquid = new Liquid("Water", 0.5, 0);
        SimpleDrink drink = new SimpleDrink("Water", liquid);
        assertEquals("Water", drink.getName());
        assertEquals(0.5, drink.getVolume(), 0.001);
    }

    @Test
    public void testGetVolume() {
        Liquid liquid = new Liquid("Water", 0.3, 0);
        SimpleDrink drink = new SimpleDrink("Test", liquid);
        assertEquals(0.3, drink.getVolume(), 0.001);
    }

    @Test
    public void testGetAlcoholPercent() {
        Liquid liquid = new Liquid("Vodka", 0.1, 40);
        SimpleDrink drink = new SimpleDrink("Vodka", liquid);
        assertEquals(40, drink.getAlcoholPercent(), 0.001);
    }

    @Test
    public void testIsAlcoholicTrue() {
        Liquid liquid = new Liquid("Beer", 0.5, 5);
        SimpleDrink drink = new SimpleDrink("Beer", liquid);
        assertTrue(drink.isAlcoholic());
    }

    @Test
    public void testIsAlcoholicFalse() {
        Liquid liquid = new Liquid("Water", 0.5, 0);
        SimpleDrink drink = new SimpleDrink("Water", liquid);
        assertFalse(drink.isAlcoholic());
    }
}