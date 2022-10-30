package ru.netology.sqr;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class SQRServiceTest {
    @Test
    public void test (){
        SQRService service = new SQRService();

        int actual = service.calculate(200, 300);
        int expected = 3;

        Assertion.assertEquals(expected, actual);

    }
}
