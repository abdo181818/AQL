package org.example.TP1.BranchCoverageTest;

import org.example.TP1.Correction.QuadraticEquation;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Exo4TestCorrection {
    @Test
    void testDeltaPositive() { assertNotNull(QuadraticEquation.solve(1, -3, 2)); }
    @Test void testDeltaZero() { assertArrayEquals(new double[]{-1}, QuadraticEquation.solve(1, 2, 1), 0.001); }

}
