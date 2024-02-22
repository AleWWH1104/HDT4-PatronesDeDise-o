package com.ejemplo;
/**
 * Implementación de una pila utilizando un vector.
 *
 * @param <T> el tipo de elementos que contendrá la pila
 */
public class vVector<T> implements IStack<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] vector;
    private int size;
    
    public vVector() {
        vector = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void push(T item) {
        ensureCapacity();
        vector[size++] = item;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("El vector está vacío");
        }
        T element = (T) vector[--size];
        vector[size] = null; // Limpiar referencia al elemento eliminado
        return element;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("El vector está vacío");
        }
        return (T) vector[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Asegura que el vector tiene suficiente capacidad para agregar elementos.
     * Si no, aumenta su capacidad.
     */
    private void ensureCapacity() {
        if (size == vector.length) {
            int newCapacity = vector.length * 2;
            vector = java.util.Arrays.copyOf(vector, newCapacity);
        }
    }
}