package com.ejemplo;

/**
 * Interfaz que define las operaciones básicas de una lista.
 *
 * @param <T> el tipo de elementos que contendrá la lista
 */
public interface IList<T> {

    /**
     * Agrega un elemento al principio de la lista.
     *
     * @param item el elemento a ser agregado
     */
    void addFirst(T item);

    /**
     * Elimina y devuelve el primer elemento de la lista.
     *
     * @return el primer elemento eliminado de la lista
     */
    T removeFirst();

    /**
     * Devuelve el primer elemento de la lista sin eliminarlo.
     *
     * @return el primer elemento de la lista
     */
    T front();

    /**
     * Verifica si la lista está vacía.
     *
     * @return true si la lista está vacía, false de lo contrario
     */
    boolean isEmpty();
}
