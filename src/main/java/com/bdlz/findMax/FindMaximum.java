package com.bdlz.findMax;

public class FindMaximum<E extends Comparable> {
    E[] inputArray;
    public FindMaximum(E[] inputArray) {
        this.inputArray = inputArray;

    }
    public E findMaximum() {
        E result = maximum(inputArray);
        return result;
    }
    public static <E extends Comparable> E maximum(E[] inputArray) {
        E max = inputArray[0];
        for (E element : inputArray) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }


}
