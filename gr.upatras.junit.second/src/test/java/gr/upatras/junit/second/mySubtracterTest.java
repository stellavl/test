package gr.upatras.junit.second;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class mySubtracterTest {

    @Test
    public void testSubtractAndCheckPositiveResult() {
        int num1 = 10;
        int num2 = 5;
        String expectedResult = "POSITIVE";

        String result = mySubtracter.subtracter(num1, num2);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testSubtractAndCheckNegativeResult() {
        int num1 = 5;
        int num2 = 10;
        String expectedResult = "NEGATIVE";

        String result = mySubtracter.subtracter(num1, num2);

        Assertions.assertEquals(expectedResult, result);
    }
}



