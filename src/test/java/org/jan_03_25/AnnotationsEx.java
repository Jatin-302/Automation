package org.jan_03_25;

import org.testng.annotations.*;

public class AnnotationsEx {
    @Test
    public void testMethod1() {         //Test Case
        System.out.println("* Test Method 1 *");
    }
    @Test
    public void testMethod2() {         //Test Case
        System.out.println("* Test Method 2 *");
    }
    @BeforeMethod
    public void beforeMethod() {        //annotation method
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {        //annotation method
        System.out.println("After Method");
    }

    @BeforeClass
    public void beforeClass() {        //annotation method
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {        //annotation method
        System.out.println("After Class");
    }

    @BeforeTest
    public void beforeTest() {        //annotation method
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest() {        //annotation method
        System.out.println("After Test");
    }

    @BeforeSuite
    public void beforeSuite() {        //annotation method
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite() {        //annotation method
        System.out.println("After Suite");
    }
}
