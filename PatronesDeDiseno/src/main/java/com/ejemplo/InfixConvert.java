package com.ejemplo;

import java.util.Stack;

public class InfixConvert<T> {
    
    private Stack<T> stack;

    public InfixConvert() {
        stack = new Stack<>();
        
    }

    public String infixToPostfix(String infixExpression) {
        StringBuilder postfix = new StringBuilder();
        
        for (char ch : infixExpression.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            } else if (ch == '(') {
                stack.push((T) Character.valueOf(ch));
            } else if (ch == '^') {
                stack.push((T) Character.valueOf(ch));
            } else if (ch == ')') {
                while (!stack.isEmpty() && !isOpeningParenthesis(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Pop the opening parenthesis
            } else {
                // Operator
                while (!stack.isEmpty() && getPrecedence(ch) <= getPrecedenceT(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push((T) Character.valueOf(ch));
            }
        }

        while (!stack.isEmpty() && !isSpecialCharacter(stack.peek())) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    private boolean isOpeningParenthesis(T c) {
        return c.equals((T) Character.valueOf('('));
    }

    private boolean isSpecialCharacter(T c) {
        return c.equals((T) Character.valueOf('#'));
    }

    private int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1; // For operands
        }
    }

    private int getPrecedenceT(T operator) {
        char op = (Character) operator;
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1; // For operands
        }
    }
    
    public static void main(String[] args) {
        InfixConvert<Character> converter = new InfixConvert<>();
        String infixExpression = "(1+2)*7";
        String postfixExpression = converter.infixToPostfix(infixExpression);
        System.out.println("Infix: " + infixExpression);
        System.out.println("Postfix: " + postfixExpression);
    }
    
    
}
