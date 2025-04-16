package org.example.TP1.LineCoverageTest;

import org.example.TP1.Correction.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exo6TestCorrection {
    @Test
    void testFizzBuzz() { assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15)); }
    @Test void testFizz() { assertEquals("Fizz", FizzBuzz.fizzBuzz(9)); }
    @Test void testBuzz() { assertEquals("Buzz", FizzBuzz.fizzBuzz(10)); }
    @Test void testNumber() { assertEquals("7", FizzBuzz.fizzBuzz(7)); }
    @Test void testInvalidInput() { assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(0)); }
}
