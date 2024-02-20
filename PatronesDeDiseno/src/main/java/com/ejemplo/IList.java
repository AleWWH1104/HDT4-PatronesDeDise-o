package com.ejemplo;

public interface IList<T> {
    void add(T item);
    void remove(T item);
    T get(int index);
}
