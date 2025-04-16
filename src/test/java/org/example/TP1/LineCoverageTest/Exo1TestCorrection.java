package org.example.TP1.LineCoverageTest;

import org.example.TP1.Correction.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exo1TestCorrection {
    @Test
    void testSimplePalindrome() { assertTrue(Palindrome.isPalindrome("kayak")); }
    @Test void testPhrasePalindrome() { assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose")); }
    @Test void testNotPalindrome() { assertFalse(Palindrome.isPalindrome("bonjour")); }
    @Test void testNullInput() { assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null)); }
    @Test void testEmptyString() { assertTrue(Palindrome.isPalindrome("")); }
}
