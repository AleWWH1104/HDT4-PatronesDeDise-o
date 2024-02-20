package com.ejemplo;

public interface IStack <T>{
    void push(T item);
    T pop();
    T peek();
    public boolean isEmpty();
} 
