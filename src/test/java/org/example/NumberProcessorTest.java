package org.example;

import org.example.model.Result;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberProcessorTest {

    @Test
    void shouldReturnProperResultsForInteger() {
        Result<Integer> result = NumberProcessor.process(6, 6);

        Assertions.assertAll(
                () -> assertEquals(36, result.getMultiplicationResult()),
                () -> assertEquals(1, result.getDivisionResult()),
                () -> assertEquals(0, result.getModulo())
        );
    }

    @Test
    void shouldReturnProperResultsForDouble() {
        Result<Double> result = NumberProcessor.process(8.8, 12.20);

        Assertions.assertAll(
                () -> assertEquals(107.36, result.getMultiplicationResult()),
                () -> assertEquals(0.7213114754098362, result.getDivisionResult()),
                () -> assertEquals(8.8, result.getModulo())
        );
    }

    @Test
    void shouldThrowAnExceptionForZeroAsDivider() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> NumberProcessor.process(25, 0));

        assertEquals("Cannot divide by 0!", exception.getMessage());
    }

}