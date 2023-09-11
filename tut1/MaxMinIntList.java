package tut1;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMinIntList extends ArrayList<Integer> {

    // Abstraction Function: The elements in this list represent the integers in the MaxMinIntList.

    // Rep Invariant: The list must not be null and should only contain Integer objects.

    /**
     * Check the rep invariant of the list.
     *
     * @throws RuntimeException if the rep invariant is violated.
     */
    public boolean repOk() {

        boolean hasNext = iterator().hasNext();

        if (!hasNext) {
            return min() == null && max() == null; // Both should be null for an empty list
        }

        boolean valid = true;
        for (Integer num : this) {
            if (num == null || (min() != null && num < min()) || (max() != null && num > max())) {
                valid = false;
                break;
            }
        }
        return valid;
    }

    /**
     * Construct an empty MaxMinIntList.
     */
    public MaxMinIntList() {
        super();
    }

    /**
     * Returns the smallest element in the list.
     *
     * @return the smallest element.
     */
    public Integer min() {
        if (isEmpty()) {
            return null; // Return null for an empty list
        }

        Integer min = get(0);
        for (Integer num : this) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /**
     * Returns the largest element in the list.
     *
     * @return the largest element.
     */
    public Integer max() {
        if (isEmpty()) {
            return null; // Return null for an empty list
        }

        Integer max = get(0);
        for (Integer num : this) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Main function to test the MaxMinIntList implementation.
     */
    public static void main(String[] args) {
        MaxMinIntList list = new MaxMinIntList();
        list.add(5);
        list.add(10);
        list.add(2);
        list.add(8);
//        list.add((int) 4.3);
        System.out.println(list.repOk());
        System.out.println("List: " + list);
        System.out.println("Min: " + list.min());
        System.out.println("Max: " + list.max());
        System.out.println(list);
        int range = list.size() - 1;
        for (int i = range; i > range - 2; i--) {
            System.out.println(list.get(i));
        }
    }
}
