package org.example.TP1.LineCoverageTest;

import org.example.TP1.Correction.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exo5TestCorrection {
    @Test
    void testValidConversions() {
        assertEquals("I", RomanNumeral.toRoman(1));
        assertEquals("IV", RomanNumeral.toRoman(4));
        assertEquals("X", RomanNumeral.toRoman(10));
    }
    @Test void testInvalidLow() { assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0)); }
    @Test void testInvalidHigh() { assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000)); }
}
