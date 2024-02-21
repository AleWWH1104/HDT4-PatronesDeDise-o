package com.ejemplo;

public class SinglyList<T> implements IList<T> {

    private class Node<T>{

        public T data;
        public Node<T> next = null;
        public Node(T cData){
            data = cData;
        }
    }

    private Node<T> head = null;
    

    @Override
    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = head;
        head = newNode;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("Lista vacia, no se puede remover nada");
        }

        T removedData = head.data;
        head = head.next;
        return removedData;
    }

    @Override
    public T front() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("Lista vacia, no se puede remover nada");
        }
        return head.data;
    }

    @Override
    public boolean isEmpty(){
        return (head == null);
    }
    
    
}
