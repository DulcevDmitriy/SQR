package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {
    @Test
    public void test() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 300);
        int expected = 3;

        Assertions Assertion = null;
        Assertion.assertEquals(expected, actual);

    }
}
