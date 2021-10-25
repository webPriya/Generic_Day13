package com.bdlz.findMax;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaximumTest {
    @Test
    public void findMaximum_IntegerValue() {
    int actualResult = FindMaximum.maxIntegerValue(5,6,2);
        Assert.assertEquals(6,actualResult);
    }

}