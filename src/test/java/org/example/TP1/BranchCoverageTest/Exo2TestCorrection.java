package org.example.TP1.BranchCoverageTest;

import org.example.TP1.Correction.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;





public class Exo2TestCorrection {
    @Test
    void testSameLetters() { assertTrue(Anagram.isAnagram("listen", "silent")); }
    @Test void testUnequalLetters() { assertFalse(Anagram.isAnagram("abc", "def")); }
    @Test void testNulls() { assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, null)); }
}