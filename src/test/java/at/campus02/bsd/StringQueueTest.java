package at.campus02.bsd;

import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

public class StringQueueTest {

    @Test
    public void testStringQueueConstructor() {
        StringQueue queue = new StringQueue(5);
        assertNull(queue.poll());
    }

    @Test
    public void testOffer() {
        StringQueue queue = new StringQueue(5);
        assertTrue(queue.offer("Test"));
    }

    @Test
    public void testOfferFull() {
        StringQueue queue = new StringQueue(2);
        queue.offer("A");
        queue.offer("B");
        assertFalse(queue.offer("C"));
    }

    @Test
    public void testPoll() {
        StringQueue queue = new StringQueue(5);
        queue.offer("Test");
        String result = queue.poll();
        assertEquals("Test", result);
        assertNull(queue.poll());
    }

    @Test
    public void testPollEmpty() {
        StringQueue queue = new StringQueue(5);
        assertNull(queue.poll());
    }

    @Test
    public void testRemove() {
        StringQueue queue = new StringQueue(5);
        queue.offer("Test");
        String result = queue.remove();
        assertEquals("Test", result);
    }

    @Test
    public void testRemoveEmpty() {
        StringQueue queue = new StringQueue(5);
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    @Test
    public void testPeek() {
        StringQueue queue = new StringQueue(5);
        queue.offer("Test");
        String result = queue.peek();
        assertEquals("Test", result);
    }

    @Test
    public void testPeekEmpty() {
        StringQueue queue = new StringQueue(5);
        assertNull(queue.peek());
    }

    @Test
    public void testElement() {
        StringQueue queue = new StringQueue(5);
        queue.offer("Test");
        String result = queue.element();
        assertEquals("Test", result);
    }

    @Test
    public void testElementEmpty() {
        StringQueue queue = new StringQueue(5);
        assertThrows(NoSuchElementException.class, () -> queue.element());
    }
}