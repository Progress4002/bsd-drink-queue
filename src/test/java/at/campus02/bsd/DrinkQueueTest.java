package at.campus02.bsd;

import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

public class DrinkQueueTest {

    @Test
    public void testDrinkQueueConstructor() {
        DrinkQueue queue = new DrinkQueue(5);
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testOffer() {
        DrinkQueue queue = new DrinkQueue(5);
        Drink drink = new SimpleDrink("Test", new Liquid("Water", 0.1, 0));
        assertTrue(queue.offer(drink));
        assertEquals(1, queue.size());
    }

    @Test
    public void testOfferFull() {
        DrinkQueue queue = new DrinkQueue(2);
        queue.offer(new SimpleDrink("D1", new Liquid("L1", 0.1, 0)));
        queue.offer(new SimpleDrink("D2", new Liquid("L2", 0.1, 0)));
        assertFalse(queue.offer(new SimpleDrink("D3", new Liquid("L3", 0.1, 0))));
        assertEquals(2, queue.size());
    }

    @Test
    public void testPoll() {
        DrinkQueue queue = new DrinkQueue(5);
        Drink drink = new SimpleDrink("Test", new Liquid("Water", 0.1, 0));
        queue.offer(drink);
        Drink result = queue.poll();
        assertEquals("Test", result.getName());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testPollEmpty() {
        DrinkQueue queue = new DrinkQueue(5);
        assertNull(queue.poll());
    }

    @Test
    public void testRemove() {
        DrinkQueue queue = new DrinkQueue(5);
        Drink drink = new SimpleDrink("Test", new Liquid("Water", 0.1, 0));
        queue.offer(drink);
        Drink result = queue.remove();
        assertEquals("Test", result.getName());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testRemoveEmpty() {
        DrinkQueue queue = new DrinkQueue(5);
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    @Test
    public void testPeek() {
        DrinkQueue queue = new DrinkQueue(5);
        Drink drink = new SimpleDrink("Test", new Liquid("Water", 0.1, 0));
        queue.offer(drink);
        Drink result = queue.peek();
        assertEquals("Test", result.getName());
        assertEquals(1, queue.size());
    }

    @Test
    public void testPeekEmpty() {
        DrinkQueue queue = new DrinkQueue(5);
        assertNull(queue.peek());
    }

    @Test
    public void testElement() {
        DrinkQueue queue = new DrinkQueue(5);
        Drink drink = new SimpleDrink("Test", new Liquid("Water", 0.1, 0));
        queue.offer(drink);
        Drink result = queue.element();
        assertEquals("Test", result.getName());
        assertEquals(1, queue.size());
    }

    @Test
    public void testElementEmpty() {
        DrinkQueue queue = new DrinkQueue(5);
        assertThrows(NoSuchElementException.class, () -> queue.element());
    }

    @Test
    public void testSize() {
        DrinkQueue queue = new DrinkQueue(5);
        assertEquals(0, queue.size());
        queue.offer(new SimpleDrink("D1", new Liquid("L1", 0.1, 0)));
        assertEquals(1, queue.size());
    }

    @Test
    public void testIsEmpty() {
        DrinkQueue queue = new DrinkQueue(5);
        assertTrue(queue.isEmpty());
        queue.offer(new SimpleDrink("D1", new Liquid("L1", 0.1, 0)));
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testIsFull() {
        DrinkQueue queue = new DrinkQueue(2);
        assertFalse(queue.isFull());
        queue.offer(new SimpleDrink("D1", new Liquid("L1", 0.1, 0)));
        queue.offer(new SimpleDrink("D2", new Liquid("L2", 0.1, 0)));
        assertTrue(queue.isFull());
    }
}