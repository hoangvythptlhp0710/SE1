package tut3;

import tut3.exceptino.NonPositiveException;
import tut3.exceptino.NotFoundException;

public class Ex2 {

    public static int fact(int n) throws NonPositiveException {
        if (n < 0) {
            throw new NonPositiveException("n must be positive");
        }
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }


    // REQUIRED: a is sorted
    // EFFECTS: If a is null throws NullPointerException; else if x is not in a, throws NotFoundException; else return i such that a[i] = x
    public static int search(int[] arr, int x) throws NullPointerException, NotFoundException {
        if (arr == null) {
            throw new NullPointerException("arr is null");
        }
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == x) {
                return i;
            }
            i++;
        }
        throw new NotFoundException("x is not in arr");
    }

    // Using while(true) loop and throw IndexOutOfBoundException
    public static int search2(int[] a, int x)  throws IndexOutOfBoundsException{
        int index = 0;
        while (true) {
            if (index >= a.length) {
                throw new IndexOutOfBoundsException("x is not in a");
            }
            if (a[index] == x) {
                return index;
            }
            index++;
        }
    }


}
