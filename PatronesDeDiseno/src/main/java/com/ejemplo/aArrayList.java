package com.ejemplo;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class aArrayList<T> implements IStack <T>{

    private ArrayList<T> arr = new ArrayList<>();

    public aArrayList(){
        arr = new ArrayList<T>();
    }

    @Override
    public void push(T item) {
        arr.add(item);
    }

    @Override
    public T pop() {
        return arr.remove(arr.size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arr.get(arr.size() - 1);}

    @Override
    public boolean isEmpty() {
        return (arr.size() == 0);
    }
    
}
