package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"проверка диапазона 1, 200, 300, 3",
            "проверка диапазона 2, 200, 200, 0",
            "проверка диапазона 3, 100, 100, 1",
            "проверка диапазона 4, 222, 2222, 33",
            "проверка диапазона 5, 400, 4040, 44",
            "Проверка диапазона 6, 100, 9801, 90"})
    void shouldNumberOfSquares(String testName, int minLimit, int maxLimit, int expected) {
        SQRService service = new SQRService();

        int actual = service.amountOfSquares(minLimit, maxLimit);

        assertEquals(expected, actual);

    }
}