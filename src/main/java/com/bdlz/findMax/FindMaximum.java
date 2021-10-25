package com.bdlz.findMax;

public class FindMaximum<E extends Comparable> {
    E firstValue;
    E secValue;
    E thirdValue;
    public FindMaximum(E firstValue, E secValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secValue = secValue;
        this.thirdValue = thirdValue;
    }
    public static <E extends Comparable> E maximum(E firstValue, E secValue, E thirdValue){
        E maximumNum = firstValue;
        if(secValue.compareTo(maximumNum) > 0)
            maximumNum = secValue ;
        if (thirdValue.compareTo(maximumNum) > 0)
            maximumNum = thirdValue ;
        return maximumNum;

    }
    public static void main(String[] args) {
        System.out.println("Welcome to generic programing");

    }

}
