package Lession10.examples;

import org.testng.annotations.Test;

public class GroupTests {
    @Test(groups = "smoke")
    public void testSmokeGroup1() {
        System.out.println("First testing from smoke group");
    }

    @Test(groups = "smoke")
    public void testSmokeGroup2() {
        System.out.println("Second testing from smoke group");
    }

    @Test
    public void testNoGroup() {
        System.out.println("This testing doesn't belong to any group");
    }

    @Test(groups = "regression")
    public void testRegressionGroup1() {
        System.out.println("First testing from regression group");
    }

    @Test(groups = "regression")
    public void testRegressionGroup2() {
        System.out.println("Second testing from regression group");
    }
}
