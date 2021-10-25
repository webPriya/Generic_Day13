package com.bdlz.findMax;

public class FindMaximum {
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
