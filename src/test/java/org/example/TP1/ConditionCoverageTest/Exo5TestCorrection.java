package org.example.TP1.ConditionCoverageTest;

import org.example.TP1.Correction.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exo5TestCorrection {
    @Test
    void testEdgeConversions() {
        assertEquals("I", RomanNumeral.toRoman(1));
        assertEquals("MMMCMXCIX", RomanNumeral.toRoman(3999));
    }
}
