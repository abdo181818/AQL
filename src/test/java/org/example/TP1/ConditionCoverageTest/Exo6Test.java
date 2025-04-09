package org.example.TP1.ConditionCoverageTest;

import org.example.TP1.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo6Test {
@Test void testFizzBuzzLogic() {
    assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
    assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
}
}