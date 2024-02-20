package com.ejemplo;

public class ArrayList<T> implements IStack <T>{

    ArrayList<T> arr = null;

    public ArrayList(){
        arr = new ArrayList<T>();
    }

    @Override
    public void push(T item) {
        
    }

    @Override
    public T pop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }

    @Override
    public T peek() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }
    
}
