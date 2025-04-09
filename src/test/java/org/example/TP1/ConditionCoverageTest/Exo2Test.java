package org.example.TP1.ConditionCoverageTest;

import org.example.TP1.Anagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo2Test {
@Test void testCaseInsensitive() { assertTrue(Anagram.isAnagram("Chien", "Niche")); }
@Test void testSpacesIgnored() { assertTrue(Anagram.isAnagram("a bc", "cab")); }
}