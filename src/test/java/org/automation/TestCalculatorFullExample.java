package org.automation;


import org.automation.core.TestingCalculator;
import org.junit.Assert;
import org.junit.Test;


public class TestCalculatorFullExample extends TestingCalculator {

    @Test

    public void testAddition(){
        Assert.assertEquals(25.0, aCalculator.add(10.0,15.0), 0.01);
    }

    @Test

    public void testSub(){
        Assert.assertEquals(-5.0, aCalculator.sub(10.0,15.0), 0.01);
    }

}
