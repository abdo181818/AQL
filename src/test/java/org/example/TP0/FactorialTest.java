package org.example.TP0;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void testBaseCase() {
        // Test pour n = 0
        assertEquals(1, Factorial.factorial(0), "0! doit être égal à 1");
    }

    @Test
    void testSmallPositiveValues() {
        // Test pour n = 1
        assertEquals(1, Factorial.factorial(1), "1! doit être égal à 1");

        // Test pour n = 5
        assertEquals(120, Factorial.factorial(5), "5! doit être égal à 120");

        // Test pour n = 10
        assertEquals(3628800, Factorial.factorial(10), "10! doit être égal à 3628800");
    }

    @Test
    void testEdgeCaseForMaxInt() {
        // Test pour n = 12 (le plus grand n pour lequel n! tient dans un int)
        assertEquals(479001600, Factorial.factorial(12), "12! doit être égal à 479001600");

        // Test pour n = 13 (dépassement de capacité attendu)
        assertThrows(ArithmeticException.class, () -> {
            Factorial.factorial(13);
        }, "13! dépasse la capacité d'un int et doit provoquer un ArithmeticException");
    }

    @Test
    void testNegativeInput() {
        // Tentative de calcul pour une valeur négative
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial.factorial(-1);
        });
        assertEquals("n must be positive", exception.getMessage(), "Le message d'erreur doit être 'n must be positive'");
    }
}
