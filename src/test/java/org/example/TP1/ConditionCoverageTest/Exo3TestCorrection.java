package org.example.TP1.ConditionCoverageTest;

import org.example.TP1.Correction.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exo3TestCorrection {
    @Test
    void testMiddleElement() { assertEquals(1, BinarySearch.binarySearch(new int[]{1,2,3}, 2)); }
    @Test void testOneElementMatch() { assertEquals(0, BinarySearch.binarySearch(new int[]{5}, 5)); }
}
