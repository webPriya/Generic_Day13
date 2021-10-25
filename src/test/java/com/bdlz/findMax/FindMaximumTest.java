package com.bdlz.findMax;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaximumTest {
    @Test
    public void findMaximum_atFirstPosition() {
    int actualResult = FindMaximum.maximum(3,6,1);
        Assert.assertEquals(6,actualResult);
    }


}