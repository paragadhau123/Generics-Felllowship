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
    public void givenFirstIntegerAsMaximum_ShouldReturnFirstIntegerAsMax() {
        Integer max = findMax.findMaxValue(200, 25, 105);
        Assert.assertEquals((Integer) 200, max);
    }

    @Test
    public void givenSecondIntegerAsMaximum_ShouldReturnSecondIntegerAsMaximum() {
        Integer max = findMax.findMaxValue(10, 200, 150);
        Assert.assertEquals((Integer) 200, max);
    }

    @Test
    public void givenThirdIntegerAsMaximum_ShouldReturnThirdIntegerAsMaximum() {
        Integer max = findMax.findMaxValue(10, 20, 60);
        Assert.assertEquals((Integer) 60, max);
    }

    @Test
    public void givenFirstFloatAsMaximum_ShouldReturnFirstFloatAsMaximum() {
        Float max1 = findMax.findMaxValue(20f, 15f, 10f);
        Assert.assertEquals((Float) 20f, max1);
    }

    @Test
    public void givenSecondFloatAsMaximum_ShouldReturnSecondFloatAsMaximum() {
        Float max1 = findMax.findMaxValue(20f, 30f, 10f);
        Assert.assertEquals((Float) 30f, max1);
    }
    @Test
    public void givenThirdFloatAsMaximum_ShouldReturnThirdFloatAsMaximum() {
        Float max1 = findMax.findMaxValue(20f, 30f, 40f);
        Assert.assertEquals((Float) 40f, max1);
    }
    @Test
    public void givenFirstStringAsMaximum_ShouldReturnFirstStringAsMaximum() {
        String max2 = findMax.findMaxValue("tendulkar","virat","dhoni" );
        Assert.assertEquals((String)"tendulkar" , max2);
    }
}