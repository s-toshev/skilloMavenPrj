package Lession10.examples;

import org.testng.annotations.*;

public class ATestNGLifeCycleTests {

    @BeforeSuite
    public void testBeforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void testBeforeTest() {
        System.out.println("Before testing");
    }

    @BeforeClass
    public void testBeforeClass() {
        System.out.println("Before class");
    }

    @BeforeMethod(alwaysRun = true)
    public void testBeforeMethod() {
        System.out.println("Before method");
    }

    @Test
    public void testName() {
        System.out.println("In testing method");
    }

    @Test
    public void testName1() {
        System.out.println("In testing method1");
    }

    @AfterMethod
    public void testAfterMethod() {
        System.out.println("After method");
    }

    @AfterClass
    public void testAfterClass() {
        System.out.println("After class");
    }

    @AfterTest
    public void testAfterTest() {
        System.out.println("After testing");
    }

    @AfterSuite
    public void testAfterSuite() {
        System.out.println("After Suite");
    }
}
