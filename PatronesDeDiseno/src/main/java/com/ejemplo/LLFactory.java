package com.ejemplo;

public class LLFactory<T> {
    
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
