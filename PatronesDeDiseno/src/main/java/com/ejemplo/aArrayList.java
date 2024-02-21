package com.ejemplo;
import java.util.ArrayList;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }

    @Override
    public boolean isEmpty() {
        return arr.isEmpty();
    }
    
}
