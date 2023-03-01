package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void testWhenFewSquaresFound() {
        SQRService service = new SQRService();
        int actual = service.calc(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

}