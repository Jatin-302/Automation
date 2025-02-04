package org.jan_12_25;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx2 {
    @Test
    public void testMethod1() {
        System.out.println("Test 1 Starts");

        int a = 10;
        //Assert.assertEquals(a, 10);
        Assert.assertEquals(a, 10, "'a' should be 10");
        System.out.println("--- equals executed ----");

        String str = "Mumbai";
        Assert.assertNotEquals(str, "Delhi");
        //Assert.assertNotEquals(str, "Mumbai", "Both values should not be SAME.");
        System.out.println("--- NOT equals executed ----");

        int ar[] = {50,20,-10,40};
        Assert.assertTrue(ar.length != 0);
        System.out.println("--- assertTrue executed ----");

        Assert.assertFalse(ar.length == 0);
        System.out.println("--- assertFalse executed ----");
        System.out.println("Test 1 Ends");
    }
    @Test
    public void testMethod2() {
        System.out.println("Test Method 2");
    }
}
