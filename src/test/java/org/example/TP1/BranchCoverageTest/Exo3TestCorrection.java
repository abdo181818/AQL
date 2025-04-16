package org.example.TP1.BranchCoverageTest;



import org.example.TP1.Correction.BinarySearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo3TestCorrection {
    @Test void testLowerHalf() { assertEquals(0, BinarySearch.binarySearch(new int[]{1,2,3}, 1)); }
    @Test void testUpperHalf() { assertEquals(2, BinarySearch.binarySearch(new int[]{1,2,3}, 3)); }
}
