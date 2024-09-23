package co.com.bancol.ejerciciosfor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PilaDeEjerciciosFor {

    //Ejercicio 1:
    //Imprime los números del 10 al 1:
    //Escribe un programa que utilice un bucle for para imprimir los números del 10 al 1 en orden descendente.
    public static void ejercicioUno() {
        System.out.println("EJERCICIO 1: Imprime los números del 10 al 1.");
        for (int i = 10; i > 0; i--) {
            System.out.printf("%d \n", i);
        }
    }

    //Ejercicio 2:
    //Imprime los números pares del 2 al 20:
    //Escribe un programa que utilice un bucle for para imprimir todos los números pares entre 2 y 20.
    public static void ejercicioDos() {
        System.out.println("EJERCICIO 2: imprime los números pares entre el 2 y el 20.");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d \n", i);
            }
        }
    }

    //    Ejercicio 3:
//    Imprime los números impares del 1 al 19:
//     Escribe un programa que utilice un bucle for para imprimir todos los números impares entre 1 y 19.
    public static void ejercicioTres() {
        System.out.println("EJERCICIO 3: imprime los números impares entre el 1 y el 19.");
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d \n", i);
            }
        }
    }

    //    Ejercicio 4:
//    Imprime la tabla de multiplicar del 5:
//    Escribe un programa que utilice un bucle for para imprimir la tabla de multiplicar del 5, desde 5x1 hasta 5x10.
    public static void ejercicioCuatro() {
        System.out.println("EJERCICIO 4: imprime la tabla de multiplicar del 5");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("5 * %d = %d \n", i, (i * 5));
        }
    }

    //    Ejercicio 5:
//    Imprime los primeros 10 números cuadrados:
//    Escribe un programa que utilice un bucle for para imprimir los primeros 10 números elevados al cuadrado (1², 2², 3², ...).
    public static void ejercicioCinco() {
        System.out.println("EJERCICIO 5: Imprime los primeros 10 números cuadrados.");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d^2 = %.0f \n", i, (Math.pow(i, 2)));
        }
    }

    //    Ejercicio 6:
//    Imprime los números del 1 al 10 y su doble:
//    Escribe un programa que utilice un bucle for para imprimir los números del 1 al 10 junto con su doble (por ejemplo:""1 - 2"", ""2 - 4"", ...).
    public static void ejercicioSeis() {
        System.out.println("EJERCICIO 6: Imprime los números del 1 al 10 y su doble.");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d - %d \n", i, (i * 2));
        }
    }

    //    Ejercicio7
//    Imprime los primeros 10 números en forma de lista:
//    Escribe un programa que utilice un bucle for para imprimir los primeros 10 números, cada uno en una línea diferente, con el formato: ""Número: X"".
    public static void ejercicioSiete() {
        System.out.println("EJERCICIO 7: Imprime los primeros 10 números en forma de lista.");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Número: %d \n", i);
        }
    }

    //    Ejercicio8
//    Suma de los primeros 10 números:
//    Escribe un programa que utilice un bucle for para calcular la suma de los primeros 10 números enteros (1+2+3+...+10).
    public static void ejercicioOcho() {
        System.out.println("EJERCICIO 8: Suma de los primeros 10 números.");
        int sumatoria = 0;
        for (int i = 0; i <= 10; i++) {
            sumatoria += i;
        }
        System.out.printf("La suma de los 10 primeros número es igual a %d.\n", sumatoria);
    }

    //    Ejercicio 9
//    Imprime una secuencia de asteriscos:
//    Escribe un programa que utilice un bucle for para imprimir 10 asteriscos en una sola línea (**********).
    public static void ejercicioNueve() {
        System.out.println("EJERCICIO 9: Imprime una secuencia de asteriscos (*).");
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }

    //    Ejercicio 10
//    Imprime los elementos de un array:
//    Escribe un programa que utilice un bucle for para imprimir todos los elementos de un array de números, uno por línea.
    public static void ejercicioDiez() {
        System.out.println("Ejercicio 10: Imprime los elementos de un array.");
        ArrayList<String> listaDeElementos = new ArrayList<>();
        listaDeElementos.add("Uno");
        listaDeElementos.add("Dos");
        listaDeElementos.add("Tres");
        listaDeElementos.add("Cuatro");
        listaDeElementos.add("Cinco");
        listaDeElementos.add("Seis");
        listaDeElementos.add("Siete");
        listaDeElementos.add("Ocho");
        listaDeElementos.add("Nueve");
        listaDeElementos.add("Diez");
        for (String elemento : listaDeElementos) {
            System.out.println(elemento);
        }
    }

    //    Ejercicio 11
//    Suma de los elementos de un array:
//    Escribe un programa que utilice un bucle for para calcular la suma de todos los elementos en un array de números.
    public static void ejercicioOnce() {
        System.out.println("Ejercicio 11: Suma los elementos de un array numérico.");
        ArrayList<Integer> listaDeElementos = new ArrayList<>();
        listaDeElementos.add(1);
        listaDeElementos.add(2);
        listaDeElementos.add(3);
        listaDeElementos.add(4);
        listaDeElementos.add(5);
        listaDeElementos.add(6);
        listaDeElementos.add(7);
        listaDeElementos.add(8);
        listaDeElementos.add(9);
        listaDeElementos.add(10);

        int sumatoria = 0;
        for (int elemento : listaDeElementos) {
            sumatoria += elemento;
        }
        System.out.printf("La sumatoria del array es: %d \n", sumatoria);
    }

    //    Ejercicio 12
//    Encuentra el número más grande en un array:
//    Escribe un programa que utilice un bucle for para encontrar y mostrar el número más grande en un array de números.
    public static void ejercicioDoce() {
        System.out.println("EJERCICIO 12: Encuentra el número más grande en un array numérico.");
        ArrayList<Integer> listaDeElementos = new ArrayList<>();
        listaDeElementos.add(1);
        listaDeElementos.add(5);
        listaDeElementos.add(3);
        listaDeElementos.add(15);
        listaDeElementos.add(8);
        listaDeElementos.add(6);
        listaDeElementos.add(2);
        listaDeElementos.add(20);
        listaDeElementos.add(9);
        listaDeElementos.add(10);

        int numeroMaximo = 0;
        for (int elemento : listaDeElementos) {
            if (elemento > numeroMaximo) {
                numeroMaximo = elemento;
            }
        }
        System.out.printf("El número máximo del array es: %d \n", numeroMaximo);
    }

    //    Ejercicio 13
//    Cuenta cuántos números son mayores que 10 en un array:
//    Escribe un programa que utilice un bucle for para contar cuántos números en un array son mayores que 10.
    public static void ejercicioTrece() {
        System.out.println("EJERCICIO 13: Cuenta cuántos números son mayores que 10 en un array.");
        ArrayList<Integer> listaDeElementos = new ArrayList<>();
        listaDeElementos.add(1);
        listaDeElementos.add(5);
        listaDeElementos.add(3);
        listaDeElementos.add(15);
        listaDeElementos.add(8);
        listaDeElementos.add(6);
        listaDeElementos.add(2);
        listaDeElementos.add(20);
        listaDeElementos.add(9);
        listaDeElementos.add(10);

        int conteo = 0;
        for (int elemento : listaDeElementos) {
            if (elemento > 10) {
                conteo++;
            }
        }
        System.out.printf("Hay %d número(s) mayor(es) a 10 en el array.\n", conteo);
    }

    //    Ejercicio 14
//    Imprime los números del 1 al 100, pero solo los múltiplos de 3:
//    Escribe un programa que utilice un bucle for para imprimir solo los números entre 1 y 100 que sean múltiplos de 3.
    public static void ejercicioCatorce() {
        System.out.println("EJERCICIO 14: Imprime los números del 1 al 100, pero solo los múltiplos de 3.");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.printf("%d \n", i);
            }
        }
    }

    //    Ejercicio 15
//    Reversa los elementos de un array:
//    Escribe un programa que utilice un bucle for para imprimir los elementos de un array en orden inverso.
    public static void ejercicioQuince() {
        System.out.println("EJERCICIO 15: Reversa los elementos de un array.");
        ArrayList<Integer> listaDeElementos = new ArrayList<>();
        listaDeElementos.add(1);
        listaDeElementos.add(2);
        listaDeElementos.add(3);
        listaDeElementos.add(4);
        listaDeElementos.add(5);
        listaDeElementos.add(6);
        listaDeElementos.add(7);
        listaDeElementos.add(8);
        listaDeElementos.add(9);
        listaDeElementos.add(10);

        for (int i = (listaDeElementos.size() - 1); i >= 0; i--) {
            System.out.println(listaDeElementos.get(i));
        }
    }

    //    Ejercicio 16
//    Imprime los primeros 10 números Fibonacci:
//    Escribe un programa que utilice un bucle for para imprimir los primeros 10 números de la secuencia de Fibonacci.
    public static void ejercicioDieciseis() {
        System.out.println("EJERCICIO 16: Imprime los primeros 10 números Fibonacci.");
        int numeroAuxiliarUno = 0;
        int numeroAuxiliarDos = 1;
        int sumatoria;
        for (int i = 1; i <= 10; i++) {
            sumatoria = numeroAuxiliarUno + numeroAuxiliarDos;
            numeroAuxiliarUno = numeroAuxiliarDos;
            numeroAuxiliarDos = sumatoria;
            System.out.printf("%d \n", sumatoria);
        }
    }

    //    Ejercicio 17
//    Imprime las letras de una palabra:
//    Escribe un programa que utilice un bucle for para imprimir cada letra de una palabra (string) en una línea diferente.
    public static void ejercicioDiecisiete() {
        System.out.println("EJERCICIO 17: Imprime las letras de una palabra.");
        String palabraParaDeletrear = "BANCOLOMBIA";
        for (int i = 0; i < palabraParaDeletrear.length(); i++) {
            System.out.printf("%c \n", palabraParaDeletrear.charAt(i));
        }
    }

    //    Ejercicio 18
//    Convierte todos los elementos de un array a mayúsculas:
//    Escribe un programa que utilice un bucle for para recorrer un array de strings y convertir cada elemento a mayúsculas.
    public static void ejercicioDieciocho() {
        System.out.println("EJERCICIO 18: Convierte todos los elementos de un array a mayúsculas.");
        ArrayList<String> listaDeElementos = new ArrayList<>();
        listaDeElementos.add("m");
        listaDeElementos.add("i");
        listaDeElementos.add("n");
        listaDeElementos.add("u");
        listaDeElementos.add("s");
        listaDeElementos.add("c");
        listaDeElementos.add("u");
        listaDeElementos.add("l");
        listaDeElementos.add("a");
        listaDeElementos.add("s");

        for (int i = 0; i < listaDeElementos.size(); i++) {
            listaDeElementos.set(i, listaDeElementos.get(i).toUpperCase());
        }
        for (String elemento : listaDeElementos) {
            System.out.printf("%s", elemento);
        }
        System.out.print("\n");
    }

    //    Ejercicio 19
//  Crea un patrón de pirámide con asteriscos:
//  Escribe un programa que utilice un bucle for para crear una pirámide de asteriscos como la siguiente:
//  *
//  **
//  ***
//  ****
//  *****
    public static void ejercicioDiecinueve(int tamanioDeLaPiramide){
        System.out.println("EJERCICIO 19: Crea un patrón de pirámide con asteriscos.");
        for (int i = 0; i < tamanioDeLaPiramide; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    //    Ejercicio 20
//  Verifica si un array contiene un número específico:
//  Escribe un programa que utilice un bucle for para verificar si un array contiene un número específico. Si el número está presente, imprime "Encontrado"; de lo contrario, imprime "No encontrado".
    public static void ejercicioVeinte(int numeroABuscar) {
        System.out.println("EJERCICIO 20: Verifica si un array contiene un número específico.");
        ArrayList<Integer> listaDeElementos = new ArrayList<>();
        listaDeElementos.add(1);
        listaDeElementos.add(12);
        listaDeElementos.add(123);
        listaDeElementos.add(23);
        listaDeElementos.add(32);
        listaDeElementos.add(321);
        listaDeElementos.add(13);
        listaDeElementos.add(21);

        boolean numeroEncontrado = false;

        for (int listaDeElemento : listaDeElementos) {
            if (listaDeElemento == numeroABuscar) {
                numeroEncontrado = true;
                break;
            }
        }

        if (numeroEncontrado){
            System.out.println("Encontrado");
        } else {
            System.out.println("No encontrado");
        }
    }

    //    Ejercicio 21
//  Imprime los elementos en posiciones impares de un array:
//  Escribe un programa que utilice un bucle for para imprimir los elementos que están en posiciones impares de un array.
    public static void ejercicioVeintiuno(int... listaDeNumeros) {
        System.out.println("EJERCICIO 21: Imprime los elementos en posiciones impares de un array.");
        ArrayList<Integer> listaDeElementos = new ArrayList<>();
        for (Integer numero : listaDeNumeros) {
            listaDeElementos.add(numero);
        }

        for (int i = 0; i < listaDeElementos.size(); i++) {
            if (i % 2 != 0) {
                System.out.printf("Elemento %d= %d \n", i, listaDeElementos.get(i));
            }
        }
    }

    //    Ejercicio 22
//  Calcula el promedio de un array de números:
//  Escribe un programa que utilice un bucle for para calcular el promedio de todos los números en un array.
    public static void ejercicioVeintidos(int... numerosAPromediar) {
        System.out.println("EJERCICIO 22: Calcula el promedio de un array de números.");
        int sumatoria = 0;

        for (Integer numero : numerosAPromediar) {
            sumatoria += numero;
        }
        System.out.printf("Promedio = %d \n", (sumatoria / numerosAPromediar.length));

    }

    //    Ejercicio 23
//  Cuenta cuántos elementos en un array son strings.
//  Escribe un programa que utilice un bucle for para contar cuántos elementos en un array son de tipo string.
    public static void ejercicioVeintitres(Object... objetos){
        System.out.println("EJERCICIO 23: Cuenta cuántos elementos en un array son strings.");
        int conteoDeStrings = 0;

        for (Object objeto : objetos) {
            if (objeto instanceof String) {
                conteoDeStrings++;
            }
        }
        System.out.printf("Hay un total de %d strings en el arreglo.", conteoDeStrings);
    }


    //    Ejercicio 24
//  Concatena todos los elementos de un array en un solo string:
//  Escribe un programa que utilice un bucle for para concatenar todos los elementos de un array en un solo string, separado por comas.
    public static void ejercicioVenticuatro(String... listaDeStrings){
        System.out.println("EJERCICIO 24: Concatena todos los elementos de un array en un solo string.");
        for (int i = 0; i < listaDeStrings.length; i++) {
            System.out.printf("%s",listaDeStrings[i]);
            if (i < listaDeStrings.length-1){
                System.out.print(",");
            }
        }
        System.out.print("\n");
    }

    //    Ejercicio 25
//  Crea un patrón de pirámide invertida con asteriscos:
//  Escribe un programa que utilice un bucle for para crear una pirámide invertida de asteriscos como la siguiente:
//  *****
//  ****
//  ***
//  **
//  *
    public static void ejercicioVenticinco(int tamanioDeLaPiramide){
        System.out.println("EJERCICIO 25: Crea un patrón de pirámide invertida con asteriscos.");
        for (int i = tamanioDeLaPiramide; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    //    Ejercicio 26
//  Convierte un array de strings a un array de números:
//  Escribe un programa que utilice un bucle for para convertir un array de strings que representan números (por ejemplo, ["1", "2", "3"]) en un array de números (por ejemplo, [1, 2, 3]).
    public static void ejercicioVeintiseis(String... listaDeNumerosEnTexto){
        System.out.println("EJERCICIO 26: Convierte un array de strings a un array de números.");
        List<Integer> listaDeNumeros = new ArrayList<>();
        for (String numeroEnTexto : listaDeNumerosEnTexto) {
            listaDeNumeros.add(Integer.parseInt(numeroEnTexto));
        }
        System.out.println(listaDeNumeros);
    }

    //    Ejercicio 27
//  Filtra los números mayores a 50 en un array:
//  Escribe un programa que utilice un bucle for para filtrar todos los números mayores a 50 de un array y los almacene en un nuevo array.   Escribe un programa que utilice un bucle for para recorrer un array de strings y convertir cada elemento a mayúsculas.
    public static void ejercicioVeintisiete(Integer... listaDeNumerosAFiltrar){
        System.out.println("EJERCICIO 27: Convierte un array de strings a un array de números.");
        System.out.println("Lista de números a filtrar: " + Arrays.toString(listaDeNumerosAFiltrar));
        List<Integer> listaDeNumerosFiltrados = new ArrayList<>();
        for (Integer numeroAFiltrar : listaDeNumerosAFiltrar) {
            if (numeroAFiltrar > 50) {
                listaDeNumerosFiltrados.add(numeroAFiltrar);
            }
        }
        System.out.println("Numeros filtrados: " + listaDeNumerosFiltrados);
    }

    //    Ejercicio 28
//  Ordena un array de números de menor a mayor:
//  Escribe un programa que utilice un bucle for (sin utilizar métodos de ordenación integrados) para ordenar un array de números de menor a mayor.
    public static void ejercicioVeintiocho(Integer... listaDeNumerosAOrdenar){
        System.out.println("EJERCICIO 28: Ordena un array de números de menor a mayor.");
        System.out.println("Lista de números a ordenar: " + Arrays.toString(listaDeNumerosAOrdenar));
        for (int i = 0; i < listaDeNumerosAOrdenar.length - 1; i++) {
            for (int j = 0; j < listaDeNumerosAOrdenar.length - 1 - i; j++) {
                if (listaDeNumerosAOrdenar[j] > listaDeNumerosAOrdenar[j + 1]) {
                    int numeroAuxiliar = listaDeNumerosAOrdenar[j];
                    listaDeNumerosAOrdenar[j] = listaDeNumerosAOrdenar[j + 1];
                    listaDeNumerosAOrdenar[j + 1] = numeroAuxiliar;
                }
            }
        }
        System.out.println("Lista de números ordenados: " + Arrays.toString(listaDeNumerosAOrdenar));
    }

    //    Ejercicio 29
//  Imprime la matriz transpuesta de una matriz 2D:
//  Escribe un programa que utilice un bucle for para imprimir la matriz transpuesta de una matriz 2D (array de arrays).
//  Matriz 2D de entrada
//  let matriz =
//  [1, 2, 3],
//  [4, 5, 6],
//  [7, 8, 9]
//  Matriz Transpuesta =
//  [1, 4, 7],
//  [2, 5, 8],
//  [3, 6, 9]

    public static void ejercicioVeintinueve(int[][] matriz){
        System.out.println("EJERCICIO 29: Imprime la matriz transpuesta de una matriz 2D.");
        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }

        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("]");
        }
    }

    //    Ejercicio 30
//  Verifica si un array es palíndromo:
//  Escribe un programa que utilice un bucle for para verificar si un array de números o letras es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda).
    public static void ejercicioTreinta(char[] palabraPalindroma){
        System.out.println("EJERCICIO 30: Verifica si un array es palíndromo.");
        int longitud = palabraPalindroma.length;

        for (int i = 0; i < longitud / 2; i++) {
            if (palabraPalindroma[i] != palabraPalindroma[longitud - 1 - i]) {
                System.out.println(Arrays.toString(palabraPalindroma) + " no es palindroma.");
            }
        }
        System.out.println(Arrays.toString(palabraPalindroma) + " es palindroma.");
    }

    //    Ejercicio 31
//  Encuentra el segundo número más grande en un array:
//  Escribe un programa que utilice un bucle para encontrar el segundo número más grande en un array de números.

    public static void ejercicioTreintaYUno(Integer... listaDeNumeros){
        System.out.println("EJERCICIO 31: Encuentra el segundo número más grande en un array.");
        System.out.println("Lista de numeros a evaluar: " + Arrays.toString(listaDeNumeros));
        int mayor = 0;
        int segundoMayor = 0;
        for (int i = 0; i < listaDeNumeros.length; i++) {
            if (listaDeNumeros[i] > mayor) {
                segundoMayor = mayor;
                mayor = listaDeNumeros[i];
            } else if (listaDeNumeros[i] > segundoMayor && listaDeNumeros[i] != mayor) {
                segundoMayor = listaDeNumeros[i];
            }
        }
        System.out.printf("El segundo número mayor es %d. \n", segundoMayor);
    }

    //    Ejercicio 32
//  Imprime los factores de un número dado:
//  Escribe un programa que utilice un bucle for para imprimir todos los factores de un número dado.
    public static void ejercicioTreintaYDos(int numeroFactorizar){
        System.out.println("EJERCICIO 32: Imprime los factores de un número dado.");
        System.out.println("Los factores de " + numeroFactorizar + " son:");

        for (int i = 1; i <= numeroFactorizar; i++) {
            if (numeroFactorizar % i == 0) {
                System.out.println("* " + i);
            }
        }
    }

    //    Ejercicio 33
//  Calcula el factorial de un número:
//  Escribe un programa que utilice un bucle for para calcular el factorial de un número dado.
    public static void ejercicioTreintaYTres(int factorialDelNumero){
        System.out.println("EJERCICIO 33: Calcula el factorial de un número.");
        int resultadoFactorial = 1;
        for (int i = 1; i <= factorialDelNumero; i++) {
            resultadoFactorial = resultadoFactorial * i;
        }
        System.out.println("El factorial de " + factorialDelNumero + " es: " + resultadoFactorial);

    }

    //    Ejercicio 34
//  Crea un patrón de triángulo de números:
//  Escribe un programa que utilice un bucle for para crear un triángulo de números como el siguiente:
//  1
//  22
//  333
//  4444
//  55555
    public static void ejercicioTreintaYCuatro(int tamanioDelTriangulo){
        System.out.println("EJERCICIO 34: Crea un patrón de triángulo de números.");
        for (int i = 0; i < tamanioDelTriangulo; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i+1);
            }
            System.out.printf("\n");
        }
    }

    //    Ejercicio 35
//  Crea un array con los números primos del 1 al 100:
//  Escribe un programa que utilice un bucle for para encontrar y almacenar todos los números primos entre 1 y 100 en un array.
    public static void ejercicioTreintaYCinco(){
        System.out.println("EJERCICIO 35: Crea un array con los números primos del 1 al 100.");
        List<Integer> numerosPrimos = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            int conteoFactores = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    conteoFactores++;
                }
            }
            if (conteoFactores == 2){
                numerosPrimos.add(i);
            }
        }
        System.out.println(numerosPrimos);
    }

    //    Ejercicio 36
//  Imprime los primeros 10 números perfectos:
//  Escribe un programa que utilice un bucle for para imprimir los primeros 10 números perfectos (números que son iguales a la suma de sus divisores propios).
   public static void ejercicioTreintaYSeis(){
       System.out.println("EJERCICIO 36: Imprime los primeros 10 números perfectos.");
       List<Integer> numerosPerfectos = new ArrayList<>();
       int numeroFactorizar = 1;
       int cantidadNumerosAEncontrar = 3;
       do {
           int sumaDeDivisores = 0;
           for (int i = 1; i < numeroFactorizar; i++) {
               if (numeroFactorizar % i == 0) {
                   sumaDeDivisores += i;
               }
           }
           if (sumaDeDivisores == numeroFactorizar){
               numerosPerfectos.add(numeroFactorizar);
           }
           numeroFactorizar++;
       }while (numerosPerfectos.size() < cantidadNumerosAEncontrar);

       System.out.println("Los primeros " + cantidadNumerosAEncontrar + " números perfectos son: " + numerosPerfectos);
   }

    //    Ejercicio 37
//  Suma de matrices 2D:
//  Escribe un programa que utilice bucles for anidados para sumar dos matrices 2D del mismo tamaño.
    public static void ejercicioTreintaYSiete(int[][] matrizUno, int[][] matrizDos){
        System.out.println("EJERCICIO 37: Suma de matrices 2D.");
        if (matrizUno.length != matrizDos.length){
            throw new RuntimeException("Las matrices tienen tañanos diferentes");
        }
        int[][] matrizResultado = new int[matrizUno.length][matrizDos.length];
        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizUno.length; j++) {
                matrizResultado[i][j] = matrizUno[i][j] + matrizDos[i][j];
            }
        }

        System.out.println(Arrays.deepToString(matrizResultado));
    }

    //    Ejercicio 38
//  Multiplicación de matrices 2D:
//  Escribe un programa que utilice bucles for anidados para multiplicar dos matrices 2D
        public static void ejercicioTreintaYOcho(int[][] matrizUno, int[][] matrizDos){
        System.out.println("EJERCICIO 38: Multiplicación de matrices 2D.");
        if (matrizUno.length != matrizDos.length){
            throw new RuntimeException("Las matrices tienen tamaños diferentes");
        }
        int tamanioMatriz = matrizUno.length;
        int[][] matrizResultado = new int[tamanioMatriz][tamanioMatriz];

            for (int i = 0; i < tamanioMatriz; i++) {
                for (int j = 0; j < tamanioMatriz; j++) {
                    for (int k = 0; k < tamanioMatriz; k++) {
                        matrizResultado[i][j] += matrizUno[i][k] * matrizDos[k][j];
                    }
                }
            }
            System.out.println(Arrays.deepToString(matrizResultado));
    }

    //    Ejercicio 39
//  Crea un patrón de triángulo de números:
//  Escribe un programa que utilice un bucle for para crear un triángulo de números como el siguiente:
//  1
//  12
//  333
//  1234
//  55555
    public static void ejercicioTreintaYNueve(int tamanioDelTriangulo){
        System.out.println("EJERCICIO 34: Crea un patrón de triángulo de números.");
        for (int i = 0; i < tamanioDelTriangulo; i++) {
            for (int j = 0; j <= i; j++) {
                if(i%2 != 0){
                    System.out.print(j+1);
                }else {
                    System.out.print(i+1);
                }

            }
            System.out.printf("\n");
        }
    }

}
