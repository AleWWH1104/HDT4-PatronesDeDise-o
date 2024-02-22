package com.ejemplo;

import java.util.EmptyStackException;

public class PostfixCalc<T extends Number> {
    private static PostfixCalc instance = null;

    /* Constructor */
    public PostfixCalc() {
    }

    /* Utilización de patrón de diseño Singleton */
    public static PostfixCalc getInstance() {
        if (instance == null) {
            instance = new PostfixCalc();
        }
        return instance;
    }

    public T poFixcalc(String notation, IStack<T> stack) {
        char[] characters = notation.toCharArray();

        try {
            for (char x : characters) {
                if (Character.isDigit(x)) {
                    stack.push((T) (Object) Integer.parseInt(String.valueOf(x)));
                } else {
                    T op2 = stack.pop();
                    T op1 = stack.pop();

                    switch (x) {
                        case '+':
                            stack.push((T) (Object) (op1.intValue() + op2.intValue()));
                            break;
                        case '-':
                            stack.push((T) (Object) (op1.intValue() - op2.intValue()));
                            break;
                        case '*':
                            stack.push((T) (Object) (op1.intValue() * op2.intValue()));
                            break;
                        case '/':
                            if (op2.intValue() == 0) {
                                throw new ArithmeticException("División por cero");
                            }
                            stack.push((T) (Object) (op1.intValue() / op2.intValue()));
                            break;
                        default:
                            throw new IllegalArgumentException("Operador no reconocido: " + x);
                    }
                }
            }
        } catch (EmptyStackException e) {
            System.err.println("Error: Operadores insuficientes en la pila.");
            return null;
        }

        return stack.pop();
    }
}
