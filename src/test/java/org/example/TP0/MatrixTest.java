package org.example.TP0;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatrixTest {

    @Test
    void testSetAndGet() {
        Matrix m = new Matrix(2);
        m.set(0, 1, 5);
        assertEquals(5, m.get(0, 1));
    }

    @Test
    void testAddMatrix() {
        Matrix a = new Matrix(2);
        Matrix b = new Matrix(2);

        a.set(0, 0, 1);
        a.set(0, 1, 2);
        a.set(1, 0, 3);
        a.set(1, 1, 4);

        b.set(0, 0, 5);
        b.set(0, 1, 6);
        b.set(1, 0, 7);
        b.set(1, 1, 8);

        a.add(b);

        assertEquals(6, a.get(0, 0));
        assertEquals(8, a.get(0, 1));
        assertEquals(10, a.get(1, 0));
        assertEquals(12, a.get(1, 1));
    }

    @Test
    void testMultiplyMatrix() {
        Matrix a = new Matrix(2);
        Matrix b = new Matrix(2);

        a.set(0, 0, 1); a.set(0, 1, 2);
        a.set(1, 0, 3); a.set(1, 1, 4);

        b.set(0, 0, 2); b.set(0, 1, 0);
        b.set(1, 0, 1); b.set(1, 1, 2);

        a.multiply(b);

        assertEquals(4, a.get(0, 0));  // 1*2 + 2*1
        assertEquals(4, a.get(0, 1));  // 1*0 + 2*2
        assertEquals(10, a.get(1, 0)); // 3*2 + 4*1
        assertEquals(8, a.get(1, 1));  // 3*0 + 4*2
    }

    @Test
    void testTranspose() {
        Matrix m = new Matrix(2);
        m.set(0, 0, 1);
        m.set(0, 1, 2);
        m.set(1, 0, 3);
        m.set(1, 1, 4);

        m.transpose();

        assertEquals(1, m.get(0, 0));
        assertEquals(3, m.get(0, 1));
        assertEquals(2, m.get(1, 0));
        assertEquals(4, m.get(1, 1));
    }

    @Test
    void testToString() {
        Matrix m = new Matrix(2);
        m.set(0, 0, 1);
        m.set(0, 1, 2);
        m.set(1, 0, 3);
        m.set(1, 1, 4);

        String expected = "[1, 2]\n[3, 4]\n";
        assertEquals(expected, m.toString());
    }

    @Test
    void testAddMatrixSizeMismatch() {
        Matrix a = new Matrix(2);
        Matrix b = new Matrix(3);

        assertThrows(IllegalArgumentException.class, () -> a.add(b));
    }

    @Test
    void testMultiplyMatrixNull() {
        Matrix a = new Matrix(2);
        assertThrows(NullPointerException.class, () -> a.multiply(null));
    }
}

