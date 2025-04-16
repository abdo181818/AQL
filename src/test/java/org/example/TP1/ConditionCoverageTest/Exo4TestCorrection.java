package org.example.TP1.ConditionCoverageTest;

import org.example.TP1.Correction.QuadraticEquation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class Exo4TestCorrection {
    @Test
    void testDeltaNegative() { assertNull(QuadraticEquation.solve(1, 1, 1)); }
}
