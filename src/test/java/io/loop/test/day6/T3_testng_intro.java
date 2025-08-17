package io.loop.test.day6;

import org.testng.Assert;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class T3_testng_intro {

    @Test(priority = 2)
    public void test1() {
        System.out.println("test 1 is running");
        String actual = "Feyruz";
        String expected = "Nadir";
        assertEquals(actual, expected, "Incorrect result");
    }

    @Test(priority = 1)
    public void test2() {
        System.out.println("test 2 is running");
        String actual = "Nina";
        String expected = "Nina";
        Assert.assertEquals(actual, expected, "Actual does not match expected value");
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("Before method is running");
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("After method is running");
    }

    @BeforeClass
    public void setUp() {
        System.out.println("Before Class is running");
    }
    @AfterClass
    public void tearDown() {
        System.out.println("After Class is running");
    }
}
