package Test;

import org.example.Factorial;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    @Test

    public void testCalculateFactorial(){
        int num = 5;
        long expectedResult = 120;
        Factorial.num = num;;
        long actualResult = Factorial.getFactorial();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test

    public void testWithZero(){
        int num = 0;
        long expectedResult = 1;
        Factorial.num = num;
        long actualResult = Factorial.getFactorial();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)

    public void testNegativeNumber(){
        int num = -5;
        Factorial.num = num;
        Factorial.getFactorial();
    }

    @Test(expectedExceptions = IllegalArgumentException.class)

    public void testNumberBiggerThenConst(){
        int num = 22;
        Factorial.num = num;
        Factorial.getFactorial();
    }
}

