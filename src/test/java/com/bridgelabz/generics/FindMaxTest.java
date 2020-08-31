package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindMaxTest {
    FindMax findMax;

    @Before
    public void initData() {
        findMax = new FindMax();
    }

    @Test
    public void givenFirstNumberAsMaximum_ShouldReturnFirstNumberAsMax() {
        Integer max = findMax.findMaxValue(200, 25, 105);
        Assert.assertEquals((Integer) 200, max);
    }

    @Test
    public void givenSecondNumberAsMaximum_ShouldReturnSecondNumberAsMaximum() {
        Integer max = findMax.findMaxValue(10,200,150);
        Assert.assertEquals((Integer) 200,max);
    }

    @Test
    public void givenThirdNumberAsMaximum_ShouldReturnThirdNumberAsMaximum() {
        Integer max = findMax.findMaxValue(10,20,60);
        Assert.assertEquals((Integer) 60,max);
    }

    @Test
    public void givenFirstNumberAsMaximum_ShouldReturnFirstNumberAsMaximum() {
        Float max = findMax.findMaxValue(20f,15f,10f);
        Assert.assertEquals((Float)20f,max);
    }
}