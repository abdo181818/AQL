package org.example.TP0;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void testPushAndPeek() {
        // Création d'une pile vide
        Stack stack = new Stack();

        // Ajout d'un élément et vérification du sommet
        stack.push(10);
        assertEquals(10, stack.peek(), "L'élément au sommet doit être 10");

        // Ajout d'un autre élément et vérification du nouveau sommet
        stack.push(20);
        assertEquals(20, stack.peek(), "L'élément au sommet doit être 20");
    }

    @Test
    void testPop() {
        // Création d'une pile avec quelques éléments
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);

        // Retrait du sommet et vérification de la valeur
        assertEquals(20, stack.pop(), "Le retrait doit retourner 20");
        assertEquals(10, stack.pop(), "Le retrait doit retourner 10");

        // Vérification que la pile est maintenant vide
        assertTrue(stack.isEmpty(), "La pile doit être vide après tous les retraits");
    }

    @Test
    void testIsEmpty() {
        // Création d'une pile vide
        Stack stack = new Stack();

        // Vérification que la pile est initialement vide
        assertTrue(stack.isEmpty(), "La pile doit être initialement vide");

        // Ajout d'un élément et vérification que la pile n'est plus vide
        stack.push(10);
        assertFalse(stack.isEmpty(), "La pile ne doit pas être vide après un ajout");

        // Retrait de l'élément et vérification que la pile est à nouveau vide
        stack.pop();
        assertTrue(stack.isEmpty(), "La pile doit être vide après un retrait");
    }

    @Test
    void testSize() {
        // Création d'une pile vide
        Stack stack = new Stack();

        // Vérification de la taille initiale
        assertEquals(0, stack.size(), "La taille initiale doit être 0");

        // Ajout d'éléments et vérification de la taille
        stack.push(10);
        assertEquals(1, stack.size(), "La taille doit être 1 après un ajout");
        stack.push(20);
        assertEquals(2, stack.size(), "La taille doit être 2 après deux ajouts");

        // Retrait d'éléments et vérification de la taille
        stack.pop();
        assertEquals(1, stack.size(), "La taille doit être 1 après un retrait");
        stack.pop();
        assertEquals(0, stack.size(), "La taille doit être 0 après tous les retraits");
    }

    @Test
    void testExpandArray() {
        // Création d'une pile et remplissage jusqu'à dépasser la capacité initiale
        Stack stack = new Stack();
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }

        // Vérification que la pile contient les éléments attendus
        assertEquals(15, stack.size(), "La taille doit être 15 après 15 ajouts");
        assertEquals(14, stack.peek(), "L'élément au sommet doit être 14");

        // Retrait des éléments et vérification des valeurs
        for (int i = 14; i >= 0; i--) {
            assertEquals(i, stack.pop(), "Le retrait doit retourner les éléments dans l'ordre inverse");
        }

        // Vérification que la pile est vide après tous les retraits
        assertTrue(stack.isEmpty(), "La pile doit être vide après tous les retraits");
    }

    @Test
    void testPopOnEmptyStack() {
        // Création d'une pile vide
        Stack stack = new Stack();

        // Tentative de retrait d'un élément d'une pile vide
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            stack.pop();
        });
        assertEquals("Stack is empty", exception.getMessage(), "Le message d'erreur doit être 'Stack is empty'");
    }

    @Test
    void testPeekOnEmptyStack() {
        // Création d'une pile vide
        Stack stack = new Stack();

        // Tentative d'accès au sommet d'une pile vide
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            stack.peek();
        });
        assertEquals("Stack is empty", exception.getMessage(), "Le message d'erreur doit être 'Stack is empty'");
    }
}
