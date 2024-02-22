package com.ejemplo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Main<T> {
    public static String leerNotacion() {
        try {
            String filePath = "/Users/alejandraayala/Desktop/EstructuraDatos/HDT4-PatronesDeDiseno/PatronesDeDiseno/src/main/datos.txt";
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
        System.out.println("Elija el tipo de stack que desea utilizar:");
        System.out.println("1. ArrayList");
        System.out.println("2. Vector");
        System.out.println("3. Lista ");
        String stackOp = scanner.nextLine();
        StackFactory<Integer> stackF = new StackFactory<>();
        IStack<Integer> stack = stackF.createStack(stackOp);
   
        InfixConvert<Character> converter = new InfixConvert<>();
        String infixExpression = leerNotacion();
        String postfixExpression = converter.infixToPostfix(infixExpression);
        System.out.println("Infix: " + infixExpression);
        System.out.println("Postfix: " + postfixExpression);

        PostfixCalc<Integer> calc = PostfixCalc.getInstance();
        Integer result = calc.poFixcalc(postfixExpression, stack);
        System.out.println("Resultado: " + result);
    }
}
