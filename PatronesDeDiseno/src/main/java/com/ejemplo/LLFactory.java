package com.ejemplo;
/**
 * Fábrica para crear instancias de listas enlazadas.
 *
 * @param <T> el tipo de elementos que contendrán las listas enlazadas
 */
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
