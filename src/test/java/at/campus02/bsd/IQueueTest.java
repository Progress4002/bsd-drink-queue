package at.campus02.bsd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IQueueTest {

    @Test
    public void testIQueueImplementation() {
        IQueue queue = new StringQueue(5);
        assertTrue(queue.offer("Test"));
        assertEquals("Test", queue.peek());
        assertEquals("Test", queue.poll());
        assertNull(queue.poll());
    }
}