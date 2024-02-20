package com.ejemplo;

import java.util.Scanner;

public class StackFactory<T> {
    Scanner scanner = new Scanner(System.in);

    public IStack<T> createStack(String type) {
        switch (type) {
            case "1":
                return new ArrayList<T>();
            case "2":
                return new Vector<T>();
            case "3":
                return createLList();
            default:
                return null;
        }
    }

    public IList<T> createLList(String type) {
        switch (type){
            case "sl":
                return new SinglyList<T>();
            case "dl":
                return new DoublyList<T>();
            default:
                return null;
        }
    }
    
}
