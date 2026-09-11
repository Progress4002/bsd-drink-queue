package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class StringQueue implements IQueue {

    private final List<String> elements = new ArrayList<>();
    private final int maxSize;

    public StringQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public boolean offer(String obj) {
        if (elements.size() >= maxSize) {
            return false;
        }

        elements.add(obj);
        return true;
    }

    @Override
    public String poll() {
        if (elements.isEmpty()) {
            return null;
        }

        return elements.remove(0);
    }

    @Override
    public String remove() {
        String element = poll();

        if (element == null) {
            throw new NoSuchElementException(
                    "There is no element in the queue."
            );
        }

        return element;
    }

    @Override
    public String peek() {
        if (elements.isEmpty()) {
            return null;
        }

        return elements.get(0);
    }

    @Override
    public String element() {
        String element = peek();

        if (element == null) {
            throw new NoSuchElementException(
                    "There is no element in the queue."
            );
        }

        return element;
    }
}