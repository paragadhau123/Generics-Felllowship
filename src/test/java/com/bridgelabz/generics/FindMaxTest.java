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
    public void givenFirstIntegerNumberAsMaximum_ShouldReturnFirstIntegerNumberAsMaximum() {
        Integer max = findMax.findMaxValue(200, 25, 105);
        Assert.assertEquals((Integer) 200, max);
    }

    @Test
    public void givenSecondIntegerNumberAsMaximum_ShouldReturnSecondIntegerNumberAsMaximum() {
        Integer max = findMax.findMaxValue(10, 200, 150);
        Assert.assertEquals((Integer) 200, max);
    }

    @Test
    public void givenThirdIntegerNumberAsMaximum_ShouldReturnThirdIntegerNumberAsMaximum() {
        Integer max = findMax.findMaxValue(10, 20, 60);
        Assert.assertEquals((Integer) 60, max);
    }

    @Test
    public void givenFirstFloatNumberAsMaximum_ShouldReturnFirstFloatNumberAsMaximum() {
        Float max1 = findMax.findMaxValue(20f, 15f, 10f);
        Assert.assertEquals((Float) 20f, max1);
    }

    @Test
    public void givenSecondFloatNumberAsMaximum_ShouldReturnSecondFloatNumberAsMaximum() {
        Float max1 = findMax.findMaxValue(20f, 30f, 10f);
        Assert.assertEquals((Float) 30f, max1);
    }

    @Test
    public void givenThirdFloatNumberAsMaximum_ShouldReturnThirdFloatNumberAsMaximum() {
        Float max1 = findMax.findMaxValue(20f, 30f, 40f);
        Assert.assertEquals((Float) 40f, max1);
    }

    @Test
    public void givenFirstLetterAsMaximum_ShouldReturnFirstLetterAsMaximum() {
        String max2 = findMax.findMaxValue("tendulkar", "virat", "dhoni");
        Assert.assertEquals((String) "tendulkar", max2);
    }

    @Test
    public void givenSecondLetterAsMaximum_ShouldReturnSecondLetterAsMaximum() {
        String max2 = findMax.findMaxValue("ponting", "tendulkar", "adam");
        Assert.assertEquals((String) "tendulkar", max2);
    }

    @Test
    public void givenThirdLetterAsMaximum_ShouldReturnThirdLetterAsMaximum() {
        String max2 = findMax.findMaxValue("rahul", "sachin", "muralidharan");
        Assert.assertEquals((String) "muralidharan", max2);
    }
}