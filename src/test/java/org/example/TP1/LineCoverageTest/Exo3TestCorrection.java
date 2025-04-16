package org.example.TP1.LineCoverageTest;

import org.example.TP1.Correction.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exo3TestCorrection {
    @Test
    void testElementFound() { assertEquals(2, BinarySearch.binarySearch(new int[]{1,2,3,4}, 3)); }
    @Test void testElementNotFound() { assertEquals(-1, BinarySearch.binarySearch(new int[]{1,2,4}, 3)); }
    @Test void testNullArray() { assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 3)); }
}
