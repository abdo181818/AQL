package org.example.TP1.BranchCoverageTest;

import org.example.TP1.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exo6TestCorrection {
    @Test
    void testAllPaths() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("8", FizzBuzz.fizzBuzz(8));
    }
}
