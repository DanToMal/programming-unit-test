package org.example;

import org.example.model.Result;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberProcessorTest {

    @Test
    void shouldReturnProperResultForInteger() {
        Result<Integer> process = NumberProcessor.process(6, 6);

        Assertions.assertAll(
                () -> assertEquals(36, process.getMultiplicationResult())
        );

    }

}