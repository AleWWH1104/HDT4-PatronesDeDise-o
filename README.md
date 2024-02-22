# HDT4-PatronesDeDiseño

Iris Ayala 23965, David Dominguez 23712

Descripción del Programa
El programa tiene como objetivo calcular el resultado de una expresión infix dada. Para ello, convierte la expresión a postfix y luego la evalúa. La expresión a evaluar se lee desde un archivo de texto llamado datos.txt.
Tener en cuenta que si no detecta el archivo "datos.txt", puede ser por la ruta relativa del archivo, aunque no deberia suceder.

Ejemplo de Uso
Por ejemplo, para la expresión infix: (1+2)*9, se pasa a postfix (12+9*), el programa la evaluará y obtendrá como resultado 27.

Instrucciones de Ejecución
Al ejecutar el programa, se solicitará al usuario que elija el tipo de stack que desea utilizar:

ArrayList
Vector
Lista
Se utilizará el patrón de diseño Factory para seleccionar la implementación de la pila elegida.

Además, se implementa el patrón de diseño Singleton para garantizar que solo exista una instancia de la clase Calculadora, independiente de la interfaz de usuario que se utilice.

Diagrama UML de Clases

El diagrama UML muestra las clases utilizadas para la implementación de la pila y la lista, así como las relaciones entre ellas.
![Imagen de WhatsApp 2024-02-21 a las 22 08 02_a0ec9892](https://github.com/AleWWH1104/HDT4-PatronesDeDise-o/assets/84152698/f58fd7dd-7054-4fec-9c0b-c02af31de4f5)



Implementación de la Pila y la Lista
Pila
Se proporciona una interfaz de pila, una clase abstracta y tres implementaciones con las siguientes opciones:

ArrayList
Vector
Lista (seleccionando esta opción, se debe especificar la implementación de lista deseada)
Lista
Se proporciona una interfaz de lista, una clase abstracta y dos implementaciones con las siguientes opciones:

Simplemente Enlazada
Doblemente Enlazada

Clase Main
La clase Main sirve como punto de entrada principal del programa. Aquí se lleva a cabo la lectura de la expresión infix desde un archivo, se solicita al usuario el tipo de stack que desea utilizar, se realiza la conversión a postfix, y finalmente se evalúa la expresión postfix.
