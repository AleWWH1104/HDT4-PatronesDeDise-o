package com.ejemplo;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Test;

public class arraylistTest {

    @Test
    public void testPushAndPop() {
        aArrayList<Integer> stack = new aArrayList<>();
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
        aArrayList<String> stack = new aArrayList<>();
        assertTrue(stack.isEmpty());

        stack.push("Hello");
        assertEquals("Hello", stack.peek());
        assertFalse(stack.isEmpty());
    }

    @Test(expected = EmptyStackException.class)
    public void testPeekEmptyStack() {
        aArrayList<Double> stack = new aArrayList<>();
        assertTrue(stack.isEmpty());

        stack.peek(); // This should throw EmptyStackException
    }

    @Test
    public void testIsEmpty() {
        aArrayList<Character> stack = new aArrayList<>();
        assertTrue(stack.isEmpty());

        stack.push('a');
        assertFalse(stack.isEmpty());

        stack.pop();
        assertTrue(stack.isEmpty());
    }
}
