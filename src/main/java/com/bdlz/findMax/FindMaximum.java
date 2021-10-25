package com.bdlz.findMax;

public class FindMaximum {
    public static String maximum(String firstValue, String secValue, String thirdValue){
        String maximumNum = firstValue;
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
