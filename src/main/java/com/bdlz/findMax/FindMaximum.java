package com.bdlz.findMax;

public class FindMaximum {
    public static Float maximum(Float firstValue, Float secValue, Float thirdValue){
        Float maximumNum = firstValue;
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
