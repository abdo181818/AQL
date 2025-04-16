package org.example.TP1.BranchCoverageTest;

import org.example.TP1.Correction.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exo5TestCorrection {
    @Test
    void testMultipleConversions() {
        assertEquals("XLII", RomanNumeral.toRoman(42));
        assertEquals("CMXC", RomanNumeral.toRoman(990));
    }
}
