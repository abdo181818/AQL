package org.example.TP1.LineCoverageTest;

import org.example.TP1.Anagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo2Test {
@Test void testIsAnagram() { assertTrue(Anagram.isAnagram("chien", "niche")); }
@Test void testNotAnagram() { assertFalse(Anagram.isAnagram("chat", "chien")); }
@Test void testDifferentLengths() { assertFalse(Anagram.isAnagram("test", "tests")); }
@Test void testNullInput1() { assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "test")); }
@Test void testNullInput2() { assertThrows(NullPointerException.class, () -> Anagram.isAnagram("test", null)); }
}