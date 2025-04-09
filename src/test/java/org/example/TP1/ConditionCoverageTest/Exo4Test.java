package org.example.TP1.ConditionCoverageTest;

import org.example.TP1.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo4Test {
@Test void testDeltaNegative() { assertNull(QuadraticEquation.solve(1, 1, 1)); }
}