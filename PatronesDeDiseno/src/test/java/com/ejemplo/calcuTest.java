package com.ejemplo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class calcuTest {
@Test
    public void testPostfixCalc() {
        // Crear una instancia de la clase PostfixCalc
        PostfixCalc<Integer> calculator = PostfixCalc.getInstance();

        // Crear una instancia de la pila (puedes utilizar un ArrayList, Vector u otra implementación)
        IStack<Integer> stack = new aArrayList<>();

        // Definir la expresión postfix que deseas evaluar
        String postfixExpression = "58+";

        // Evaluar la expresión postfix
        Integer result = calculator.poFixcalc(postfixExpression, stack);

        // Verificar si el resultado es el esperado
        // Para la expresión "5 2 +" el resultado debería ser 7
        assertEquals(Integer.valueOf(13), result);
    }
    
}
