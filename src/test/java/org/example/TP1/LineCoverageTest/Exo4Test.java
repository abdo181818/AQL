package org.example.TP1.LineCoverageTest;

import org.example.TP1.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo4Test {
@Test void testTwoRoots() { assertArrayEquals(new double[]{2.0, 1.0}, QuadraticEquation.solve(1, -3, 2), 0.001); }
@Test void testOneRoot() { assertArrayEquals(new double[]{-1.0}, QuadraticEquation.solve(1, 2, 1), 0.001); }
@Test void testNoRoot() { assertNull(QuadraticEquation.solve(1, 1, 1)); }
@Test void testInvalidA() { assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 1, 1)); }
}