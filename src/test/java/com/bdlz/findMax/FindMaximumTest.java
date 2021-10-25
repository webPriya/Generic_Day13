package com.bdlz.findMax;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaximumTest {
    @Test
    public void findMaximum_atFirstPosition() {
    float actualResult = FindMaximum.maximum(6.5f,1.2f,3.2f);
        Assert.assertEquals(6.5,actualResult,0.0);
    }
    @Test
    public void findMaximum_atSecondPosition() {
        float actualResult = FindMaximum.maximum(6.5f,9.2f,3.2f);
        Assert.assertEquals(9.2,actualResult,0.0);
    }
    @Test
    public void findMaximum_atThirdPosition() {
        float actualResult = FindMaximum.maximum(6.5f,1.2f,9.2f);
        Assert.assertEquals(9.2,actualResult,0.0);
    }


}