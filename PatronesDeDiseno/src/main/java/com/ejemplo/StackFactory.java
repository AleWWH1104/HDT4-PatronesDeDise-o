package com.ejemplo;

import java.util.Scanner;

public class StackFactory<T> {
    Scanner scanner = new Scanner(System.in);

    public IStack<T> createStack(String type) {
        switch (type) {
            case "1":
                return new aArrayList<T>();
            case "2":
                return new vVector<T>();
            case "3":
                System.out.println("Elija tipo de lista\n1.Singly List\n2.Doubly List");
                String opList = scanner.nextLine();
                if (opList.equals("1")){
                    return new LL<T>("sl");
                } else if (opList.equals("2")){
                    return new LL<T>("dl");
                }else{
                    return null;
                }
            default:
                return null;
        }
    }

    
    
}
