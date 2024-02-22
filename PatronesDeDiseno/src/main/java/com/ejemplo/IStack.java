package com.ejemplo;

/**
 * Interfaz que define las operaciones básicas de una pila.
 *
 * @param <T> el tipo de elementos que contendrá la pila
 */
public interface IStack<T> {

    /**
     * Agrega un elemento a la parte superior de la pila.
     *
     * @param item el elemento a ser agregado
     */
    void push(T item);

    /**
     * Elimina y devuelve el elemento en la parte superior de la pila.
     *
     * @return el elemento eliminado de la parte superior de la pila
     */
    T pop();

    /**
     * Devuelve el elemento en la parte superior de la pila sin eliminarlo.
     *
     * @return el elemento en la parte superior de la pila
     */
    T peek();

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false de lo contrario
     */
    boolean isEmpty();
}
