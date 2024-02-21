package com.ejemplo;

public class DoublyList<T> implements IList<T> {
    private class Node<T>{
        public T lista;
        public Node<T> next = null;
        public Node<T> prev = null;
        public Node(T cData){
            this.lista = cData;
            this.next = null;
            this.prev = null;
        }
    }
    public Node <T> head = null;
    public Node<T> tail = null;

    public DoublyList(){
        this.head = null;
        this.tail = null;
    }

    @Override
    public boolean isEmpty() {
        return (head == null);    
    }

    @Override
    public void addFirst(T item) {
        Node<T> newNode = new Node<T>(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }    
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("La lista está vacía");
        }
        T data = head.lista;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        return data;
    }

    @Override
    public T front() {
        if (head == null){
            return null;
        }
        return head.lista;
    }
}
