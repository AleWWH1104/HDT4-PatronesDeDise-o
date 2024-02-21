package com.ejemplo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main<T> {
    public static String leerNotacion() {
        try {
            FileReader fileReader = new FileReader("datos.txt"); // Nombre del archivo con la expresión postfix
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            StringBuilder notacionBuilder = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                notacionBuilder.append(line);
            }
            bufferedReader.close();

            String notacion = notacionBuilder.toString().replaceAll("\\s+", "");

            if (notacion.isEmpty()) {
                System.out.println("El archivo está vacío.");
                return ""; // Devuelve una cadena vacía en caso de archivo vacío
            } else {
                return notacion;
            }
        } catch (IOException e) {
            return ""; // Manejo básico de excepciones: devuelve una cadena vacía si hay un error de lectura
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackFactory<Integer> stackFactory = new StackFactory<>();

        System.out.println("Elija el tipo de stack que desea utilizar:");
        System.out.println("1. ArrayList");
        System.out.println("2. Vector");
        System.out.println("3. Lista ");

        String stackOp = scanner.nextLine();
        IStack<Integer> stack = stackFactory.createStack(stackOp);

        if (stack == null) {
            System.out.println("Opción no válida.");
            return;
        }

        // Si el usuario eligió la opción 3, se le pide que seleccione el tipo de lista.
        if (stackOp.equals("3")) {
            

            String listOp = scanner.nextLine();
            IList<Integer> list = stackFactory.createLList(listOp);

            if (list == null) {
                System.out.println("Opción no válida.");
                return;
            }
        }


    }
}
