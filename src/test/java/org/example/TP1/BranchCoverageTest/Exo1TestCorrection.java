package org.example.TP1.BranchCoverageTest;

import org.example.TP1.Correction.Palindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo1TestCorrection {
    @Test void testEqualChars() { assertTrue(Palindrome.isPalindrome("abba")); }
    @Test void testDifferentChars() { assertFalse(Palindrome.isPalindrome("abc")); }
    @Test void testSingleChar() { assertTrue(Palindrome.isPalindrome("a")); }
    @Test void testNull() { assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null)); }
}
