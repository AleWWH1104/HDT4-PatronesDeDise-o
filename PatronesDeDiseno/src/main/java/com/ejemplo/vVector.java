package com.ejemplo;
import java.util.Vector;

public class vVector<T> implements IStack<T> {

    Vector<T> vec = null;

    public vVector(){
        vec = new Vector<T>();
    }
    @Override
    public void push(T item) {

        vec.addElement(item);
    }

    @Override
    public T pop() {
        T e = vec.elementAt(vec.size() - 1);
        vec.removeElement(vec.size() - 1);
        return e;
    }

    @Override
    public T peek() {
        return vec.elementAt(vec.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return vec.size()==0;
    }
    
}
