package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Queue implementation for managing Drink objects.
 * Stores drinks in FIFO (first-in-first-out) order.
 */
public class DrinkQueue {

    private List<Drink> drinks = new ArrayList<>();
    private int maxSize;

    /**
     * Creates a DrinkQueue with specified maximum capacity.
     * @param maxSize maximum number of drinks in queue
     */
    public DrinkQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * Adds a drink to the queue.
     * @param drink the drink to add
     * @return true if successful, false if queue is full
     */
    public boolean offer(Drink drink) {
        if (drinks.size() < maxSize) {
            drinks.add(drink);
            return true;
        }
        return false;
    }

    /**
     * Retrieves and removes the head of the queue.
     * @return the drink at the head, or null if queue is empty
     */
    public Drink poll() {
        if (drinks.isEmpty()) {
            return null;
        }
        return drinks.remove(0);
    }

    /**
     * Retrieves and removes the head of the queue.
     * @return the drink at the head
     * @throws NoSuchElementException if queue is empty
     */
    public Drink remove() {
        if (drinks.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return drinks.remove(0);
    }

    /**
     * Retrieves, but does not remove, the head of the queue.
     * @return the drink at the head, or null if queue is empty
     */
    public Drink peek() {
        if (drinks.isEmpty()) {
            return null;
        }
        return drinks.get(0);
    }

    /**
     * Retrieves, but does not remove, the head of the queue.
     * @return the drink at the head
     * @throws NoSuchElementException if queue is empty
     */
    public Drink element() {
        if (drinks.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return drinks.get(0);
    }

    /**
     * Returns the current number of drinks in the queue.
     * @return current size
     */
    public int size() {
        return drinks.size();
    }

    /**
     * Checks if the queue is empty.
     * @return true if queue has no drinks
     */
    public boolean isEmpty() {
        return drinks.isEmpty();
    }

    /**
     * Checks if the queue is full.
     * @return true if queue has reached max capacity
     */
    public boolean isFull() {
        return drinks.size() == maxSize;
    }
}