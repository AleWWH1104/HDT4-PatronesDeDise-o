package com.ejemplo;

public class SinglyList<T> implements IList<T> {
    private class Node<T> {
        T data;
        Node<T> next;

        Node(T cdata) {
            this.data = cdata;
            this.next = null;
        }
    }
    private Node<T> head;

    public SinglyList() {
        this.head = null;
    }

    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = head;
        head = newNode;
    }

    @Override
    public void add(T item) {
        Node<T> newNode = new Node<T>(item);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La lista está vacía");
        }
        T data = head.data;
        head = head.next;
        return data;
    }
    @Override
    public void remove(T item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La lista está vacía");
        }
        return head.data;     
    }

    @Override
    public boolean isEmpty() {
        return head == null;    
    }
    
}
