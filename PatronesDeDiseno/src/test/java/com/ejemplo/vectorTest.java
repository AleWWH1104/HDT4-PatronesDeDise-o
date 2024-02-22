package com.ejemplo;

import static org.junit.Assert.*;
import org.junit.Test;

public class vectorTest {

    @Test
    public void testPushAndPop() {
        vVector<Integer> stack = new vVector<>();
        assertTrue(stack.isEmpty());

        stack.push(1);
        assertFalse(stack.isEmpty());

        stack.push(2);
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(Integer.valueOf(1), stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        vVector<String> stack = new vVector<>();
        assertTrue(stack.isEmpty());

        stack.push("Hello");
        assertEquals("Hello", stack.peek());
        assertFalse(stack.isEmpty());
    }

    @Test(expected = IllegalStateException.class)
    public void testPopEmptyStack() {
        vVector<Double> stack = new vVector<>();
        assertTrue(stack.isEmpty());

        stack.pop(); // Esto debería lanzar IllegalStateException
    }

    @Test(expected = IllegalStateException.class)
    public void testPeekEmptyStack() {
        vVector<Double> stack = new vVector<>();
        assertTrue(stack.isEmpty());

        stack.peek(); // Esto debería lanzar IllegalStateException
    }

    @Test
    public void testIsEmpty() {
        vVector<Character> stack = new vVector<>();
        assertTrue(stack.isEmpty());

        stack.push('a');
        assertFalse(stack.isEmpty());

        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testEnsureCapacity() {
        vVector<Integer> stack = new vVector<>();
        assertTrue(stack.isEmpty());

        // Llenar el vector más allá de su capacidad inicial
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }

        assertEquals(Integer.valueOf(14), stack.pop());
        assertFalse(stack.isEmpty());
    }
}
