package org.jan_12_25;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx1 {
    @Test
    public void testMethod1() {
        System.out.println("Test Method 1");

        int a = 10;
        //Assert.assertEquals(a, 10);
        Assert.assertEquals(a, 10, "'a' variable value should be 10.");

        int[] ar = {20,10,-30,50};
        //Assert.assertTrue(ar.length == 0);
        Assert.assertTrue(ar.length == 0, "Array has data in it.");
        System.out.println("Test 1 Method completed.");
    }
    @Test
    public void testMethod2() {
        System.out.println("Test Method 2");
    }
}
