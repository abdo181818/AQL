package org.example.TP0;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void testBaseCases() {
        // Test pour F(0)
        assertEquals(0, Fibonacci.fibonacci(0), "F(0) doit être 0");

        // Test pour F(1)
        assertEquals(1, Fibonacci.fibonacci(1), "F(1) doit être 1");
    }

    @Test
    void testSmallValues() {
        // Test pour F(2)
        assertEquals(1, Fibonacci.fibonacci(2), "F(2) doit être 1");

        // Test pour F(3)
        assertEquals(2, Fibonacci.fibonacci(3), "F(3) doit être 2");

        // Test pour F(4)
        assertEquals(3, Fibonacci.fibonacci(4), "F(4) doit être 3");

        // Test pour F(5)
        assertEquals(5, Fibonacci.fibonacci(5), "F(5) doit être 5");
    }

    @Test
    void testLargerValues() {
        // Test pour F(10)
        assertEquals(55, Fibonacci.fibonacci(10), "F(10) doit être 55");

        // Test pour F(15)
        assertEquals(610, Fibonacci.fibonacci(15), "F(15) doit être 610");

        // Test pour F(20)
        assertEquals(6765, Fibonacci.fibonacci(20), "F(20) doit être 6765");
    }

    @Test
    void testNegativeInput() {
        // Tentative de calcul pour une valeur négative
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Fibonacci.fibonacci(-1);
        });
        assertEquals("n must be positive", exception.getMessage(), "Le message d'erreur doit être 'n must be positive'");
    }

    @Test
    void testPerformanceForLargeN() {
        // Test pour une grande valeur de n (optionnel, attention à la performance)
        int result = Fibonacci.fibonacci(30); // Limite raisonnable pour un algorithme récursif
        assertEquals(832040, result, "F(30) doit être 832040");
    }
}
