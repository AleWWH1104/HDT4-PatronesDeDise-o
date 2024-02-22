package com.ejemplo;
import static org.junit.Assert.*;
import org.junit.Test;

public class DoublyListTest {

    @Test
    public void testIsEmpty() {
        DoublyList<Integer> doublyList = new DoublyList<>();
        assertTrue(doublyList.isEmpty());

        doublyList.addFirst(1);
        assertFalse(doublyList.isEmpty());

        doublyList.removeFirst();
        assertTrue(doublyList.isEmpty());
    }

    @Test
    public void testAddFirstAndRemoveFirst() {
        DoublyList<String> doublyList = new DoublyList<>();
        assertTrue(doublyList.isEmpty());

        doublyList.addFirst("Hello");
        assertFalse(doublyList.isEmpty());

        doublyList.addFirst("World");
        assertEquals("World", doublyList.removeFirst());
        assertEquals("Hello", doublyList.removeFirst());
        assertTrue(doublyList.isEmpty());
    }

    @Test(expected = IllegalStateException.class)
    public void testRemoveFirstEmptyList() {
        DoublyList<Double> doublyList = new DoublyList<>();
        assertTrue(doublyList.isEmpty());

        doublyList.removeFirst(); // Esto debería lanzar IllegalStateException
    }

    @Test
    public void testFront() {
        DoublyList<Character> doublyList = new DoublyList<>();
        assertNull(doublyList.front());

        doublyList.addFirst('a');
        assertEquals(Character.valueOf('a'), doublyList.front());

        doublyList.addFirst('b');
        assertEquals(Character.valueOf('b'), doublyList.front());

        doublyList.removeFirst();
        assertEquals(Character.valueOf('a'), doublyList.front());
    }
}
