package org.example.TP1.BranchCoverageTest;

import org.example.TP1.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo4Test {
@Test void testDeltaPositive() { assertNotNull(QuadraticEquation.solve(1, -3, 2)); }
@Test void testDeltaZero() { assertArrayEquals(new double[]{-1}, QuadraticEquation.solve(1, 2, 1), 0.001); }
}