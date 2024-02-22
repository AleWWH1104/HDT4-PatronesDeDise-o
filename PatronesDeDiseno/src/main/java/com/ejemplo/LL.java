package com.ejemplo;

public class LL<T> implements IStack<T> {

    IList<T> lista = null;

    public LL(String type) {
        LLFactory<T> tmp = new LLFactory<>();
        lista = tmp.createLList(type);
    }

    @Override
    public void push(T item) {
        // Agrega al principio de la lista (simulando push en una pila)
        lista.addFirst(item);
    }

    @Override
    public T pop() {
        // Elimina y devuelve el primer elemento (simulando pop en una pila)
        if (isEmpty()) {
            throw new UnsupportedOperationException("Cannot pop from an empty stack");
        }
        return lista.removeFirst();
    }

    @Override
    public T peek() {
        // Devuelve el primer elemento sin eliminarlo (simulando peek en una pila)
        if (isEmpty()) {
            throw new UnsupportedOperationException("Cannot peek an empty stack");
        }
        return lista.front();
    }

    @Override
    public boolean isEmpty() {
        return lista.isEmpty();
    }
}
