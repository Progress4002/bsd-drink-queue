package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Queue implementation for managing String elements.
 * Stores elements in FIFO (first-in-first-out) order.
 */
public class StringQueue implements IQueue {

    private List<String> elements = new ArrayList<>();
    private int maxSize = 5;

    /**
     * Creates a StringQueue with default maximum capacity of 5.
     */
    public StringQueue() {
    }

    /**
     * Creates a StringQueue with specified maximum capacity.
     *
     * @param maxsize maximum number of elements in queue
     */
    public StringQueue(int maxsize) {
        this.maxSize = maxsize;
    }

    /**
     * Adds an element to the queue.
     *
     * @param obj the element to add
     * @return true if successful, false if queue is full
     */
    @Override
    public boolean offer(String obj) {
        if (elements.size() < maxSize) {
            elements.add(obj);
            return true;
        }
        return false;
    }

    /**
     * Retrieves and removes the head of the queue.
     *
     * @return the head element, or null if queue is empty
     */
    @Override
    public String poll() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.remove(0);
    }

    /**
     * Retrieves and removes the head of the queue.
     *
     * @return the head element
     * @throws NoSuchElementException if queue is empty
     */
    @Override
    public String remove() {
        if (elements.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return elements.remove(0);
    }

    /**
     * Retrieves, but does not remove, the head of the queue.
     *
     * @return the head element, or null if queue is empty
     */
    @Override
    public String peek() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.get(0);
    }

    /**
     * Retrieves, but does not remove, the head of the queue.
     *
     * @return the head element
     * @throws NoSuchElementException if queue is empty
     */
    @Override
    public String element() {
        if (elements.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return elements.get(0);
    }
}