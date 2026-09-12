package at.campus02.bsd;

import java.util.NoSuchElementException;

/**
 * Queue interface for managing elements in FIFO (first-in-first-out) order.
 * Defines standard queue operations.
 */
public interface IQueue {
    /**
     * Adds an element to the queue.
     *
     * @param obj the element to add
     * @return true if successful, false if queue is full
     */
    boolean offer(String obj);

    /**
     * Retrieves and removes the head of the queue.
     *
     * @return the head element, or null if queue is empty
     */
    String poll();

    /**
     * Retrieves and removes the head of the queue.
     *
     * @return the head element
     * @throws NoSuchElementException if queue is empty
     */
    String remove();

    /**
     * Retrieves, but does not remove, the head of the queue.
     *
     * @return the head element, or null if queue is empty
     */
    String peek();

    /**
     * Retrieves, but does not remove, the head of the queue.
     *
     * @return the head element
     * @throws NoSuchElementException if queue is empty
     */
    String element();
}