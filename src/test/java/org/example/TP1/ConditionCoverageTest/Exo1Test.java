package org.example.TP1.ConditionCoverageTest;

import org.example.TP1.Palindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {
@Test void testPalindromeTrue() { assertTrue(Palindrome.isPalindrome("madam")); }
@Test void testPalindromeFalse() { assertFalse(Palindrome.isPalindrome("madame")); }
@Test void testNullCondition() { assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null)); }
@Test void testEmpty() { assertTrue(Palindrome.isPalindrome("")); }
}