package ru.netology.cicles;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.maven.RestCalc;

public class RestCalcTest {

    @Test
    public void dayOfRest() {
        int income = 100000;
        int expense = 60000;
        int thresold = 150000;
        RestCalc service = new RestCalc();
        int actual = service.restMonth(income, expense, thresold);
        int expected = 2;
        Assertions.assertEquals(expected, actual);


    }
}
