package com.bdlz.findMax;

public class FindMaximum {
    public static Integer maxIntegerValue(Integer firstValue, Integer secValue, Integer thirdValue){
        Integer maximumNum = firstValue;
        if(secValue.compareTo(maximumNum) > 0)
            maximumNum = secValue ;
        if (thirdValue.compareTo(maximumNum) > 0)
            maximumNum = thirdValue ;
        return maximumNum;

    }
    public static void main(String[] args) {
        System.out.println("Welcome to generic programing");
        System.out.println("maximum value between 3 integer is =" +maxIntegerValue(9,5,2));
    }

}
