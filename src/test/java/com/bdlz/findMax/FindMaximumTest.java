package com.bdlz.findMax;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaximumTest {
    @Test
    public void intMax() {
        int actualResult = FindMaximum.maximum(9,10,5);
        Assert.assertEquals(10,actualResult);
    }
    @Test
    public void floatMax() {
        float actualResult = FindMaximum.maximum(8f,7f,12f);
        Assert.assertEquals(12f,actualResult,0.0);
    }
    @Test
    public void stringMax() {
        String actualResult = FindMaximum.maximum("Apple","Banana","Peach");
        Assert.assertEquals("Peach",actualResult);
    }



}