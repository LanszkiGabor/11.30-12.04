package org.progmatic.dec2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Circle<T> implements Iterable{

    List<T> days = new ArrayList<>();

    /**
     * Adds an element to the circle.
     * The new element is added right after elementInCircle
     * @param elementInCircle
     * @param newElement
     */
    public void addAfter(T elementInCircle, T newElement) {
        days.add(days.indexOf(elementInCircle) + 1, newElement);
    }

    /**
     * Adds an element to the circle
     * right after the last element that was added by this method
     * @param newElement
     */
    public void add(T newElement) {
        days.add(newElement);
    }

    /**
     * creates an iterator which iterates on this Circle forever
     * @return
     */
    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = null;
        while (true) {
            it = days.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }
}
