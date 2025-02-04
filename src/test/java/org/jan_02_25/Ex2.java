package org.jan_02_25;

import org.testng.annotations.Test;

public class Ex2 {
    @Test           //This will start the execution of Test Case
    public void testMethod1() {     //This is Test Case
        System.out.println("Test Method 1");
        int div = 10/0;
    }

    public void testMethod3() {         //Normal Method/NOT Test Case
        System.out.println("Test Method 3");
    }

    @Test           //This will start the execution of Test Case
    public void testMethod2() {     //This is Test Case
        System.out.println("Test Method 2");
    }
}
