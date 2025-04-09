package org.example.TP0;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testGetFullName() {
        // Création d'une instance de Person
        Person person = new Person("Alice", "Dupont", 25);

        // Vérification du nom complet
        assertEquals("Alice Dupont", person.getFullName(), "Le nom complet doit être 'Alice Dupont'");
    }

    @Test
    void testIsAdultWhenAdult() {
        // Création d'une instance de Person majeure
        Person person = new Person("Alice", "Dupont", 25);

        // Vérification que la personne est majeure
        assertTrue(person.isAdult(), "La personne doit être considérée comme majeure");
    }

    @Test
    void testIsAdultWhenMinor() {
        // Création d'une instance de Person mineure
        Person person = new Person("Bob", "Martin", 16);

        // Vérification que la personne est mineure
        assertFalse(person.isAdult(), "La personne doit être considérée comme mineure");
    }

    @Test
    void testEdgeCaseForAdult() {
        // Création d'une instance de Person ayant exactement 18 ans
        Person person = new Person("Charlie", "Brown", 18);

        // Vérification que la personne est majeure
        assertTrue(person.isAdult(), "Une personne de 18 ans doit être considérée comme majeure");
    }
}