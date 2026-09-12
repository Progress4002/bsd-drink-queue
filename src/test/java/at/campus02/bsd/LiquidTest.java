package at.campus02.bsd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LiquidTest {

    @Test
    public void testLiquidConstructor() {
        Liquid liquid = new Liquid("Water", 0.5, 0);
        assertEquals("Water", liquid.getName());
        assertEquals(0.5, liquid.getVolume(), 0.001);
        assertEquals(0, liquid.getAlcoholPercent(), 0.001);
    }

    @Test
    public void testSetName() {
        Liquid liquid = new Liquid("Water", 0.5, 0);
        liquid.setName("Vodka");
        assertEquals("Vodka", liquid.getName());
    }

    @Test
    public void testSetVolume() {
        Liquid liquid = new Liquid("Water", 0.5, 0);
        liquid.setVolume(1.0);
        assertEquals(1.0, liquid.getVolume(), 0.001);
    }

    @Test
    public void testSetAlcoholPercent() {
        Liquid liquid = new Liquid("Water", 0.5, 0);
        liquid.setAlcoholPercent(40);
        assertEquals(40, liquid.getAlcoholPercent(), 0.001);
    }

    @Test
    public void testGetAlcoholPercent() {
        Liquid liquid = new Liquid("Vodka", 0.1, 40);
        assertEquals(40, liquid.getAlcoholPercent(), 0.001);
    }
}