package com.ejemplo;

import java.util.Scanner;

public class StackFactory<T> {
    Scanner scanner = new Scanner(System.in);

    public IStack<T> createStack(String type) {
        switch (type) {
            case "1":
                return new aArrayList<T>();
            case "2":
                return new Vector<T>();
            case "3":
                System.out.println("Elija el tipo de lista que desea utilizar:");
                System.out.println("1. Lista simplemente encadenada");
                System.out.println("2. Lista doblemente encadenada");

                String listType = scanner.nextLine();

                return createLList(listType);
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
