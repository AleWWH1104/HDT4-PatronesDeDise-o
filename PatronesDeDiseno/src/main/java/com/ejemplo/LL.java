package com.ejemplo;

public class LL<T> implements IStack<T> {

    IList<T> lista = null;

    public LL(String type){
        LLFactory<T> tmp = new LLFactory<>();
        lista = tmp.createLList(type);
    }

    @Override
    public void push(T item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'push'");
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
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
        
    }
}
