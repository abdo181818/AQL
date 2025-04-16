package org.example.TP1.ConditionCoverageTest;

import org.example.TP1.Correction.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exo6TestCorrection {
    @Test
    void testFizzBuzzLogic() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }
}
