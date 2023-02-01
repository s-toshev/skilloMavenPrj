package Lession10.exercises;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testing {

    @DataProvider(name = "calcSumValue")
    public Object [][] calcSumValue(){
        return new Object[][]{
                {1,2,3},
                {1,1,4},
        };
    }

    @Test(dataProvider = "calcSumValue")
    public void calculateSum(int a, int b, int expected) {
        int actual = a + b;
        Assert.assertEquals(actual,expected);
    }

    @DataProvider(name = "calcMinusValue")
    public Object[][] calcMinusValue(){
        return new Object[][]{
                {1,5,7},
                {3,1,2},
        };
    }

    @Test(dataProvider = "calcMinusValue")
    public void calculateMinus(int a, int b, int expected){
        int actual = a - b;
        Assert.assertEquals(actual,expected);
    }

}
