package com.ejemplo;

public interface IList<T> {
    void addFirst(T item);
    T removeFirst();
    T front();
    boolean isEmpty();
}
