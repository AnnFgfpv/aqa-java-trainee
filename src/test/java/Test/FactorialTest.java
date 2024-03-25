package Test;

import org.example.Factorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test

    public void testCalculateFactorial(){
        int num = 5;
        long expectedResult = 120;
        Factorial.num = num;
        long actualResult = Factorial.getFactorial();
        assertEquals(expectedResult,actualResult);
    }

    @Test

    public void testZeroFactorial(){
        int num = 0;
        long expectedResult = 1;
        Factorial.num = num;
        long actualResult = Factorial.getFactorial();
        assertEquals(expectedResult, actualResult);
    }

    @Test

    public void testNegativeNumber(){
        int num = -5;
        Factorial.num = num;
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, Factorial::getFactorial);
        assertEquals("Отрицательное число: -5", e.getMessage());
    }

    @Test

    public void testBiggerThenMaxNum(){
        int num = 22;
        Factorial.num = num;
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, Factorial::getFactorial);
        assertEquals("Число больше максимального: 22", e.getMessage());
    }

}
