package com.bdlz.findMax;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaximumTest {
    @Test
    public void findMaximumString_atFirstPosition() {
        String actualResult = FindMaximum.maximum("Peach","Apple","Banana");
        Assert.assertEquals("Peach",actualResult);
    }
    @Test
    public void findMaximumString_atSecondPosition() {
        String actualResult = FindMaximum.maximum("Apple","Peach","Banana");
        Assert.assertEquals("Peach",actualResult);
    }
    @Test
    public void findMaximumString_atThirdPosition() {
        String actualResult = FindMaximum.maximum("Banana","Apple","Peach");
        Assert.assertEquals("Peach",actualResult);
    }


}