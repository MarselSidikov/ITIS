package ru.itis.inform;

import static org.junit.Assert.*;

public class PositiveNumbersSummatorTest {

    // объектная переменная для объекта, который мы будем тестировать
    private PositiveNumbersSummator summator;

    // инструкция которая запускается перед тестами
    @org.junit.Before
    public void setUp() throws Exception {
        this.summator = new PositiveNumbersSummator();
    }

    // модульный тест - тестирующая функция
    @org.junit.Test
    public void testSumm() throws Exception {
        // то, что получили фактически при тестировании
        int actual = summator.summ(10, 6);

        // то, что мы ожидаем получить
        int expected = 16;

        // сравниваем то, что получили, с тем, что ожидаем получить
        assertEquals(expected, actual);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testOnNegative() throws Exception {
        summator.summ(-10, 1);
    }
}