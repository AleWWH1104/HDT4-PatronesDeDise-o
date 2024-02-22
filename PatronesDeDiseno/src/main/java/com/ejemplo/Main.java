package com.ejemplo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;
import java.io.File;

public class Main<T> {
    public static String leerNotacion() {
        try {
            String filePath = "datos.txt";
            File file = new File(filePath);

            if (!file.exists()) {
                System.out.println("El archivo " + filePath + " no existe en la carpeta actual.");
                return "";
            }

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String line;
                StringBuilder notacionBuilder = new StringBuilder();
                while ((line = bufferedReader.readLine()) != null) {
                    notacionBuilder.append(line);
                }

                String notacion = notacionBuilder.toString().replaceAll("\\s+", "");

                if (notacion.isEmpty()) {
                    System.out.println("El archivo está vacío.");
                    return ""; // Devuelve una cadena vacía en caso de archivo vacío
                } else {
                    return notacion;
                }
            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return "";
        }
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackFactory<Integer> stackFactory = new StackFactory<>();
        StackFactory<Integer> stack;

        System.out.println("Elija el tipo de stack que desea utilizar:");
        System.out.println("1. ArrayList");
        System.out.println("2. Vector");
        System.out.println("3. Lista ");

        String stackOp = scanner.nextLine();

        if (stackOp.equals("3")){
            stack.createStack("3");
        }else{

            stack.createStack(stackOp);
            if (stack == null) {
                System.out.println("Opción no válida.");
                return;
            }
        }


        InfixConvert<Character> converter = new InfixConvert<>();
        String infixExpression = leerNotacion();
        String postfixExpression = converter.infixToPostfix(infixExpression);
        System.out.println("Infix: " + infixExpression);
        System.out.println("Postfix: " + postfixExpression);

        PostfixCalc calcularPost = new PostfixCalc<>();
        calcularPost.poFixcalc(postfixExpression, stack);
    }
}
