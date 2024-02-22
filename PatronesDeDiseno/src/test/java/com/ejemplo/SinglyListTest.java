package com.ejemplo;

import static org.junit.Assert.*;
import org.junit.Test;

public class SinglyListTest {

    @Test
    public void testAddFirstAndRemoveFirst() {
        SinglyList<Integer> singlyList = new SinglyList<>();
        assertTrue(singlyList.isEmpty());

        singlyList.addFirst(1);
        assertFalse(singlyList.isEmpty());

        singlyList.addFirst(2);
        assertEquals(Integer.valueOf(2), singlyList.removeFirst());
        assertEquals(Integer.valueOf(1), singlyList.removeFirst());
        assertTrue(singlyList.isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemoveFirstEmptyList() {
        SinglyList<String> singlyList = new SinglyList<>();
        assertTrue(singlyList.isEmpty());

        singlyList.removeFirst(); // Esto debería lanzar UnsupportedOperationException
    }

    @Test
    public void testIsEmpty() {
        SinglyList<Double> singlyList = new SinglyList<>();
        assertTrue(singlyList.isEmpty());

        singlyList.addFirst(3.14);
        assertFalse(singlyList.isEmpty());

        singlyList.removeFirst();
        assertTrue(singlyList.isEmpty());
    }
}
